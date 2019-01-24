package com.androidarchitecture.mvp.login;

import android.util.Log;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter {


    @Inject
    LoginPresenter() {

    }

    @Override
    public void validate(String username, String password) {
        Log.i("username", "username" + username);
        Log.i("password", "password" + password);
    }
}
