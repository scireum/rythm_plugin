package com.rythmplugin.file;

import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.FileViewProviderFactory;
import com.intellij.psi.PsiManager;


/**
 * Created by mpl on 26.08.2016.
 */
public class RythmFileViewProviderFactory implements FileViewProviderFactory{
    @Override
    public FileViewProvider createFileViewProvider(VirtualFile virtualFile, Language language, PsiManager psiManager, boolean physical){
     return new RythmFileViewProvider(psiManager, virtualFile, physical);
    }
}
