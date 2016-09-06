package com.rythmplugin.file;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.rythmplugin.RythmLanguage;
import com.rythmplugin.stub.RythmFileStub;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmFileElementType extends IStubFileElementType<RythmFileStub> {
    public static IFileElementType INSTANCE = new RythmFileElementType();

    public RythmFileElementType() {
        super(RythmLanguage.INSTANCE);
    }
}