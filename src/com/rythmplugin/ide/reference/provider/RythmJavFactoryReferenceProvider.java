package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.*;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.ArrayUtil;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavFactoryReferenceProvider extends PsiReferenceProvider {
    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                 @NotNull ProcessingContext context) {
        final XmlAttributeValue attributeValue = (XmlAttributeValue)element;
        return new PsiReference[] {new JavaFXFactoryReference(attributeValue)};
    }

    private static class JavaFXFactoryReference extends PsiReferenceBase<XmlAttributeValue> {
        public JavaFXFactoryReference(XmlAttributeValue attributeValue) {
            super(attributeValue);
        }

        @Nullable
        @Override
        public PsiElement resolve() {
            final PsiClass psiClass = RythmJavPsiUtil.getTagClass(getElement());
            if (psiClass != null) {
                final PsiMethod[] psiMethods = psiClass.findMethodsByName(getElement().getValue(), false);
                for (PsiMethod method : psiMethods) {
                    if (isFactoryMethod(method)) {
                        return method;
                    }
                }
            }
            return null;
        }

        private static boolean isFactoryMethod(PsiMethod method) {
            return method.hasModifierProperty(PsiModifier.STATIC) &&
                    method.getParameterList().getParametersCount() == 0 &&
                    !PsiType.VOID.equals(method.getReturnType());
        }

        @NotNull
        @Override
        public Object[] getVariants() {
            final PsiClass psiClass = RythmJavPsiUtil.getTagClass(getElement());
            if (psiClass != null) {
                final List<PsiMethod> methods = new ArrayList<PsiMethod>();
                for (PsiMethod method : psiClass.getMethods()) {
                    if (isFactoryMethod(method)) {
                        methods.add(method);
                    }
                }
                return ArrayUtil.toObjectArray(methods);
            }
            return ArrayUtil.EMPTY_OBJECT_ARRAY;
        }
    }
}
