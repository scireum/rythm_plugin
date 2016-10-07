package com.rythmplugin.ide.reference;

import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.xml.util.ColorSampleLookupValue;
import com.intellij.xml.util.UserColorLookup;
import com.rythmplugin.imports.RythmJavCommonNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavColorReference extends PsiReferenceBase<XmlAttributeValue> {
    public RythmJavColorReference(XmlAttributeValue value) {
        super(value);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        final Project project = getElement().getProject();
        final PsiClass psiClass =
                JavaPsiFacade.getInstance(project).findClass(RythmJavCommonNames.JAVAFX_SCENE_COLOR, GlobalSearchScope.allScope(project));
        if (psiClass != null) {
            return psiClass.findFieldByName(getCanonicalText().toUpperCase(), false);
        }
        return null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        final ColorSampleLookupValue[] lookupValues = ColorSampleLookupValue.getColors();
        final Object[] vars = new Object[lookupValues.length + 1];
        for (int i = 0; i < lookupValues.length; i++) {
            final ColorSampleLookupValue value = lookupValues[i];
            vars[i] = new ColorSampleLookupValue(value.getName(), value.getValue(), true);
        }
        vars[lookupValues.length] = new UserColorLookup();
        return vars;
    }

    @Override
    public boolean isSoft() {
        return true;
    }
}

