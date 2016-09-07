package com.rythmplugin;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.lang.html.HtmlFormattingModelBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFormattingModelBuilder extends HtmlFormattingModelBuilder implements FormattingModelBuilder {
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
                .before(RythmTypes.RYTHM_SECTION).spaces(2)
                ;

    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}
