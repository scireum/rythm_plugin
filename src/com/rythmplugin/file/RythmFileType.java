package com.rythmplugin.file;


import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.CharsetUtil;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.TemplateLanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings;
import com.rythmplugin.RythmIcons;
import com.rythmplugin.RythmLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import javax.swing.*;
import java.nio.charset.Charset;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFileType extends LanguageFileType implements TemplateLanguageFileType{

    public static final RythmFileType INSTANCE = new RythmFileType();

    private RythmFileType() {
        super(RythmLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Rythm";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Rythm template engine file";
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


    @Override
    public String getCharset(@org.jetbrains.annotations.NotNull VirtualFile file, @org.jetbrains.annotations.NotNull byte[] content) {
        return CharsetToolkit.UTF8;
    }


    public Charset extractCharsetFromFileContent(@org.jetbrains.annotations.Nullable final Project project,
                                                 @org.jetbrains.annotations.Nullable final VirtualFile file,
                                                 @org.jetbrains.annotations.NotNull final CharSequence content) {
        LanguageFileType associatedFileType = getAssociatedFileType(file, project);

        if (associatedFileType == null) {
            return null;
        }

        return CharsetUtil.extractCharsetFromFileContent(project, file, associatedFileType, content);
    }

    private static LanguageFileType getAssociatedFileType(VirtualFile file, Project project) {
        if (project == null) {
            return null;
        }
        Language language = TemplateDataLanguageMappings.getInstance(project).getMapping(file);

        LanguageFileType associatedFileType = null;
        if (language != null) {
            associatedFileType = language.getAssociatedFileType();
        }

        if (language == null || associatedFileType == null) {
            associatedFileType = RythmLanguage.getDefaultTemplateLang();
        }
        return associatedFileType;
    }

}
