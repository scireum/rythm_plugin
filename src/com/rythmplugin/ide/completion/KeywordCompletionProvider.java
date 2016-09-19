package com.rythmplugin.ide.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpl on 19.09.2016.
 */
public class KeywordCompletionProvider extends CompletionProvider<CompletionParameters> {

    private static final String[] KEYWORDS = {"@for", "@if", "@prefix", "@render", "@args", "@import", "@extends"};


    private List<LookupElementBuilder> KEYWORD_LOOKUPS = new ArrayList();

    public KeywordCompletionProvider() {
        super();

        for (String keyword : KEYWORDS) KEYWORD_LOOKUPS.add(LookupElementBuilder.create(keyword));
    }

    @Override
    protected void addCompletions(@NotNull CompletionParameters params,
                                  ProcessingContext ctx,
                                  @NotNull CompletionResultSet results) {

        PsiElement currElement = params.getPosition().getOriginalElement();
        if (currElement.getNode().getElementType() == RythmTypes.RYTHM) {
            for (LookupElementBuilder x : KEYWORD_LOOKUPS) results.addElement(x);
        }
    }
}


