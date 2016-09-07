// This is a generated file. Not intended for manual editing.
package com.rythmplugin.psi.impl;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.rythmplugin.psi.RythmTypes.*;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rythmplugin.psi.*;

public class RythmGreaterImpl extends ASTWrapperPsiElement implements RythmGreater {

    public RythmGreaterImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull RythmVisitor visitor) {
        visitor.visitGreater(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof RythmVisitor) accept((RythmVisitor) visitor);
        else super.accept(visitor);
    }

}
