package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.*;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 07.10.2016.
 */
public abstract class RythmJavPropertyReference<T extends PsiElement> extends PsiReferenceBase<T> {
    protected final PsiClass myPsiClass;

    public RythmJavPropertyReference(@NotNull T element, PsiClass aClass) {
        super(element);
        myPsiClass = aClass;
    }

    @Nullable
    public PsiMethod getGetter() {
        if (myPsiClass == null) return null;
        return RythmJavPsiUtil.findPropertyGetter(myPsiClass, getPropertyName());
    }

    @Nullable
    public PsiMethod getSetter() {
        if (myPsiClass == null) return null;
        return RythmJavPsiUtil.findInstancePropertySetter(myPsiClass, getPropertyName());
    }

    @Nullable
    public PsiField getField() {
        if (myPsiClass == null) return null;
        return myPsiClass.findFieldByName(getPropertyName(), true);
    }

    @Nullable
    public PsiMethod getObservableGetter() {
        if (myPsiClass == null) return null;
        return RythmJavPsiUtil.findObservablePropertyGetter(myPsiClass, getPropertyName());
    }

    @Nullable
    public PsiMethod getStaticSetter() {
        return null;
    }

    @Nullable
    public PsiType getType() {
        return RythmJavPsiUtil.getReadablePropertyType(resolve());
    }

    @Nullable
    public abstract String getPropertyName();
}

