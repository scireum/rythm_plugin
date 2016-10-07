package com.rythmplugin.ide.reference.provider;

import com.intellij.psi.PsiClassType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.ProcessingContext;
import com.intellij.xml.XmlAttributeDescriptor;
import com.rythmplugin.ide.reference.RythmJavColorReference;
import com.rythmplugin.imports.RythmJavCommonNames;
import com.rythmplugin.imports.RythmJavPropertyAttributeDescriptor;
import com.rythmplugin.imports.RythmJavPsiUtil;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavColorReferenceProvider extends PsiReferenceProvider{
    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                 @NotNull ProcessingContext context) {
        final XmlAttributeValue attributeValue = (XmlAttributeValue)element;
        final PsiElement parent = attributeValue.getParent();
        if (parent instanceof XmlAttribute) {
            final XmlAttributeDescriptor descriptor = ((XmlAttribute)parent).getDescriptor();
            if (descriptor instanceof RythmJavPropertyAttributeDescriptor) {
                final PsiElement declaration = descriptor.getDeclaration();
                final PsiClassType propertyClassType = RythmJavPsiUtil.getPropertyClassType(declaration);
                if (propertyClassType != null && InheritanceUtil.isInheritor(propertyClassType, RythmJavCommonNames.JAVAFX_SCENE_PAINT)) {
                    return new PsiReference[] {new RythmJavColorReference(attributeValue)};
                }
            }
        }
        return PsiReference.EMPTY_ARRAY;
    }
}

