package com.rythmplugin.file;


import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.EditorHighlighterProvider;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeEditorHighlighterProviders;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.rythmplugin.RythmIcons;
import com.rythmplugin.RythmLanguage;
import com.rythmplugin.highlighter.RythmSyntaxHighlighter;
import com.rythmplugin.highlighter.RythmTemplateHighlighter;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.swing.*;

import static com.intellij.ide.highlighter.ProjectFileType.DEFAULT_EXTENSION;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFileType extends LanguageFileType {
    public static final RythmFileType INSTANCE = new RythmFileType();


public static final String DEFAULT_EXTENSION = "rythm";

    public static final String[] extensions = {DEFAULT_EXTENSION};

    private RythmFileType() {
        super(RythmLanguage.INSTANCE);


   FileTypeEditorHighlighterProviders.INSTANCE.addExplicitExtension(this, new EditorHighlighterProvider() {
        public EditorHighlighter getEditorHighlighter (@Nullable Project project, FileType
        fileType, @Nullable VirtualFile virtualFile, EditorColorsScheme editorColorsScheme){
            return new RythmTemplateHighlighter(project, virtualFile, editorColorsScheme);

        }
    });}

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




    @Override
    public boolean isJVMDebuggingSupported() {
        return false;
    }
}
