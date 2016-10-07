package com.rythmplugin.imports;

import com.intellij.codeInsight.daemon.Validator;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.util.PsiUtil;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.ArrayUtil;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlElementDescriptor;
import com.intellij.xml.XmlElementsGroup;
import com.intellij.xml.XmlNSDescriptor;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavBuiltInTagDescriptor implements XmlElementDescriptor, Validator<XmlTag> {
    private final String myName;
    private final XmlTag myXmlTag;

    public RythmJavBuiltInTagDescriptor(String name, XmlTag tag) {
        myName = name;
        myXmlTag = tag;
    }

    @Override
    public String getQualifiedName() {
        return getName();
    }

    @Override
    public String getDefaultName() {
        return getName();
    }

    @Override
    public XmlElementDescriptor[] getElementsDescriptors(XmlTag context) {
        return XmlElementDescriptor.EMPTY_ARRAY;
    }

    @Nullable
    @Override
    public XmlElementDescriptor getElementDescriptor(XmlTag childTag, XmlTag contextTag) {
        if (RythmJavConstants.FX_DEFINE.equals(myName)) {
            return RythmJavClassTagDescriptorBase.createTagDescriptor(childTag);
        }
        return null;
    }

    @Override
    public XmlAttributeDescriptor[] getAttributesDescriptors(@Nullable XmlTag context) {
        final List<XmlAttributeDescriptor> descriptors = new ArrayList<XmlAttributeDescriptor>();
        final List<String> builtInAttributeNames = RythmJavConstants.FX_BUILT_IN_TAG_SUPPORTED_ATTRIBUTES.get(getName());
        if (builtInAttributeNames != null) {
            for (String attrName : builtInAttributeNames) {
                descriptors.add(RythmJavBuiltInAttributeDescriptor.create(attrName, getName()));
            }
        }
        RythmJavClassTagDescriptorBase.collectStaticAttributesDescriptors(context, descriptors);

        final XmlTag referencedTag = getReferencedTag(myXmlTag);
        if (referencedTag != null) {
            final XmlElementDescriptor referencedDescriptor = referencedTag.getDescriptor();
            if (referencedDescriptor != null) {
                final XmlAttributeDescriptor[] attributesDescriptors = referencedDescriptor.getAttributesDescriptors(referencedTag);
                if (attributesDescriptors != null) {
                    Collections.addAll(descriptors, attributesDescriptors);
                }
            }
        }

        final XmlTag includedRoot = getIncludedRoot(context);
        if (includedRoot != null) {
            final XmlElementDescriptor includedRootDescriptor = includedRoot.getDescriptor();
            if (includedRootDescriptor instanceof RythmJavClassTagDescriptorBase) {
                ((RythmJavClassTagDescriptorBase)includedRootDescriptor).collectInstanceProperties(descriptors);
            }
        }
        return descriptors.isEmpty() ? XmlAttributeDescriptor.EMPTY : descriptors.toArray(XmlAttributeDescriptor.EMPTY);
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(@NonNls String attributeName, @Nullable XmlTag context) {
        final List<String> defaultAttributeList = RythmJavConstants.FX_BUILT_IN_TAG_SUPPORTED_ATTRIBUTES.get(getName());
        if (defaultAttributeList != null) {
            if (defaultAttributeList.contains(attributeName)) {
                return RythmJavBuiltInAttributeDescriptor.create(attributeName, getName());
            }
            final PsiMethod propertySetter = RythmJavPsiUtil.findStaticPropertySetter(attributeName, context);
            if (propertySetter != null) {
                return new RythmJavStaticSetterAttributeDescriptor(propertySetter, attributeName);
            }

            final XmlTag referencedTag = getReferencedTag(myXmlTag);
            if (referencedTag != null) {
                final XmlElementDescriptor referencedDescriptor = referencedTag.getDescriptor();
                if (referencedDescriptor != null) {
                    return referencedDescriptor.getAttributeDescriptor(attributeName, referencedTag);
                }
            }

            if (context != null && RythmJavConstants.FX_INCLUDE.equals(getName())) {
                final XmlTag includedRoot = getIncludedRoot(context);
                if (includedRoot != null) {
                    final XmlElementDescriptor includedRootDescriptor = includedRoot.getDescriptor();
                    if (includedRootDescriptor != null) {
                        return includedRootDescriptor.getAttributeDescriptor(attributeName, includedRoot);
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static XmlTag getReferencedTag(XmlTag tag) {
        final String tagName = tag.getName();
        if (RythmJavConstants.FX_REFERENCE.equals(tagName) || RythmJavConstants.FX_COPY.equals(tagName)) {
            final XmlAttribute attribute = tag.getAttribute(RythmJavConstants.SOURCE);
            if (attribute != null) {
                final XmlAttributeValue valueElement = attribute.getValueElement();
                if (valueElement != null) {
                    final PsiReference reference = valueElement.getReference();
                    if (reference != null) {
                        final PsiElement resolve = reference.resolve();
                        if (resolve instanceof XmlAttributeValue) {
                            return PsiTreeUtil.getParentOfType(resolve, XmlTag.class);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static XmlTag getIncludedRoot(XmlTag context) {
        if (context == null) return null;
        final XmlAttribute xmlAttribute = context.getAttribute(RythmJavConstants.SOURCE);
        if (xmlAttribute != null) {
            final XmlAttributeValue valueElement = xmlAttribute.getValueElement();
            if (valueElement != null) {
                final PsiReference reference = valueElement.getReference();
                if (reference != null) {
                    final PsiElement resolve = reference.resolve();
                    if (resolve instanceof XmlFile) {
                        final XmlTag rootTag = ((XmlFile)resolve).getRootTag();
                        if (rootTag != null) {
                            return rootTag;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(XmlAttribute attribute) {
        return getAttributeDescriptor(attribute.getName(), attribute.getParent());
    }

    @Override
    public XmlNSDescriptor getNSDescriptor() {
        return null;
    }

    @Nullable
    @Override
    public XmlElementsGroup getTopGroup() {
        return null;
    }

    @Override
    public int getContentType() {
        return CONTENT_TYPE_UNKNOWN;
    }

    @Nullable
    @Override
    public String getDefaultValue() {
        return null;
    }

    @Override
    public PsiElement getDeclaration() {
        return myXmlTag;
    }

    @Override
    public String getName(PsiElement context) {
        return getName();
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public void init(PsiElement element) {
    }

    @Override
    public Object[] getDependences() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public void validate(@NotNull XmlTag context, @NotNull Validator.ValidationHost host) {
        final XmlTag referencedTag = getReferencedTag(context);
        if (referencedTag != null) {
            final XmlElementDescriptor descriptor = referencedTag.getDescriptor();
            if (descriptor != null) {
                final PsiElement declaration = descriptor.getDeclaration();
                if (declaration instanceof PsiClass) {
                    final PsiClass psiClass = (PsiClass)declaration;
                    RythmJavPsiUtil.isClassAcceptable(context.getParentTag(), psiClass, (errorMessage, errorType) ->
                            host.addMessage(context.getNavigationElement(), errorMessage, errorType));
                    final String contextName = context.getName();
                    if (RythmJavConstants.FX_COPY.equals(contextName)) {
                        boolean copyConstructorFound = false;
                        for (PsiMethod constructor : psiClass.getConstructors()) {
                            final PsiParameter[] parameters = constructor.getParameterList().getParameters();
                            if (parameters.length == 1 && psiClass == PsiUtil.resolveClassInType(parameters[0].getType())) {
                                copyConstructorFound = true;
                                break;
                            }
                        }
                        if (!copyConstructorFound) {
                            host.addMessage(context.getNavigationElement(), "Copy constructor not found for \'" + psiClass.getName() + "\'",
                                    Validator.ValidationHost.ErrorType.ERROR);
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        final String source = myXmlTag != null ? myXmlTag.getAttributeValue(RythmJavConstants.SOURCE) : null;
        return "<" + myName + (source != null ? " -> " + source : "") + ">";
    }
}
