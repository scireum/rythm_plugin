package com.rythmplugin.ide.reference;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.xml.XmlProcessingInstruction;
import com.intellij.psi.xml.XmlTokenType;
import com.intellij.util.ArrayUtil;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.parser.RythmPsiUtil;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 04.10.2016.
 */
public class ImportReferenceProvider extends PsiReferenceProvider {


    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {

        final ASTNode importNode = element.getNode().findChildByType(RythmTypes.TEXT/*XmlTokenType.XML_TAG_CHARACTERS*/);
        if (importNode != null) {
            final PsiElement importInstr = importNode.getPsi();
            final String instructionTarget = RythmPsiUtil.getInstructionTarget("import", (XmlProcessingInstruction) element);
            if (instructionTarget != null && instructionTarget.equals(importInstr.getText())) {



                final PsiReference[] references = RythmJavReferenceContributor.CLASS_REFERENCE_PROVIDER.getReferencesByString
                        (instructionTarget, element, importInstr.getStartOffsetInParent());


                if (instructionTarget.endsWith(".*")) {
                    return ArrayUtil.remove(references, references.length - 1);
                } else {
                    return references;
                }
            }
        }

        return PsiReference.EMPTY_ARRAY;
    }
}
