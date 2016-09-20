package com.rythmplugin.ide.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.patterns.StandardPatterns;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.RythmLanguage;
import com.rythmplugin.psi.RythmFile;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;

import static com.rythmplugin.psi.RythmTypes.TEXT;

/**
 * Created by mpl on 20.09.2016.
 */
public class RythmCompletionContributor extends CompletionContributor {

    public RythmCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement().inFile(StandardPatterns.instanceOf(RythmFile.class)),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters,
                                                  ProcessingContext context,
                                                  @NotNull CompletionResultSet resultSet)

                    {
                        resultSet.addElement(LookupElementBuilder.create("@if ("));
                        resultSet.addElement(LookupElementBuilder.create("@for ("));
                        resultSet.addElement(LookupElementBuilder.create("@prefix"));
                        resultSet.addElement(LookupElementBuilder.create("@args"));
                        resultSet.addElement(LookupElementBuilder.create("@section"));
                        resultSet.addElement(LookupElementBuilder.create("@import"));
                        resultSet.addElement(LookupElementBuilder.create("@"));
                        resultSet.addElement(LookupElementBuilder.create("@render"));
                        resultSet.addElement(LookupElementBuilder.create("@i18n"));


                    }
                }
        );
    }
}
