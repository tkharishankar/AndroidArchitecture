package com.androidarchitecture.mvp;

import com.androidarchitecture.mvp.di.DaggerMvpAppComponent;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MvpApplication extends DaggerApplication {
    /**
     * Implementations should return an {@link AndroidInjector} for the concrete {@link
     * DaggerApplication}. Typically, that injector is a {@link Component}.
     */
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMvpAppComponent.builder().application(this).build();
    }
}

