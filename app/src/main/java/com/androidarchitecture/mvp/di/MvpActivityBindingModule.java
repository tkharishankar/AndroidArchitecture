package com.androidarchitecture.mvp.di;

import com.androidarchitecture.mvp.login.LoginActivity;
import com.androidarchitecture.mvp.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class MvpActivityBindingModule {

    @MvpActivityScope
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

}
