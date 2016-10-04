package com.rythmplugin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;

import com.intellij.psi.PsiFile;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.xml.*;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mpl on 07.09.2016.
 */
public class RythmPsiUtil {

    private static TokenSet RYTHM = TokenSet.create(
            RythmTypes.RYTHM_KEY,
            RythmTypes.RYTHM_ARGS,
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
    private static TokenSet BRACES = TokenSet.create(RythmTypes.LBRACE,
            RythmTypes.RBRACE);

    private static TokenSet TEXT = TokenSet.create(
            RythmTypes.TEXT
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


    @Nullable
    public static String getInstructionTarget(String instructionName, XmlProcessingInstruction instruction) {
        final ASTNode node = instruction.getNode();
        ASTNode xmlNameNode = node.findChildByType(RythmTypes.TEXT/*XmlTokenType.XML_NAME*/);
        ASTNode importNode = node.findChildByType(RythmTypes.TEXT/*XmlTokenType.XML_TAG_CHARACTERS*/);
        if (!(xmlNameNode == null || !instructionName.equals(xmlNameNode.getText()) || importNode == null)) {
            return importNode.getText();
        }
        return null;
    }

    public static PsiClass findPsiClass(String name, PsiElement context) {
        final Project project = context.getProject();
        if (!StringUtil.getShortName(name).equals(name)) {
            final PsiClass psiClass = JavaPsiFacade.getInstance(project).findClass(name, GlobalSearchScope.allScope(project));
            if (psiClass != null) {
                return psiClass;
            }
            return findNestedPsiClass(name, context, project);
        }
        return findPsiClass(name, parseImports((XmlFile)context.getContainingFile()), context, project);
    }

    private static PsiClass findNestedPsiClass(String name, PsiElement context, Project project) {
        final int dotIndex = name.indexOf('.');
        if (dotIndex > 0) {
            final String outerName = name.substring(0, dotIndex);
            final PsiClass outerClass = findPsiClass(outerName, parseImports((XmlFile)context.getContainingFile()), context, project);
            if (outerClass != null) {
                final List<String> nameChain = StringUtil.split(name, ".", true, false);
                final List<String> nestedNames = nameChain.subList(1, nameChain.size());
                PsiClass aClass = outerClass;
                for (String nestedName : nestedNames) {
                    aClass = aClass.findInnerClassByName(nestedName, true);
                    if (aClass == null) return null;
                }
                return aClass;
            }
        }
        return null;
    }

    private static PsiClass findPsiClass(String name, List<String> imports, PsiElement context, Project project) {
        PsiClass psiClass = null;
        if (imports != null) {
            JavaPsiFacade psiFacade = JavaPsiFacade.getInstance(project);

            PsiFile file = context.getContainingFile();
            for (String anImport : imports) {
                if (StringUtil.getShortName(anImport).equals(name)) {
                    psiClass = psiFacade.findClass(anImport, file.getResolveScope());
                }
                else if (StringUtil.endsWith(anImport, ".*")) {
                    psiClass = psiFacade.findClass(StringUtil.trimEnd(anImport, "*") + name, file.getResolveScope());
                }
                if (psiClass != null) {
                    return psiClass;
                }
            }
        }
        return null;
    }

    public static List<String> parseImports(XmlFile file) {
        return parseInstructions(file, "import");
    }
    private static List<String> parseInstructions(XmlFile file, String instructionName) {
        final List<String> definedImports = new ArrayList<String>();
        final XmlDocument document = file.getDocument();
        if (document != null) {
            final XmlProlog prolog = document.getProlog();

            final Collection<XmlProcessingInstruction>
                    instructions = new ArrayList<XmlProcessingInstruction>(PsiTreeUtil.findChildrenOfType(prolog, XmlProcessingInstruction.class));
            for (final XmlProcessingInstruction instruction : instructions) {
                final String instructionTarget = getInstructionTarget(instructionName, instruction);
                if (instructionTarget != null) {
                    definedImports.add(instructionTarget);
                }
            }
        }
        return definedImports;
    }
}
