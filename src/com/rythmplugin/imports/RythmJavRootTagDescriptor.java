package com.rythmplugin.imports;

import com.intellij.codeInsight.daemon.Validator;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiReference;
import com.intellij.psi.xml.XmlElement;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavRootTagDescriptor extends RythmJavClassTagDescriptorBase {
    private final XmlTag myXmlTag;

    public RythmJavRootTagDescriptor(XmlTag xmlTag) {
        super(RythmJavConstants.FX_ROOT);
        myXmlTag = xmlTag;
    }

    @Override
    public PsiClass getPsiClass() {
        final String className = myXmlTag.getAttributeValue(RythmJavConstants.TYPE);
        return className != null ? RythmJavPsiUtil.findPsiClass(className, myXmlTag) : null;
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(@NonNls String attributeName, @Nullable XmlTag context) {
        if (RythmJavConstants.TYPE.equals(attributeName)) {
            return new RootTagTypeAttributeDescriptor();
        }
        return super.getAttributeDescriptor(attributeName, context);
    }

    @Override
    public XmlAttributeDescriptor[] getAttributesDescriptors(@Nullable XmlTag context) {
        return Stream.concat(Arrays.stream(super.getAttributesDescriptors(context)), Stream.of(new RootTagTypeAttributeDescriptor()))
                .toArray(XmlAttributeDescriptor.ARRAY_FACTORY::create);
    }

    @Override
    public boolean isReadOnlyAttribute(String attributeName) {
        return !RythmJavConstants.TYPE.equals(attributeName) && super.isReadOnlyAttribute(attributeName);
    }

    @Override
    public void validate(@NotNull XmlTag context, @NotNull Validator.ValidationHost host) {
        super.validate(context, host);

        if (context.getParentTag() != null) {
            host.addMessage(context.getNavigationElement(), "<fx:root> is valid only as the root node of an FXML document",
                    Validator.ValidationHost.ErrorType.ERROR);
        }
    }

    @Override
    public String toString() {
        final PsiClass psiClass = getPsiClass();
        return "<" + getName() + " -> " + (psiClass != null ? psiClass.getName() : myXmlTag.getAttributeValue(RythmJavConstants.TYPE) + "?") + ">";
    }

    @Override
    public PsiElement getDeclaration() {
        final PsiClass psiClass = getPsiClass();
        return psiClass != null ? psiClass : myXmlTag;
    }

    public static class RootTagTypeAttributeDescriptor extends RythmJavPropertyAttributeDescriptor {
        public RootTagTypeAttributeDescriptor() {
            super(RythmJavConstants.TYPE, null);
        }

        @Override
        public boolean hasIdType() {
            return false;
        }

        @Override
        public boolean isEnumerated() {
            return false;
        }

        @Override
        public boolean isRequired() {
            return true;
        }

        @Override
        protected PsiClass getEnum() {
            return null;
        }

        protected boolean isConstant(PsiField field) {
            return false;
        }

        @Nullable
        @Override
        public String validateValue(XmlElement context, String value) {
            final PsiReference[] references = context.getReferences();
            if (references.length == 0 || references[references.length - 1].resolve() == null) {
                return "Cannot resolve class " + value;
            }
            return null;
        }

        @Override
        public String toString() {
            return RythmJavConstants.FX_ROOT + "#" + getName();
        }
    }
}
