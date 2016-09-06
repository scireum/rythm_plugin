package com.rythmplugin.ide.highlighter;

import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.EditorHighlighterProvider;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmEditorHighlighterFactory implements EditorHighlighterProvider{
    @Override
    public EditorHighlighter getEditorHighlighter(@Nullable Project project,
                                                  @NotNull FileType type,
                                                  @Nullable VirtualFile file,
                                                  @NotNull EditorColorsScheme scheme) {
        return new RythmLayeredSyntaxHighlighter(project, scheme, type, file);
    }

}
