package com.rythmplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.psi.FileViewProvider;
import com.rythmplugin.RythmFileType;
import com.rythmplugin.RythmLanguage;
import com.sun.istack.internal.NotNull;

import javax.swing.*;


/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFile extends PsiFileBase {
    public RythmFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RythmLanguage.INSTANCE);
    }


    @NotNull
    @Override
    public RythmFileType getFileType() {
        return RythmFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Rythm File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

}
