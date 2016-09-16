package com.rythmplugin.file;

import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.FileViewProviderFactory;
import com.intellij.psi.PsiManager;
import com.rythmplugin.RythmLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmFileViewProviderFactory implements FileViewProviderFactory {
    @NotNull
    @Override
    public FileViewProvider createFileViewProvider(@NotNull VirtualFile virtualFile,
                                                   Language language,
                                                   @NotNull PsiManager psiManager,
                                                   boolean eventSystemEnabled){
      assert language.isKindOf(RythmLanguage.INSTANCE);
        return new RythmFileViewProvider(psiManager, virtualFile, eventSystemEnabled, language);
    }
}
