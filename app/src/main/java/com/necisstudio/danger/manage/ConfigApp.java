package com.necisstudio.danger.manage;

import android.app.Application;

import com.necisstudio.danger.utils.DiComponent;

/**
 * Created by vim on 26/09/16.
 */

public class ConfigApp extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
