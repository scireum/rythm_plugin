package com.rythmplugin.ide.reference.provider;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.impl.PsiMultiReference;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.ProcessingContext;
import com.rythmplugin.ide.reference.RythmJavEventHandlerReference;
import com.rythmplugin.imports.RythmJavConstants;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavEventHandlerReferenceProvider extends RythmJavControllerBasedReferenceProvider {
    private static final Logger LOG = Logger.getInstance("#" + RythmJavEventHandlerReferenceProvider.class.getName());

    @Override
    protected PsiReference[] getReferencesByElement(@NotNull PsiClass controllerClass,
                                                    XmlAttributeValue xmlAttributeValue,
                                                    ProcessingContext context) {
        final String attValueString = xmlAttributeValue.getValue();
        LOG.assertTrue(attValueString.startsWith("#"));

        final XmlAttribute attribute = (XmlAttribute)xmlAttributeValue.getParent();
        if (attribute == null || !RythmJavPsiUtil.isEventHandlerProperty(attribute)) return PsiReference.EMPTY_ARRAY;
        final String eventHandlerName = attValueString.substring(1);
        final PsiMethod[] methods = controllerClass.findMethodsByName(eventHandlerName, true);

        final PsiReference[] references = Arrays.stream(methods)
                .filter(psiMethod -> RythmJavEventHandlerReference.isHandlerMethodSignature(psiMethod, controllerClass))
                .map(psiMethod -> new RythmJavEventHandlerReference(xmlAttributeValue, psiMethod, controllerClass))
                .toArray(PsiReference.ARRAY_FACTORY::create);

        if (references.length == 1) {
            return references;
        }
        if (references.length > 1) {
            return new PsiReference[]{new PsiMultiReference(references, xmlAttributeValue)};
        }

        if (references.length == 0) {
            final XmlTag rootTag = ((XmlFile)xmlAttributeValue.getContainingFile()).getRootTag();
            if (rootTag == null || RythmJavConstants.FX_ROOT.equals(rootTag.getName())) {
                return PsiReference.EMPTY_ARRAY;
            }
        }
        return new PsiReference[]{new RythmJavEventHandlerReference(xmlAttributeValue, null, controllerClass)};
    }
}

