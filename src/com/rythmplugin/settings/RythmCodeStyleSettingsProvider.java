package com.rythmplugin.settings;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.openapi.options.Configurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;
import com.rythmplugin.RythmLanguage;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by mpl on 10.08.2016.
 */
public class RythmCodeStyleSettingsProvider extends CodeStyleSettingsProvider {

    @Override
    public CustomCodeStyleSettings createCustomSettings(CodeStyleSettings settings){
       return new RythmCodeStyleSettings(settings);
    }

    @Nullable
    @Override
    public String getConfigurableDisplayName(){
        return "Rythm";
    }
    @NotNull
    @Override
    public Configurable createSettingsPage(CodeStyleSettings settings, CodeStyleSettings originalSettings){
        return new CodeStyleAbstractConfigurable(settings, originalSettings, "Rythm") {
            @Override
            protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
                return new RythmCodeStyleMainPanel(getCurrentSettings(), settings);
            }

            @Nullable
            @Override
            public String getHelpTopic() {
                return null;
            }
        };
    }
    private static class RythmCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
        public RythmCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings){
            super(RythmLanguage.INSTANCE, currentSettings, settings);

        }
    }
}
