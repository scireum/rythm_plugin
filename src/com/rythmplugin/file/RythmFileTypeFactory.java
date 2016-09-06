package com.rythmplugin.file;


import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;


/**
 * Created by mpl on 04.08.2016.
 */
public class RythmFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {

        fileTypeConsumer.consume(RythmFileType.INSTANCE, "rythm");
        fileTypeConsumer.consume(RythmFileType.INSTANCE, new WildcardFileNameMatcher("*.rythm.html"));
    }
}
