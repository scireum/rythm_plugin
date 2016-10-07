package com.rythmplugin.imports;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiParameter;
import com.intellij.psi.util.PsiUtil;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavStaticSetterAttributeDescriptor extends RythmJavPropertyAttributeDescriptor {
    private final PsiMethod mySetter;

    public RythmJavStaticSetterAttributeDescriptor(PsiMethod setter, String name) {
        super(name, setter.getContainingClass());
        mySetter = setter;
    }

    @Override
    public PsiElement getDeclaration() {
        return mySetter;
    }

    @Override
    protected PsiClass getEnum() {
        if (mySetter != null) {
            final PsiParameter[] parameters = mySetter.getParameterList().getParameters();
            if (parameters.length == 2) {
                final PsiClass enumClass = PsiUtil.resolveClassInType(parameters[1].getType());
                return enumClass != null && enumClass.isEnum() ? enumClass : null;
            }
        }
        return null;
    }
}
