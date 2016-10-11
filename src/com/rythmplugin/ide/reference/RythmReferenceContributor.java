package com.rythmplugin.ide.reference;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.patterns.XmlPatterns;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.JavaClassReferenceProvider;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.psi.xml.XmlProcessingInstruction;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.ProcessingContext;
import com.intellij.xml.XmlElementDescriptor;
import com.rythmplugin.file.RythmFileTypeFactory;
import com.rythmplugin.psi.RythmTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.intellij.patterns.PlatformPatterns.virtualFile;

/**
 * Created by mpl on 23.09.2016.
 */
public class RythmReferenceContributor extends PsiReferenceContributor {
    public static final JavaClassReferenceProvider CLASS_REFERENCE_PROVIDER = new JavaClassReferenceProvider();


    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression.class),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
                        String value = literalExpression.getValue() instanceof String ?
                                (String) literalExpression.getValue() : null;
                        if (value != null && value.startsWith("@import")) {
                            return new PsiReference[]{ new RythmReference(element, new TextRange(8, value.length() + 1))};

                           /*
                            PsiJavaFile javaFile = (PsiJavaFile) psiClass.getContaningFile();
                            PsiPackage pkg = JavaPsiFacade.getInstance(project).findPackage(javaFile.getPackageName());
                       */
                        }
                        return PsiReference.EMPTY_ARRAY;
                    }
                });
        registrar.registerReferenceProvider(XmlPatterns.xmlTag().inVirtualFile(virtualFile().withExtension(RythmFileTypeFactory.RYTHM_EXTENSION)),
                new MyJavaClassReferenceProvider());

        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiElement.class).inVirtualFile(virtualFile().withExtension(RythmFileTypeFactory.RYTHM_EXTENSION)),
                new ImportReferenceProvider());

    }

    private static class MyJavaClassReferenceProvider extends JavaClassReferenceProvider {
        @NotNull
        @Override
        public PsiReference[] getReferencesByElement(@NotNull PsiElement element) {
            String name = element instanceof XmlAttributeValue ? ((XmlAttributeValue)element).getValue()
                    : ((XmlTag)element).getName();
            return getReferencesByString(name, element, 1);
        }

        @NotNull
        @Override
        public PsiReference[] getReferencesByString(String str,
                                                    @NotNull final PsiElement position,
                                                    int offsetInPosition) {
            if (str.length() == 0) return PsiReference.EMPTY_ARRAY;
            final PsiReference[] references = super.getReferencesByString(str, position, offsetInPosition);
            final int offset = position instanceof XmlTag ? 1 : 0;
            if (references.length <= offset) return PsiReference.EMPTY_ARRAY;
            final PsiReference[] results = new PsiReference[references.length - offset];
            for (int i = 0; i < results.length; i++) {
                results[i] = new JavaClassReferenceWrapper(references[i], position);
            }
            return results;
        }

        private static class JavaClassReferenceWrapper implements PsiReference {
            private final PsiReference myReference;
            private final PsiElement myPosition;

            public JavaClassReferenceWrapper(PsiReference reference, PsiElement position) {
                myReference = reference;
                myPosition = position;
            }

            @Override
            public PsiElement getElement() {
                return myReference.getElement();
            }

            @Override
            public TextRange getRangeInElement() {
                return myReference.getRangeInElement();
            }

            @Nullable
            @Override
            public PsiElement resolve() {
                final PsiElement resolve = myReference.resolve();
                if (resolve != null) {
                    return resolve;
                }
                return getReferencedClass();
            }

            private PsiElement getReferencedClass() {
                if (myPosition instanceof XmlTag) {
                    final XmlElementDescriptor descriptor = ((XmlTag)myPosition).getDescriptor();
                    if (descriptor != null) {
                        final PsiElement declaration = descriptor.getDeclaration();
                        if (declaration instanceof PsiMethod && ((PsiMethod)declaration).hasModifierProperty(PsiModifier.STATIC)) {
                            final PsiClass containingClass = ((PsiMethod)declaration).getContainingClass();
                            if (containingClass != null && myReference.getCanonicalText().equals(containingClass.getName())) {
                                return containingClass;
                            }
                        }
                    }
                }
                else if (myPosition instanceof XmlAttributeValue) {
                    return RythmJavPsiUtil.findPsiClass(((XmlAttributeValue)myPosition).getValue(), myPosition);
                }
                return null;
            }

            @NotNull
            public String getCanonicalText() {
                return myReference.getCanonicalText();
            }

            public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
                String oldText = getOldName();
                final TextRange range = getRangeInElement();
                final String newText =
                        oldText.substring(0, range.getStartOffset() - 1) + newElementName + oldText.substring(range.getEndOffset() - 1);
                return setNewName(newText);
            }

            public PsiElement bindToElement(@NotNull PsiElement element)
                    throws IncorrectOperationException {
                String oldText = getOldName();
                final TextRange range = getRangeInElement();
                final String newText = (element instanceof PsiPackage ? ((PsiPackage)element).getQualifiedName() : ((PsiClass)element).getName()) +
                        oldText.substring(range.getEndOffset() - 1);
                return setNewName(newText);
            }

            private PsiElement setNewName(String newText) {
                if (myPosition instanceof XmlTag) {
                    return ((XmlTag)myPosition).setName(newText);
                }
                else {
                    final XmlElementFactory xmlElementFactory = XmlElementFactory.getInstance(myPosition.getProject());
                    final XmlAttribute xmlAttribute = xmlElementFactory.createXmlAttribute("attributeName", newText);
                    final XmlAttributeValue valueElement = xmlAttribute.getValueElement();
                    assert valueElement != null;
                    return myPosition.replace(valueElement);
                }
            }

            private String getOldName() {
                return myPosition instanceof XmlTag ? ((XmlTag)myPosition).getName() : ((XmlAttributeValue)myPosition).getValue();
            }

            public boolean isReferenceTo(PsiElement element) {
                return myReference.isReferenceTo(element) || getReferencedClass() == element;
            }

            @NotNull
            public Object[] getVariants() {
                return myReference.getVariants();
            }

            public boolean isSoft() {
                return true;
            }
        }
    }


}
