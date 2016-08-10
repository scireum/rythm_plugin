package com.rythmplugin;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.rythmplugin.psi.RythmTypes;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFormattingBuilder implements FormattingModelBuilder {
    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings){
      return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(),
              new RythmBlock(element.getNode(), Wrap.createWrap(WrapType.NONE, false),
                      Alignment.createAlignment(),createSpaceBuilder(settings)),
              settings);
    }
    private static  SpacingBuilder createSpaceBuilder(CodeStyleSettings settings){
        return new SpacingBuilder(settings, RythmLanguage.INSTANCE)
                .around(RythmTypes.RYTHM).spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
              //  .around(RythmTypes.SEPARATOR)
              //  .spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .before(RythmTypes.PROPERTY).none();
    }
    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset){
        return null;
    }
}
