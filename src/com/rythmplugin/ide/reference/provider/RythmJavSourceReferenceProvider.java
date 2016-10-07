package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavSourceReferenceProvider extends PsiReferenceProvider {
    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull final PsiElement element,
                                                 @NotNull ProcessingContext context) {
        final FileReferenceSet set = new FileReferenceSet(((XmlAttributeValue)element).getValue(), element, 1, null, true);
        return set.getAllReferences();
    }
}

