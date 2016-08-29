package com.rythmplugin.highlighter;

import com.intellij.lang.Language;
import com.intellij.lang.StdLanguages;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayerDescriptor;
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings;
import com.rythmplugin.lexer.RythmTokenTypes;
import com.sun.istack.internal.NotNull;

/**
 * Created by mpl on 26.08.2016.
 */
public class RythmTemplateHighlighter extends LayeredLexerEditorHighlighter {

    public RythmTemplateHighlighter(@NotNull Project project, @NotNull VirtualFile virtualFile, @NotNull EditorColorsScheme colors ){

        super (new RythmSyntaxHighlighter(), colors);
        FileType type;
        if (project == null || virtualFile == null){
            type = StdFileTypes.PLAIN_TEXT;
        }else{
            Language outerLang = TemplateDataLanguageMappings.getInstance(project).getMapping(virtualFile);
            if (outerLang == null) outerLang = StdLanguages.HTML;
            type = outerLang.getAssociatedFileType();
        }

        SyntaxHighlighter outerHighlighter = SyntaxHighlighter.PROVIDER.create(type, project, virtualFile);

       registerLayer(RythmTokenTypes.HTML_TEXT, new LayerDescriptor(outerHighlighter, ""));

    }
}
