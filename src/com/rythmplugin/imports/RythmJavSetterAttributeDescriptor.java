package com.rythmplugin.imports;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.xml.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavSetterAttributeDescriptor extends RythmJavPropertyAttributeDescriptor {
    private final PsiMethod myPsiMethod;

    public RythmJavSetterAttributeDescriptor(PsiMethod psiMethod, PsiClass psiClass) {
        super(psiClass.getName() + "." + StringUtil.decapitalize(psiMethod.getName().substring("set".length())), psiClass);
        myPsiMethod = psiMethod;
    }

    @Nullable
    @Override
    public String[] getEnumeratedValues() {
        return null;
    }

    @Nullable
    @Override
    public String validateValue(XmlElement context, String value) {
        return null;
    }

    @Override
    public PsiElement getDeclaration() {
        return myPsiMethod != null && myPsiMethod.isValid() ? myPsiMethod : null;
    }
}
