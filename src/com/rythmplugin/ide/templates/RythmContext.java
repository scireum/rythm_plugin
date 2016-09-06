package com.rythmplugin.ide.templates;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.rythmplugin.RythmLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmContext extends TemplateContextType {

    protected RythmContext() {
        super("RYTHM", "rythm");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile psiFile, int i) {
        PsiElement elementAt = psiFile.findElementAt(i);
        if (elementAt != null) {
            return psiFile.getLanguage().is(RythmLanguage.INSTANCE) && !elementAt.getLanguage().is(RythmLanguage.INSTANCE);
        }
        return false;
    }
}
