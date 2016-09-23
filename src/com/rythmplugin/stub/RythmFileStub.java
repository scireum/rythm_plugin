package com.rythmplugin.stub;

import com.intellij.psi.stubs.PsiFileStubImpl;
import com.rythmplugin.file.RythmFile;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmFileStub extends PsiFileStubImpl<RythmFile>{
    public RythmFileStub(RythmFile file) {
        super(file);
    }
}
