package com.rythmplugin.settings;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

/**
 * Created by mpl on 10.08.2016.
 */
public class RythmCodeStyleSettings extends CustomCodeStyleSettings{
    public RythmCodeStyleSettings(CodeStyleSettings settings){
        super("RythmCodeStyleSettings", settings);
    }

    public boolean SPACE_EFORE_FUNTION_EXPRESSION_PARANTHESES = false;

}
