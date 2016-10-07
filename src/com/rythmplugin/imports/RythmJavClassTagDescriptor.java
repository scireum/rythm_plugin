package com.rythmplugin.imports;

import com.intellij.psi.PsiClass;
import com.intellij.psi.xml.XmlTag;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavClassTagDescriptor extends RythmJavClassTagDescriptorBase {

    private final PsiClass myPsiClass;

    public RythmJavClassTagDescriptor(String name, XmlTag tag) {
        this(name, RythmJavPsiUtil.findPsiClass(name, tag));
    }

    public RythmJavClassTagDescriptor(String name, PsiClass psiClass) {
        super(name);
        myPsiClass = psiClass;
    }

    @Override
    public PsiClass getPsiClass() {
        return myPsiClass;
    }

    @Override
    public String toString() {
        return myPsiClass != null ? "<" + myPsiClass.getName() + ">" : "<" + getName() + "?>";
    }
}

