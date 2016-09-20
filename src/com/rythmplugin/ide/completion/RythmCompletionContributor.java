package com.rythmplugin.ide.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.patterns.StandardPatterns;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.psi.RythmFile;
import org.jetbrains.annotations.NotNull;

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
                        resultSet.addElement(LookupElementBuilder.create("if"));
                        resultSet.addElement(LookupElementBuilder.create("for"));
                        resultSet.addElement(LookupElementBuilder.create("prefix"));
                        resultSet.addElement(LookupElementBuilder.create("args"));
                        resultSet.addElement(LookupElementBuilder.create("section"));
                        resultSet.addElement(LookupElementBuilder.create("import"));
                        resultSet.addElement(LookupElementBuilder.create("extends"));
                        resultSet.addElement(LookupElementBuilder.create("render"));
                        resultSet.addElement(LookupElementBuilder.create("i18n"));

                        resultSet.addElement(LookupElementBuilder.create("assign"));
                        resultSet.addElement(LookupElementBuilder.create("break"));
                        resultSet.addElement(LookupElementBuilder.create("cache"));
                        resultSet.addElement(LookupElementBuilder.create("compact"));
                        resultSet.addElement(LookupElementBuilder.create("continue"));
                        resultSet.addElement(LookupElementBuilder.create("debug"));
                        resultSet.addElement(LookupElementBuilder.create("def"));
                        resultSet.addElement(LookupElementBuilder.create("doLayout"));
                        resultSet.addElement(LookupElementBuilder.create("escape"));
                        resultSet.addElement(LookupElementBuilder.create("exec"));
                        resultSet.addElement(LookupElementBuilder.create("include"));
                        resultSet.addElement(LookupElementBuilder.create("inherited"));
                        resultSet.addElement(LookupElementBuilder.create("init"));
                        resultSet.addElement(LookupElementBuilder.create("invoke"));
                        resultSet.addElement(LookupElementBuilder.create("locale"));
                        resultSet.addElement(LookupElementBuilder.create("macro"));
                        resultSet.addElement(LookupElementBuilder.create("nocompact"));
                        resultSet.addElement(LookupElementBuilder.create("raw"));
                        resultSet.addElement(LookupElementBuilder.create("renderBody"));
                        resultSet.addElement(LookupElementBuilder.create("renderInherited"));
                        resultSet.addElement(LookupElementBuilder.create("return"));
                        resultSet.addElement(LookupElementBuilder.create("returnIf"));
                        resultSet.addElement(LookupElementBuilder.create("ts"));
                        resultSet.addElement(LookupElementBuilder.create("verbatim"));

                    }
                }
        );
    }
}
