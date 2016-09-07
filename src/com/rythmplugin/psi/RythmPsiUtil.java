package com.rythmplugin.psi;

import com.intellij.openapi.util.Condition;

import com.intellij.psi.PsiElement;

import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;


/**
 * Created by mpl on 07.09.2016.
 */
public class RythmPsiUtil {

    private static TokenSet RYTHM = TokenSet.create(
            RythmTypes.RYTHM_KEY,
            RythmTypes.RYTHM_ARGS,
            RythmTypes.RYTHM_ELSE,
            RythmTypes.RYTHM_EXTENDS,
            RythmTypes.RYTHM_FOR,
            RythmTypes.RYTHM_I_18_N,
            RythmTypes.RYTHM_IF,
            RythmTypes.RYTHM_IMPORT,
            RythmTypes.RYTHM_INVOKE,
            RythmTypes.RYTHM_METHOD,
            RythmTypes.RYTHM_PREFIX,
            RythmTypes.RYTHM_RENDER,
            RythmTypes.RYTHM_SECTION
    );

    public static PsiElement findRythmElement(PsiElement element) {
        return PsiTreeUtil.findFirstParent(element, true, new Condition<PsiElement>() {
            @Override
            public boolean value(PsiElement element) {
                return element != null && element.getNode() != null && RYTHM.contains(element.getNode().getElementType());
            }
        });
    }

    public static boolean isNonRootStatementsElement(PsiElement element) {
        PsiElement statementsParent = PsiTreeUtil.findFirstParent(element, true, new Condition<PsiElement>() {
            @Override
            public boolean value(PsiElement element) {
                return element != null && element.getNode() != null && element.getNode().getElementType() == RythmTypes.RYTHM_KEY;
            }
        });

        return element.getNode().getElementType() == RythmTypes.RYTHM_KEY && statementsParent != null;
    }
}
