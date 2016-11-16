package com.rythmplugin.parser;

import com.intellij.openapi.util.Condition;

import com.intellij.psi.PsiElement;

import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import com.rythmplugin.psi.RythmTypes;

/**
 * Created by mpl on 07.09.2016.
 */
public class RythmPsiUtil {

    private static TokenSet RYTHM = TokenSet.create(
            RythmTypes.RYTHM_ARGS,
            RythmTypes.RYTHM_EXTENDS,
            RythmTypes.RYTHM_FOR,
            RythmTypes.RYTHM_I_18_N,
            RythmTypes.RYTHM_IF,
            RythmTypes.RYTHM_IMPORT,
            RythmTypes.RYTHM_INVOKE,
            RythmTypes.RYTHM_PREFIX,
            RythmTypes.RYTHM_RENDER,
            RythmTypes.RYTHM_SECTION

    );
    private static TokenSet BRACES = TokenSet.create(RythmTypes.LBRACE,
            RythmTypes.RBRACE);

    private static TokenSet HTML = TokenSet.create(
            RythmTypes.HTML
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
       PsiElement statementsParent = PsiTreeUtil.findFirstParent(element, true, element1 -> element1 != null
               && element1 instanceof RythmTypes);

       return element instanceof RythmTypes
               && statementsParent != null;
   }
}
