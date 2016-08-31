package com.rythmplugin;

import com.intellij.lang.Language;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmLanguage extends Language {
    public static final RythmLanguage INSTANCE = new RythmLanguage();

    private RythmLanguage() {
        super("Rythm");

    }
}
