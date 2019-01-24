package com.androidarchitecture.mvp.di;


import android.app.Application;

import com.androidarchitecture.mvp.MvpApplication;
import com.androidarchitecture.mvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {MvpAppModule.class,
        LoginModule.class,
        MvpActivityBindingModule.class,
        AndroidSupportInjectionModule.class,
        AndroidInjectionModule.class})
public interface MvpAppComponent extends AndroidInjector<MvpApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        MvpAppComponent.Builder application(Application application);

        MvpAppComponent build();
    }
}
