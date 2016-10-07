package com.rythmplugin.ide.reference.provider;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.util.ArrayUtil;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.file.RythmFileTypeFactory;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavStaticPropertyReferenceProvider extends PsiReferenceProvider {
    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
        if (!(element instanceof XmlAttribute) || !RythmFileTypeFactory.isFxml(element.getContainingFile())) return PsiReference.EMPTY_ARRAY;

        final XmlAttribute xmlAttribute = (XmlAttribute)element;
        final String name = xmlAttribute.getName();
        final int dotIndex = name.indexOf('.');
        if (dotIndex <= 0 || name.indexOf('.', dotIndex + 1) >= 0) return PsiReference.EMPTY_ARRAY;
        final String className = name.substring(0, dotIndex);
        final JavaFxStaticPropertyClassReference classReference = new JavaFxStaticPropertyClassReference(xmlAttribute, className);
        classReference.setRangeInElement(new TextRange(0, dotIndex));
        if (dotIndex + 1 == name.length()) {
            return new PsiReference[]{classReference};
        }
        final String propertyName = name.substring(dotIndex + 1);
        final RythmJavStaticPropertyReference methodReference =
                new RythmJavStaticPropertyReference(xmlAttribute, classReference.getPsiClass(), propertyName);
        methodReference.setRangeInElement(new TextRange(dotIndex + 1, name.length()));

        return new PsiReference[]{classReference, methodReference};
    }

    private static class JavaFxStaticPropertyClassReference extends PsiReferenceBase<XmlAttribute> {
        private PsiClass myPsiClass;

        public JavaFxStaticPropertyClassReference(@NotNull XmlAttribute xmlAttribute, @NotNull String className) {
            super(xmlAttribute);
            myPsiClass = RythmJavPsiUtil.findPsiClass(className, xmlAttribute);
        }

        public PsiClass getPsiClass() {
            return myPsiClass;
        }

        @Nullable
        @Override
        public PsiElement resolve() {
            return myPsiClass;
        }

        @NotNull
        @Override
        public Object[] getVariants() {
            return ArrayUtil.EMPTY_OBJECT_ARRAY;
        }
    }
}
