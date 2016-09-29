package com.rythmplugin.options;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mpl on 29.09.2016.
 */
public class RythmSettings implements PersistentStateComponent<RythmSettings>{

    //TODO remember to update @State for IDEA16


    public boolean ENABLE_JAVA_INJECTION = true;


    @Nullable
    @Override
    public RythmSettings getState() {
        return this;
    }

    @Override
    public void loadState(RythmSettings state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    public static RythmSettings getInstance() {
        return ServiceManager.getService(RythmSettings.class);
    }
}
