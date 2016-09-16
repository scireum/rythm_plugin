package com.rythmplugin.ide.highlighter;

import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayerDescriptor;
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings;
import com.rythmplugin.RythmLanguage;

import static com.rythmplugin.psi.RythmTypes.TEXT;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmLayeredSyntaxHighlighter extends LayeredLexerEditorHighlighter {
    public RythmLayeredSyntaxHighlighter(Project project, EditorColorsScheme scheme, FileType ptype, VirtualFile virtualFile) {
        super(new RythmSyntaxHighlighter(), scheme);

        FileType type = null;
        if (project == null || virtualFile == null) {
            type = StdFileTypes.PLAIN_TEXT;
        } else {
            Language language = TemplateDataLanguageMappings.getInstance(project).getMapping(virtualFile);
            if (language != null) type = language.getAssociatedFileType();
            if (type == null) type = RythmLanguage.getDefaultTemplateLang();
        }

        SyntaxHighlighter outerHighlighter = SyntaxHighlighterFactory.getSyntaxHighlighter(type, project, virtualFile);
        registerLayer(TEXT, new LayerDescriptor(outerHighlighter, ""));
    }

}
