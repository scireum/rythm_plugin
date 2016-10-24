package com.rythmplugin;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 17.10.2016.
 */
public class JavaInjector implements LanguageInjector {

    public static final String PREFIX = "{:";
    public static final String SUFFIX = ":}";

    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces injectionPlacesRegistrar) {

        if (!(host instanceof RythmJavaImpl)) {
            return;
        }
        final RythmJavaImpl cupJavaCode = (RythmJavaImpl) host;
        final String text = cupJavaCode.getText();
        if (!(text.startsWith(PREFIX) && text.endsWith(SUFFIX))) {
            return;
        }
        injectionPlacesRegistrar.addPlace(JavaLanguage.INSTANCE, new TextRange(SUFFIX.length(), text.length() - SUFFIX.length()), "public class Dummy { public void dummyMethod(){", "}}");
    }
}
