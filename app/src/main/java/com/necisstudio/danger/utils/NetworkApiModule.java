package com.necisstudio.danger.utils;

/**
 * Created by vim on 26/09/16.
 */

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}