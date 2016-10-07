package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.*;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.file.RythmFileTypeFactory;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 07.10.2016.
 */
public abstract class RythmJavControllerBasedReferenceProvider extends PsiReferenceProvider {
    @NotNull
    @Override
    public final PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
        final XmlAttributeValue xmlAttrVal = (XmlAttributeValue)element;
        final PsiFile containingFile = xmlAttrVal.getContainingFile();
        if (!RythmFileTypeFactory.isFxml(containingFile)) return PsiReference.EMPTY_ARRAY;

        final PsiClass controllerClass = RythmJavPsiUtil.getControllerClass(containingFile);
        return controllerClass != null ? getReferencesByElement(controllerClass, xmlAttrVal, context)
                : new PsiReference[] {new PsiReferenceBase.Immediate<XmlAttributeValue>(xmlAttrVal, xmlAttrVal)};
    }

    protected abstract PsiReference[] getReferencesByElement(@NotNull PsiClass controllerClass, XmlAttributeValue element, ProcessingContext context);
}

