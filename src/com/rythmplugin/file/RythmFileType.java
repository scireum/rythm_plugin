package com.rythmplugin.file;


import com.intellij.openapi.fileTypes.LanguageFileType;
import com.rythmplugin.RythmIcons;
import com.rythmplugin.RythmLanguage;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.swing.*;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFileType extends LanguageFileType {
    public static final RythmFileType INSTANCE = new RythmFileType();

    private RythmFileType() {
        super(RythmLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Rythm file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Rythm language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "rythm";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RythmIcons.FILE;
    }

}
