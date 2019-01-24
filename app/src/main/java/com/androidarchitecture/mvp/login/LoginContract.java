package com.androidarchitecture.mvp.login;

import com.androidarchitecture.mvp.MvpBasePresenter;
import com.androidarchitecture.mvp.MvpBaseView;

public interface LoginContract {

    interface View extends MvpBaseView<Presenter> {

    }

    interface Presenter extends MvpBasePresenter<View> {

        void validate(String username, String password);
    }
}
