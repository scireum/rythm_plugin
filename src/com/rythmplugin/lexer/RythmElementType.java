package com.rythmplugin.lexer;

import com.intellij.psi.tree.IElementType;
import com.rythmplugin.RythmBundle;
import com.rythmplugin.RythmLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmElementType extends IElementType {

    public RythmElementType(@NotNull @NonNls String debugName) {

        super(debugName, RythmLanguage.INSTANCE);

    }

    public String toString() {
        return "[Rythm]" + super.toString();
    }

    public String parseExpectedMessage(){
        return null;
    }


}
