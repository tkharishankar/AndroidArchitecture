package com.androidarchitecture.mvp.login;

import com.androidarchitecture.mvp.di.MvpActivityScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginModule {

    @MvpActivityScope
    @Binds
    abstract LoginContract.Presenter loginPresenter(LoginPresenter presenter);
}
