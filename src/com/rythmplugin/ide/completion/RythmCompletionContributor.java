package com.rythmplugin.ide.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.patterns.StandardPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.codeInsight.completion.CompletionContributor;

/**
 * Created by mpl on 19.09.2016.
 */
public class RythmCompletionContributor extends CompletionContributor {

    private static final Logger log = Logger.getInstance("RythmCompletionContributor");


    public RythmCompletionContributor() {
        log.info("Created Rythm completion contributor");

        extend(CompletionType.BASIC, StandardPatterns.instanceOf(PsiElement.class), new KeywordCompletionProvider());
    }
}
