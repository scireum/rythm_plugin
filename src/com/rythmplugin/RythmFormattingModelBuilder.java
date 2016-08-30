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
public class RythmFormattingModelBuilder implements FormattingModelBuilder {
    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(),
                new RythmBlock(element.getNode(), Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(), createSpaceBuilder(settings)),
                settings);
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, RythmLanguage.INSTANCE)


             //   .before(RythmTypes.RYTHM_LOST).blankLines(10);
             //   .after(RythmTypes.RYTHM_KEY).none()
           //  .around(RythmTypes.RYTHM_BLOCK).parentDependentLFSpacing(1,6,true,1);
               // .around(RythmTypes.RYTHM_METHOD).parentDependentLFSpacing(3,6,true,1);
.before(RythmTypes.SCRIPT).spaces(4);
//.around(RythmTypes.RYTHM_BLOCK).spaces(4)
             //   .before(RythmTypes.RYTHM_I_18_N).lineBreakInCodeIf(false);
               // .around(RythmTypes.RYTHM).spaceIf(settings.SPACE_WITHIN_BRACES)
               // .before(RythmTypes.RYTHM_KEY).parentDependentLFSpacing(1,5,false,2);
               // .around(RythmTypes.RYTHM_KEY).lineBreakInCodeIf(settings.AUTODETECT_INDENTS)
              //  .before(RythmTypes.PROPERTY).none()
              // .around(RythmTypes.RYTHM_METHOD).lineBreakInCodeIf(settings.AUTODETECT_INDENTS)
                //.before(RythmTypes.PROPERTY).none();



    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}
