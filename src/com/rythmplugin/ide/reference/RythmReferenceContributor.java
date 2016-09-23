package com.rythmplugin.ide.reference;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 23.09.2016.
 */
public class RythmReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression.class),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
                        String value = literalExpression.getValue() instanceof String ?
                                (String) literalExpression.getValue() : null;
                        if (value != null && value.startsWith("@import")) {
                            return new PsiReference[]{
                                    new RythmReference(element, new TextRange(8, value.length() + 1))};

                           /*
                            PsiJavaFile javaFile = (PsiJavaFile) psiClass.getContaningFile();
                            PsiPackage pkg = JavaPsiFacade.getInstance(project).findPackage(javaFile.getPackageName());
                       */
                        }
                        return PsiReference.EMPTY_ARRAY;
                    }
                });
    }


}
