package com.rythmplugin.ide.reference;

import com.intellij.codeInsight.daemon.QuickFixActionRegistrar;
import com.intellij.codeInsight.daemon.impl.quickfix.CreateMethodQuickFix;
import com.intellij.codeInsight.quickfix.UnresolvedReferenceQuickFixProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleSettingsManager;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.psi.util.TypeConversionUtil;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.ArrayUtil;
import com.intellij.util.VisibilityUtil;
import com.rythmplugin.imports.RythmJavCommonNames;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavEventHandlerReference extends PsiReferenceBase<XmlAttributeValue> {
    private final PsiMethod myEventHandler;
    private final PsiClass myController;

    public RythmJavEventHandlerReference(XmlAttributeValue element, final PsiMethod method, PsiClass controller) {
        super(element);
        myEventHandler = method;
        myController = controller;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return myEventHandler;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        if (myController == null) return EMPTY_ARRAY;
        final List<PsiMethod> availableHandlers = new ArrayList<PsiMethod>();
        for (PsiMethod psiMethod : myController.getAllMethods()) {
            if (isHandlerMethodSignature(psiMethod, myController) && RythmJavPsiUtil.isVisibleInFxml(psiMethod)) {
                availableHandlers.add(psiMethod);
            }
        }
        return availableHandlers.isEmpty() ? EMPTY_ARRAY : ArrayUtil.toObjectArray(availableHandlers);
    }

    public static boolean isHandlerMethodSignature(@NotNull PsiMethod psiMethod, @NotNull PsiClass controllerClass) {
        final PsiClass containingClass = psiMethod.getContainingClass();
        if (containingClass != null && CommonClassNames.JAVA_LANG_OBJECT.equals(containingClass.getQualifiedName())) return false;
        if (!psiMethod.hasModifierProperty(PsiModifier.STATIC)) {
            final PsiParameter[] parameters = psiMethod.getParameterList().getParameters();
            if (parameters.length == 1) {
                PsiType parameterType = parameters[0].getType();
                if (containingClass != null && !controllerClass.isEquivalentTo(containingClass)) {
                    final PsiSubstitutor substitutor =
                            TypeConversionUtil.getSuperClassSubstitutor(containingClass, controllerClass, PsiSubstitutor.EMPTY);
                    parameterType = substitutor.substitute(parameterType);
                }
                if (InheritanceUtil.isInheritor(parameterType, RythmJavCommonNames.JAVAFX_EVENT)) {
                    return true;
                }
            }
            return parameters.length == 0;
        }
        return false;
    }

    @Override
    public TextRange getRangeInElement() {
        final TextRange range = super.getRangeInElement();
        return new TextRange(range.getStartOffset() + 1, range.getEndOffset());
    }

    public static class JavaFxUnresolvedReferenceHandlerQuickfixProvider extends UnresolvedReferenceQuickFixProvider<RythmJavEventHandlerReference> {

        @Override
        public void registerFixes(@NotNull final RythmJavEventHandlerReference ref, @NotNull final QuickFixActionRegistrar registrar) {
            if (ref.myController != null && ref.myEventHandler == null) {
                final CreateMethodQuickFix quickFix = CreateMethodQuickFix.createFix(ref.myController, getHandlerSignature(ref), "");
                if (quickFix != null) {
                    registrar.register(quickFix);
                }
            }
        }

        private static String getHandlerSignature(RythmJavEventHandlerReference ref) {
            final XmlAttributeValue element = ref.getElement();
            String canonicalText = RythmJavCommonNames.JAVAFX_EVENT;
            final PsiElement parent = element.getParent();
            if (parent instanceof XmlAttribute) {
                final PsiClassType eventType = RythmJavPsiUtil.getDeclaredEventType((XmlAttribute)parent);
                if (eventType != null) {
                    canonicalText = eventType.getCanonicalText();
                }
            }
            final String modifiers = getModifiers(element.getProject());
            return modifiers + " void " + element.getValue().substring(1) + "(" + canonicalText + " e)";
        }

        @NotNull
        private static String getModifiers(@NotNull Project project) {
            String visibility = CodeStyleSettingsManager.getSettings(project).VISIBILITY;
            if (VisibilityUtil.ESCALATE_VISIBILITY.equals(visibility)) visibility = PsiModifier.PRIVATE;
            final boolean needAnnotation = !PsiModifier.PUBLIC.equals(visibility);
            final String modifier = !PsiModifier.PACKAGE_LOCAL.equals(visibility) ? visibility : "";
            return needAnnotation ? "@" + RythmJavCommonNames.JAVAFX_FXML_ANNOTATION + " " + modifier : modifier;
        }

        @NotNull
        @Override
        public Class<RythmJavEventHandlerReference> getReferenceClass() {
            return RythmJavEventHandlerReference.class;
        }
    }
}

