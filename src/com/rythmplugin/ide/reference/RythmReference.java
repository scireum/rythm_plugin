package com.rythmplugin.ide.reference;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.rythmplugin.RythmUtil;
import com.rythmplugin.icons.RythmIcons;
import com.rythmplugin.psi.RythmRythm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpl on 23.09.2016.
 */
public class RythmReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String key;


    public RythmReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<RythmRythm> rythms = RythmUtil.findRythms(project, key);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (RythmRythm rythm : rythms) {
            results.add(new PsiElementResolveResult(rythm));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        List<RythmRythm> rythms = RythmUtil.findRythms(project);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final RythmRythm rythm : rythms) {
            if (rythm.getKey() != null && rythm.getKey().length() > 0) {
                variants.add(LookupElementBuilder.create(rythm).withIcon(RythmIcons.FILE).withTypeText(rythm.getContainingFile().getName()));
            }
        }
        return variants.toArray();
    }

}
