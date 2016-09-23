package com.rythmplugin.ide.reference;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 23.09.2016.
 */
public abstract class RythmNamedElementImpl extends ASTWrapperPsiElement implements RythmNamedElement{
    public RythmNamedElementImpl(@NotNull ASTNode node){
        super(node);
    }

}
