package com.rythmplugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.templateLanguages.TemplateLanguage;
import com.rythmplugin.file.RythmFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmLanguage extends Language implements TemplateLanguage{

    public static final RythmLanguage INSTANCE = new RythmLanguage();

    private RythmLanguage() {
        super("RythmTemplateLanguage");

    }

    public static LanguageFileType getDefaultTemplateLang(){
        return StdFileTypes.HTML;
    }
    @NotNull
    @Override
    public String getDisplayName(){
        return "Rythm template engine";
    }

    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType(){
        return RythmFileType.INSTANCE;
    }
    @Override
    public boolean isCaseSensitive(){
        return true;
    }
}
