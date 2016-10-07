package com.rythmplugin.ide.reference.provider;

import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.*;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.psi.util.PropertyUtil;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.util.TypeConversionUtil;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.ide.reference.RythmJavFieldIdReferenceProvider;
import com.rythmplugin.imports.RythmJavConstants;
import com.rythmplugin.imports.RythmJavPropertyAttributeDescriptor;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavComponentIdReferenceProvider extends PsiReferenceProvider {

    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                 @NotNull ProcessingContext context) {
        final XmlAttributeValue xmlAttributeValue = (XmlAttributeValue)element;
        final String value = xmlAttributeValue.getValue();
        if (RythmJavPsiUtil.isIncorrectExpressionBinding(value)) {
            return PsiReference.EMPTY_ARRAY;
        }
        final XmlTag currentTag = PsiTreeUtil.getParentOfType(xmlAttributeValue, XmlTag.class);
        final Map<String, XmlAttributeValue> fileIds = RythmJavPsiUtil.collectFileIds(currentTag);

        if (RythmJavPsiUtil.isExpressionBinding(value)) {
            return getExpressionReferences(element, xmlAttributeValue, value, fileIds);
        }
        if (value.startsWith("$")) {
            return getSinglePropertyReferences(xmlAttributeValue, value, fileIds);
        }
        final Set<String> acceptableIds = new HashSet<String>();
        if (currentTag != null) {
            final XmlTag parentTag = currentTag.getParentTag();
            for (final String id : fileIds.keySet()) {
                final XmlAttributeValue resolvedAttrValue = fileIds.get(id);
                if (RythmJavPsiUtil.isClassAcceptable(parentTag, RythmJavPsiUtil.getTagClass(resolvedAttrValue))) {
                    acceptableIds.add(id);
                }
            }
        }
        return new PsiReference[]{new JavaFxIdReferenceBase(xmlAttributeValue, fileIds, acceptableIds, value)};
    }

    @NotNull
    private static PsiReference[] getExpressionReferences(@NotNull PsiElement element,
                                                          @NotNull XmlAttributeValue xmlAttributeValue,
                                                          @NotNull String value,
                                                          @NotNull Map<String, XmlAttributeValue> fileIds) {
        if (RythmJavConstants.NULL_EXPRESSION.equals(value)) return PsiReference.EMPTY_ARRAY;
        final String expressionBody = value.substring(2, value.length() - 1);
        final List<String> propertyNames = StringUtil.split(expressionBody, ".", true, false);
        if (RythmJavPropertyAttributeDescriptor.isIncompletePropertyChain(propertyNames)) return PsiReference.EMPTY_ARRAY;
        if (propertyNames.size() == 1) {
            return getSinglePropertyReferences(xmlAttributeValue, fileIds, expressionBody, 2);
        }

        final PsiClass controllerClass = RythmJavPsiUtil.getControllerClass(element.getContainingFile());
        final String firstPropertyName = propertyNames.get(0);
        int positionInExpression = 2;
        final List<PsiReference> result = new ArrayList<>();
        final PsiReferenceBase firstReference =
                getIdReferenceBase(xmlAttributeValue, firstPropertyName, fileIds, Collections.emptyMap(), controllerClass);
        positionInExpression = adjustTextRange(firstPropertyName, firstReference, positionInExpression);
        PsiClass propertyOwnerClass = RythmJavConstants.CONTROLLER.equals(firstPropertyName) ?
                controllerClass : RythmJavPsiUtil.getTagClass(fileIds.get(firstPropertyName));
        result.add(firstReference);

        final List<String> remainingPropertyNames = propertyNames.subList(1, propertyNames.size());
        for (String propertyName : remainingPropertyNames) {
            final JavaFxExpressionReferenceBase reference =
                    new JavaFxExpressionReferenceBase(xmlAttributeValue, propertyOwnerClass, propertyName);
            positionInExpression = adjustTextRange(propertyName, reference, positionInExpression);
            final PsiType propertyType = RythmJavPsiUtil.getReadablePropertyType(reference.resolve());
            propertyOwnerClass = propertyType instanceof PsiClassType ? ((PsiClassType)propertyType).resolve() : null;
            result.add(reference);
        }
        return result.toArray(PsiReference.EMPTY_ARRAY);
    }

    @NotNull
    private static PsiReference[] getSinglePropertyReferences(@NotNull XmlAttributeValue xmlAttributeValue,
                                                              @NotNull String value,
                                                              @NotNull Map<String, XmlAttributeValue> fileIds) {
        if (RythmJavConstants.isNullValue(value)) return PsiReference.EMPTY_ARRAY;
        return getSinglePropertyReferences(xmlAttributeValue, fileIds, value.substring(1), 1);
    }

    @NotNull
    private static PsiReference[] getSinglePropertyReferences(@NotNull XmlAttributeValue xmlAttributeValue,
                                                              @NotNull Map<String, XmlAttributeValue> fileIds,
                                                              @NotNull String propertyName,
                                                              int positionInExpression) {
        final PsiClass controllerClass = RythmJavPsiUtil.getControllerClass(xmlAttributeValue.getContainingFile());
        final Map<String, TypeMatch> typeMatches = getTypeMatches(xmlAttributeValue, fileIds);
        final PsiReferenceBase reference = getIdReferenceBase(xmlAttributeValue, propertyName, fileIds, typeMatches, controllerClass);
        adjustTextRange(propertyName, reference, positionInExpression);
        return new PsiReference[]{reference};
    }

    private static Map<String, TypeMatch> getTypeMatches(@NotNull XmlAttributeValue xmlAttributeValue,
                                                         @NotNull Map<String, XmlAttributeValue> fileIds) {
        final PsiClass targetPropertyClass = RythmJavPsiUtil.getWritablePropertyClass(xmlAttributeValue);
        final boolean isConvertible = targetPropertyClass != null && RythmJavPsiUtil.hasConversionFromAnyType(targetPropertyClass);

        return fileIds.entrySet().stream().collect(
                Collectors.toMap(Map.Entry::getKey, e -> {
                    final PsiClass valueClass = RythmJavPsiUtil.getTagClassById(e.getValue(), e.getKey(), xmlAttributeValue);
                    return TypeMatch.getMatch(valueClass, targetPropertyClass, isConvertible);
                }));
    }

    private static int adjustTextRange(@NotNull String propertyName, @NotNull PsiReferenceBase reference, int positionInExpression) {
        final TextRange range = reference.getRangeInElement();
        final int startOffset = range.getStartOffset() + positionInExpression;
        final int endOffset = startOffset + propertyName.length();
        reference.setRangeInElement(new TextRange(startOffset, endOffset));
        return positionInExpression + propertyName.length() + 1;
    }

    @NotNull
    private static PsiReferenceBase getIdReferenceBase(XmlAttributeValue xmlAttributeValue,
                                                       String referencesId,
                                                       Map<String, XmlAttributeValue> fileIds,
                                                       Map<String, TypeMatch> typeMatches,
                                                       PsiClass controllerClass) {
        if (controllerClass != null && !RythmJavConstants.CONTROLLER.equals(referencesId)) {
            final PsiField controllerField = controllerClass.findFieldByName(referencesId, false);
            if (controllerField != null) {
                return new RythmJavFieldIdReferenceProvider.JavaFxControllerFieldRef(xmlAttributeValue, controllerField, controllerClass);
            }
        }
        return new JavaFxIdReferenceBase(xmlAttributeValue, fileIds, typeMatches, referencesId);
    }

    private enum TypeMatch {
        ASSIGNABLE(3.0),
        CONVERTIBLE(2.0),
        UNDEFINED(1.0),
        INCOMPATIBLE(0.0);

        private final double myPriority;

        TypeMatch(double priority) {
            myPriority = priority;
        }

        public static double getPriority(TypeMatch match) {
            return match != null ? match.myPriority : 0.0;
        }

        @NotNull
        public static TypeMatch getMatch(PsiClass valueClass, PsiClass targetPropertyClass, boolean isConvertible) {
            if (valueClass == null || targetPropertyClass == null) return UNDEFINED;
            if (InheritanceUtil.isInheritorOrSelf(valueClass, targetPropertyClass, true)) return ASSIGNABLE;
            if (isConvertible) return CONVERTIBLE;
            return INCOMPATIBLE;
        }
    }

    public static class JavaFxIdReferenceBase extends PsiReferenceBase<XmlAttributeValue> {
        private final Map<String, XmlAttributeValue> myFileIds;
        private final Set<String> myAcceptableIds;
        private final Map<String, TypeMatch> myTypeMatches;
        private final String myReferencesId;

        private JavaFxIdReferenceBase(XmlAttributeValue element,
                                      Map<String, XmlAttributeValue> fileIds,
                                      Set<String> acceptableIds,
                                      String referencesId) {
            super(element);
            myFileIds = fileIds;
            myAcceptableIds = acceptableIds;
            myReferencesId = referencesId;
            myTypeMatches = Collections.emptyMap();
        }

        public JavaFxIdReferenceBase(XmlAttributeValue xmlAttributeValue,
                                     Map<String, XmlAttributeValue> fileIds,
                                     Map<String, TypeMatch> typeMatches,
                                     String referencesId) {
            super(xmlAttributeValue);
            myFileIds = fileIds;
            myTypeMatches = typeMatches;
            myReferencesId = referencesId;
            myAcceptableIds = myFileIds.keySet();
        }

        @Nullable
        @Override
        public PsiElement resolve() {
            return myFileIds.get(myReferencesId);
        }

        @NotNull
        @Override
        public Object[] getVariants() {
            return myAcceptableIds.stream()
                    .map(id -> PrioritizedLookupElement.withPriority(LookupElementBuilder.create(id), TypeMatch.getPriority(myTypeMatches.get(id))))
                    .toArray(LookupElement[]::new);
        }

        public boolean isBuiltIn() {
            return RythmJavConstants.CONTROLLER.equals(myReferencesId) || myReferencesId.endsWith(RythmJavConstants.CONTROLLER_SUFFIX);
        }
    }

    private static class JavaFxExpressionReferenceBase extends RythmJavPropertyReference<XmlAttributeValue> {
        private final String myFieldName;

        public JavaFxExpressionReferenceBase(@NotNull XmlAttributeValue xmlAttributeValue, PsiClass tagClass, @NotNull String fieldName) {
            super(xmlAttributeValue, tagClass);
            myFieldName = fieldName;
        }

        @Nullable
        @Override
        public PsiElement resolve() {
            return RythmJavPsiUtil.collectReadableProperties(myPsiClass).get(myFieldName);
        }

        @NotNull
        @Override
        public Object[] getVariants() {
            final XmlAttributeValue xmlAttributeValue = getElement();
            final PsiElement declaration = RythmJavPsiUtil.getAttributeDeclaration(xmlAttributeValue);
            final PsiType propertyType = RythmJavPsiUtil.getWritablePropertyType(myPsiClass, declaration);
            if (propertyType != null) {
                return collectProperties(propertyType, xmlAttributeValue.getProject());
            }
            return ArrayUtil.EMPTY_OBJECT_ARRAY;
        }

        private Object[] collectProperties(@NotNull PsiType propertyType, @NotNull Project project) {
            final PsiType resolvedType = RythmJavPsiUtil.getWritablePropertyType(propertyType, project);
            final List<LookupElement> objs = new ArrayList<>();
            final Collection<PsiMember> readableProperties = RythmJavPsiUtil.collectReadableProperties(myPsiClass).values();
            for (PsiMember readableMember : readableProperties) {
                final PsiType readableType = RythmJavPsiUtil.getReadablePropertyType(readableMember);
                if (readableType == null) continue;
                if (TypeConversionUtil.isAssignable(propertyType, readableType) ||
                        resolvedType != null && TypeConversionUtil.isAssignable(resolvedType, readableType)) {
                    final String propertyName = PropertyUtil.getPropertyName(readableMember);
                    if (propertyName != null) {
                        objs.add(LookupElementBuilder.create(readableMember, propertyName));
                    }
                }
            }
            return ArrayUtil.toObjectArray(objs);
        }

        @NotNull
        @Override
        public String getPropertyName() {
            return myFieldName;
        }

        @Override
        public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
            final String newPropertyName = RythmJavPsiUtil.getPropertyName(newElementName, resolve() instanceof PsiMethod);
            return super.handleElementRename(newPropertyName);
        }
    }
}
