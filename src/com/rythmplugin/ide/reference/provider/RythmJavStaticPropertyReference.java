package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.*;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavStaticPropertyReference extends RythmJavPropertyReference<XmlAttribute>{
    private String myPropertyName;
    private PsiMethod myStaticMethod;

    public RythmJavStaticPropertyReference(@NotNull XmlAttribute xmlAttribute,
                                         @Nullable PsiClass psiClass,
                                         @NotNull String propertyName) {
        super(xmlAttribute, psiClass);
        myPropertyName = propertyName;
        myStaticMethod = RythmJavPsiUtil.findStaticPropertySetter(propertyName, psiClass);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return myStaticMethod;
    }

    @Nullable
    @Override
    public PsiMethod getGetter() {
        return null;
    }

    @Nullable
    @Override
    public PsiMethod getSetter() {
        return null;
    }

    @Nullable
    @Override
    public PsiField getField() {
        return null;
    }

    @Nullable
    @Override
    public PsiMethod getObservableGetter() {
        return null;
    }

    @Nullable
    @Override
    public PsiMethod getStaticSetter() {
        return myStaticMethod;
    }

    @Override
    public PsiType getType() {
        if (myStaticMethod != null) {
            final PsiParameter[] parameters = myStaticMethod.getParameterList().getParameters();
            if (parameters.length == 2) {
                return parameters[1].getType();
            }
        }
        return null;
    }

    @Override
    public String getPropertyName() {
        return myPropertyName;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        final String newPropertyName = RythmJavPsiUtil.getPropertyName(newElementName, true);
        return super.handleElementRename(newPropertyName);
    }
}

