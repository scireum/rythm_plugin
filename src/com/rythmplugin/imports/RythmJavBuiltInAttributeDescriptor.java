package com.rythmplugin.imports;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.*;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.psi.util.PsiUtil;
import com.intellij.psi.xml.XmlAttributeValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavBuiltInAttributeDescriptor extends RythmJavPropertyAttributeDescriptor {
    private static final Logger LOG = Logger.getInstance("#" + RythmJavBuiltInAttributeDescriptor.class.getName());

    private final String myParentTagName;

    private RythmJavBuiltInAttributeDescriptor(String name, PsiClass psiClass) {
        super(name, psiClass);
        myParentTagName = null;
    }

    private RythmJavBuiltInAttributeDescriptor(String name, String parentTagName) {
        super(name, null);
        myParentTagName = parentTagName;
    }

    public static RythmJavBuiltInAttributeDescriptor create(String name, PsiClass psiClass) {
        if (RythmJavConstants.FX_ID.equals(name)) return new FxIdAttributeDescriptor(psiClass);
        if (RythmJavConstants.FX_VALUE.equals(name)) return new FxValueAttributeDescriptor(psiClass);
        if (RythmJavConstants.FX_CONSTANT.equals(name)) return new FxConstantAttributeDescriptor(psiClass);
        return new RythmJavBuiltInAttributeDescriptor(name, psiClass);
    }

    public static RythmJavBuiltInAttributeDescriptor create(String name, String parentTagName) {
        if (RythmJavConstants.FX_ID.equals(name)) return new FxIdAttributeDescriptor(parentTagName);
        if (RythmJavConstants.FX_VALUE.equals(name)) return new FxValueAttributeDescriptor(parentTagName);
        if (RythmJavConstants.FX_CONSTANT.equals(name)) return new FxConstantAttributeDescriptor(parentTagName);
        return new RythmJavBuiltInAttributeDescriptor(name, parentTagName);
    }

    @Override
    public boolean isEnumerated() {
        return false;
    }

    @Override
    public boolean isRequired() {
        if (myParentTagName == null) return super.isRequired();
        final List<String> requiredAttrs = RythmJavConstants.FX_BUILT_IN_TAG_REQUIRED_ATTRIBUTES.get(myParentTagName);
        return requiredAttrs != null && requiredAttrs.contains(getName());
    }

    @Override
    public String toString() {
        return myParentTagName != null ? myParentTagName + "#" + getName() : super.toString();
    }


    private static class FxIdAttributeDescriptor extends RythmJavBuiltInAttributeDescriptor {
        private FxIdAttributeDescriptor(PsiClass psiClass) {
            super(RythmJavConstants.FX_ID, psiClass);
        }

        private FxIdAttributeDescriptor(String parentTagName) {
            super(RythmJavConstants.FX_ID, parentTagName);
        }

        @Override
        public boolean hasIdType() {
            return true;
        }

        @Nullable
        @Override
        protected String validateAttributeValue(@NotNull XmlAttributeValue xmlAttributeValue, @NotNull String value) {
            final PsiClass controllerClass = RythmJavPsiUtil.getControllerClass(xmlAttributeValue.getContainingFile());
            if (controllerClass != null) {
                final PsiClass tagClass = RythmJavPsiUtil.getTagClass(xmlAttributeValue);
                if (tagClass != null) {
                    final PsiField field = controllerClass.findFieldByName(value, true);
                    if (field != null && !InheritanceUtil.isInheritorOrSelf(tagClass, PsiUtil.resolveClassInType(field.getType()), true)) {
                        return "Cannot set " + tagClass.getQualifiedName() + " to field \'" + field.getName() + "\'";
                    }
                }
            }
            return null;
        }
    }

    private static class FxValueAttributeDescriptor extends RythmJavBuiltInAttributeDescriptor {
        private FxValueAttributeDescriptor(PsiClass psiClass) {
            super(RythmJavConstants.FX_VALUE, psiClass);
        }

        private FxValueAttributeDescriptor(String parentTagName) {
            super(RythmJavConstants.FX_VALUE, parentTagName);
        }

        @Override
        public boolean isEnumerated() {
            final PsiClass psiClass = getPsiClass();
            return psiClass != null && psiClass.isEnum();
        }

        @Override
        protected PsiClass getEnum() {
            final PsiClass psiClass = getPsiClass();
            return psiClass.isEnum() ? psiClass : null;
        }

        protected boolean isConstant(PsiField field) {
            return field instanceof PsiEnumConstant;
        }

        @Nullable
        @Override
        protected String validateAttributeValue(@NotNull XmlAttributeValue xmlAttributeValue, @NotNull String value) {
            final PsiClass tagClass = RythmJavPsiUtil.getTagClass(xmlAttributeValue);
            if (tagClass != null) {
                if (tagClass.isEnum()) {
                    return RythmJavPsiUtil.validateEnumConstant(tagClass, value);
                }
                final PsiMethod method = RythmJavPsiUtil.findValueOfMethod(tagClass);
                if (method == null) {
                    return "Unable to coerce '" + value + "' to " + tagClass.getQualifiedName() + ".";
                }
            }
            return validateLiteral(xmlAttributeValue, value);
        }
    }

    private static class FxConstantAttributeDescriptor extends RythmJavBuiltInAttributeDescriptor {
        private FxConstantAttributeDescriptor(PsiClass psiClass) {
            super(RythmJavConstants.FX_CONSTANT, psiClass);
        }

        private FxConstantAttributeDescriptor(String parentTagName) {
            super(RythmJavConstants.FX_CONSTANT, parentTagName);
        }

        @Override
        public boolean isEnumerated() {
            return getPsiClass() != null;
        }

        @Override
        protected PsiClass getEnum() {
            return getPsiClass();
        }

        protected boolean isConstant(PsiField field) {
            return field.hasModifierProperty(PsiModifier.STATIC) &&
                    field.hasModifierProperty(PsiModifier.FINAL) &&
                    field.hasModifierProperty(PsiModifier.PUBLIC);
        }

        @Nullable
        @Override
        protected String validateAttributeValue(@NotNull XmlAttributeValue xmlAttributeValue, @NotNull String value) {
            final PsiClass tagClass = RythmJavPsiUtil.getTagClass(xmlAttributeValue);
            if (tagClass != null) {
                final PsiField constField = tagClass.findFieldByName(value, true);
                if (constField == null || !isConstant(constField)) {
                    return "Constant '" + value + "' is not found";
                }
            }
            return null;
        }
    }
}

