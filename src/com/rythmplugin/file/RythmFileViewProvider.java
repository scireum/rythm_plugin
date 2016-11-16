package com.rythmplugin.file;

import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.ParserDefinition;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.LanguageSubstitutors;
import com.intellij.psi.MultiplePsiFilesPerDocumentFileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.PsiFileImpl;
import com.intellij.psi.templateLanguages.*;
import com.intellij.util.containers.ContainerUtil;
import com.rythmplugin.RythmLanguage;
import gnu.trove.THashSet;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import static com.rythmplugin.psi.RythmTypes.HTML;
import static com.rythmplugin.psi.RythmTypes.RYTHM;

/**
 * Created by mpl on 06.09.2016.
 */
public class RythmFileViewProvider extends MultiplePsiFilesPerDocumentFileViewProvider implements ConfigurableTemplateLanguageFileViewProvider {
    private final Language myBaseLanguage;
    private final Language myTemplateLanguage;

    private static final ConcurrentMap<String, TemplateDataElementType> TEMPLATE_DATA_TO_LANG = ContainerUtil.newConcurrentMap();

    private static TemplateDataElementType getTemplateDataElementType(Language lang) {
        TemplateDataElementType result = TEMPLATE_DATA_TO_LANG.get(lang.getID());
        if (result != null) return result;
        TemplateDataElementType created = new TemplateDataElementType("RYTHM_TEMPLATE_DATA", lang, HTML, RYTHM);
        TemplateDataElementType prevValue = TEMPLATE_DATA_TO_LANG.putIfAbsent(lang.getID(), created);

        return prevValue == null ? created : prevValue;
    }

    public RythmFileViewProvider(PsiManager manager, VirtualFile file, boolean physical, Language baseLanguage) {
        this(manager, file, physical, baseLanguage, getTemplateDataLanguage(manager, file));
    }

    public RythmFileViewProvider(PsiManager manager, VirtualFile file, boolean physical, Language baseLanguage, Language templateLanguage) {
        super(manager, file, physical);
        myBaseLanguage = baseLanguage;
        myTemplateLanguage = templateLanguage;
    }

    @Override
    public boolean supportsIncrementalReparse(@NotNull Language rootLanguage) {
        return false;
    }

    @NotNull
    private static Language getTemplateDataLanguage(PsiManager manager, VirtualFile file) {
        Language dataLang = TemplateDataLanguageMappings.getInstance(manager.getProject()).getMapping(file);
        if (dataLang == null) {
            dataLang = RythmLanguage.getDefaultTemplateLang().getLanguage();
        }
        Language substituteLang = LanguageSubstitutors.INSTANCE.substituteLanguage(dataLang, file, manager.getProject());

        //Test for Java implementation
    /* if (dataLang == null) {
            dataLang = RythmLanguage.getLanguage().getLanguage();
        }
        Language substituteLang = LanguageSubstitutors.INSTANCE.substituteLanguage(dataLang, file, manager.getProject());
    */

        if (TemplateDataLanguageMappings.getTemplateableLanguages().contains(substituteLang)) {
            dataLang = substituteLang;
        }
        return dataLang;
    }

    @NotNull
    @Override
    public Language getBaseLanguage() {
        return myBaseLanguage;
    }

    @NotNull
    @Override
    public Language getTemplateDataLanguage() {
        return myTemplateLanguage;
    }

    @NotNull
    @Override
    public Set<Language> getLanguages() {
        return new THashSet<>(Arrays.asList(new Language[]{myBaseLanguage, getTemplateDataLanguage()}));

    }

    @Override
    protected MultiplePsiFilesPerDocumentFileViewProvider cloneInner(VirtualFile virtualFile) {
        return new RythmFileViewProvider(getManager(), virtualFile, false, myBaseLanguage, myTemplateLanguage);
    }

    @Override
    protected PsiFile createFile(@NotNull Language lang) {
        ParserDefinition parserDefinition = getDefinition(lang);
        if (parserDefinition == null) {
            return null;
        }
        if (lang.is(getTemplateDataLanguage())) {
            PsiFileImpl file = (PsiFileImpl) parserDefinition.createFile(this);
            file.setContentElementType(getTemplateDataElementType(getBaseLanguage()));
            return file;
        } else if (lang.isKindOf(getBaseLanguage())) {
            return parserDefinition.createFile(this);
        } else {
            return null;
        }
    }

    private ParserDefinition getDefinition(Language lang) {
        ParserDefinition parserDefinition;
        if (lang.isKindOf(getBaseLanguage())) {
            parserDefinition = LanguageParserDefinitions.INSTANCE.forLanguage(lang.is(getBaseLanguage()) ? lang : getBaseLanguage());
        } else {
            parserDefinition = LanguageParserDefinitions.INSTANCE.forLanguage(lang);
        }
        return parserDefinition;
    }
}