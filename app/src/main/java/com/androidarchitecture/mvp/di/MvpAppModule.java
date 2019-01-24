package com.androidarchitecture.mvp.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MvpAppModule {

    @Binds
    abstract Context getContext(Application application);

}
