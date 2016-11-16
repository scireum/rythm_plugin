package com.rythmplugin.ide.formatter;

import com.intellij.formatting.*;
import com.intellij.formatting.templateLanguages.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.formatter.DocumentBasedFormattingModel;
import com.intellij.psi.formatter.xml.SyntheticBlock;
import com.intellij.psi.formatter.xml.XmlTagBlock;
import com.intellij.psi.templateLanguages.SimpleTemplateLanguageFormattingModelBuilder;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.RythmLanguage;
import com.rythmplugin.parser.RythmPsiUtil;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.rythmplugin.ide.formatter.RythmFormatUtil.hasElementType;
import static com.rythmplugin.psi.RythmTypes.*;


import java.util.List;


/**
 * Created by mpl on 04.08.2016.
 */

public class RythmFormattingModelBuilder extends TemplateLanguageFormattingModelBuilder {


    @Override
    public TemplateLanguageBlock createTemplateLanguageBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment, @Nullable List<DataLanguageBlockWrapper> foreignChildren, @NotNull CodeStyleSettings codeStyleSettings) {

        return new RythmBlock(this, codeStyleSettings, node, foreignChildren);
    }


    @NotNull
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        final PsiFile file = element.getContainingFile();
        Block rootBlock;
        ASTNode node = element.getNode();
        if (node.getElementType() == RYTHM) {
            return new SimpleTemplateLanguageFormattingModelBuilder().createModel(element, settings);

        } else {
            rootBlock = getRootBlock(file, file.getViewProvider(), settings);
        }
        return new DocumentBasedFormattingModel(rootBlock, element.getProject(), settings, file.getFileType(), file);
    }


    @Override
    public boolean dontFormatMyModel() {
        return false;
    }

    private static class RythmBlock extends TemplateLanguageBlock {
        RythmBlock(@NotNull TemplateLanguageBlockFactory blockFactory, @NotNull CodeStyleSettings settings, @NotNull ASTNode node, @Nullable List<DataLanguageBlockWrapper> foreignChildren) {
            super(blockFactory, settings, node, foreignChildren);
        }


        @Override
        public Indent getIndent() {
            //   if (myNode.getText().trim().length() == 0) {
            //      return Indent.getNoneIndent();
            //  }
            if (myNode.getTreePrev() == HTML) {
                return Indent.getSpaceIndent(7);
            }

            if (myNode.getElementType() == RYTHM_IF){
                return Indent.getNormalIndent(true);
            }
            if (myNode.getElementType()== RYTHM_IF){
                return Indent.getNormalIndent();
            }

            if (myNode.getElementType()== HTML){
                return Indent.getNormalIndent(true);
            }

            //if (myNode.getTreePrev() == RBRACE){
            //    return Indent.getNoneIndent();
            //}

            //if (myNode.getElementType() == RYTHM_KEY){
            //    return Indent.getNormalIndent();
            //}


            if (myNode.getElementType() == RYTHM_I_18_N) {
                return Indent.getNormalIndent();
            }

            // if (myNode.getElementType()== TEXT){
            //     return Indent.getNormalIndent();
            // }


            //if (myNode.getElementType()== RYTHM_FOR){
            //    return Indent.getNormalIndent();
            //}
            //if (myNode.getElementType() == RBRACE) {
            //    if (myNode.getTreeNext() == RBRACE) {
             //       return Indent.getNormalIndent();

             //   }

             //   return Indent.getSpaceIndent(5);
            //}


            if (myNode.getElementType() == IDENTIFIER){
               return Indent.getSpaceIndent(12);
            }

            if (RythmPsiUtil.isNonRootStatementsElement(myNode.getPsi())) {
                if (hasOnlyRythmLanguageParents()) {
                    return Indent.getNormalIndent();
                }
            }
            if (myNode.getTreeParent() != null && RythmPsiUtil.isNonRootStatementsElement(myNode.getTreeParent().getPsi())) {
                if (getParent() instanceof RythmBlock && ((RythmBlock) getParent()).getIndent() == Indent.getNoneIndent()) {
                    return Indent.getNormalIndent();
                }
            }
            if (getRealBlockParent() instanceof DataLanguageBlockWrapper) {
                return Indent.getNormalIndent();
            }
            return Indent.getNoneIndent();
        }

        @NotNull
        @Override
        public ChildAttributes getChildAttributes(int newChildIndex) {
            if (hasElementType(myNode, RythmTypes.LBRACE)) {
                return new ChildAttributes(Indent.getSpaceIndent(4), null);
            }
            return new ChildAttributes(null, null);
        }


        @Override
        public Alignment getAlignment() {
            return null;
        }


        //NEU
        @Nullable
        @Override
        public Spacing getSpacing(@Nullable Block child1, Block child2) {
            if (child1 instanceof RythmBlock && child2 instanceof XmlTagBlock) {
                return Spacing.createSpacing(4, 4, 0, true, 1);
            }
            if (child1 instanceof RythmBlock && child2 instanceof RythmBlock) {

                RythmBlock firstBlock = (RythmBlock) child1;
                RythmBlock secondBlock = (RythmBlock) child2;

                if (firstBlock.getNode().getElementType() == RYTHM) {
                    return null;
                }
            }
            return null;
        }

        @NotNull
        private static SpacingBuilder createSpacingBuilder(@NotNull CodeStyleSettings settings) {
            return new SpacingBuilder(settings, RythmLanguage.INSTANCE)

                    .before(RythmTypes.HTML).spaces(4);
        }


        @Override
        protected IElementType getTemplateTextElementType() {
            return HTML;
        }


        @Override
        public boolean isRequiredRange(TextRange range) {
            return false;
        }

        /*
                @NotNull
                @Override
                public ChildAttributes getChildAttributes(int newChildIndex) {
                    if (myNode.getElementType() == RYTHM || (getParent() instanceof DataLanguageBlockWrapper
                            && (myNode.getElementType() != RYTHM || myNode.getTreeNext()
                            instanceof PsiErrorElement))) {
                        return new ChildAttributes(Indent.getNormalIndent(), null);
                    } else {


                        return new ChildAttributes(Indent.getNoneIndent(), null);
                    }
                }

        */
        private boolean hasOnlyRythmLanguageParents() {
            BlockWithParent parent = getParent();
            boolean hasOnlyRythmLanguageParents = true;

            while (parent != null) {
                if (parent instanceof DataLanguageBlockWrapper) {
                    hasOnlyRythmLanguageParents = false;
                    DataLanguageBlockWrapper realParent = (DataLanguageBlockWrapper) parent;
                    break;
                } else {
                    hasOnlyRythmLanguageParents = true;
                }
                parent = parent.getParent();
            }
            return hasOnlyRythmLanguageParents;
        }


        private BlockWithParent getRealBlockParent() {
            BlockWithParent parent = getParent();
            while (parent instanceof DataLanguageBlockWrapper && ((DataLanguageBlockWrapper) parent).getOriginal() instanceof SyntheticBlock) {
                parent = parent.getParent();
            }
            return parent;
        }
    }
}