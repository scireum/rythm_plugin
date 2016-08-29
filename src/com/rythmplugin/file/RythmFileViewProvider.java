package com.rythmplugin.file;

import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.openapi.fileTypes.PlainTextLanguage;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.LanguageSubstitutors;
import com.intellij.psi.MultiplePsiFilesPerDocumentFileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.PsiFileImpl;
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings;
import com.intellij.psi.templateLanguages.TemplateLanguage;
import com.rythmplugin.RythmLanguage;
import com.rythmplugin.lexer.RythmTokenTypes;
import gnu.trove.THashSet;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Set;


/**
 * Created by mpl on 26.08.2016.
 */
public class RythmFileViewProvider extends MultiplePsiFilesPerDocumentFileViewProvider {
    private final Language rythmDataLanguage;


    public RythmFileViewProvider(PsiManager manager, VirtualFile file, boolean physical) {
        super(manager, file, physical);


        Language dataLang = TemplateDataLanguageMappings.getInstance(manager.getProject()).getMapping(file);
        if (dataLang == null) dataLang = StdFileTypes.HTML.getLanguage();

        if (dataLang instanceof TemplateLanguage) {
            rythmDataLanguage = PlainTextLanguage.INSTANCE;
        } else {
            rythmDataLanguage = LanguageSubstitutors.INSTANCE.substituteLanguage(dataLang, file, manager.getProject());
        }
    }

    public RythmFileViewProvider(PsiManager psiManager, VirtualFile virtualFile, boolean physical, Language rythmDataLanguage) {
        super(psiManager, virtualFile, physical);
        this.rythmDataLanguage = rythmDataLanguage;
    }

    @NotNull
    @Override
    public Language getBaseLanguage() {
        return RythmLanguage.INSTANCE;
    }

    @NotNull
    //@Override
    public Language getTemplateDataLanguage() {
        return rythmDataLanguage;
    }

    @NotNull
    @Override
    public Set<Language> getLanguages() {
        return new THashSet<Language>(Arrays.asList(new Language[]{RythmLanguage.INSTANCE, rythmDataLanguage}));

    }

    @Override
    protected MultiplePsiFilesPerDocumentFileViewProvider cloneInner(VirtualFile virtualFile) {
        return new RythmFileViewProvider(getManager(), virtualFile, false, rythmDataLanguage);

    }

    @Override
    protected PsiFile createFile(Language lang) {
        if (lang == rythmDataLanguage) {
            PsiFileImpl file = (PsiFileImpl) LanguageParserDefinitions.INSTANCE.forLanguage(lang).createFile(this);
            file.setContentElementType(RythmTokenTypes.TEMPLATE_DATA);
            return file;


        } else if (lang == RythmLanguage.INSTANCE) {
            return LanguageParserDefinitions.INSTANCE.forLanguage(lang).createFile(this);
        } else {
            return null;
        }

    }
}

