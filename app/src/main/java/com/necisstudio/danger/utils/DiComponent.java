package com.necisstudio.danger.utils;

/**
 * Created by vim on 26/09/16.
 */

import com.necisstudio.danger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkApiModule.class})

public interface DiComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}
