package com.androidarchitecture.mvp.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.androidarchitecture.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class LoginActivity extends DaggerAppCompatActivity implements LoginContract.View {

    private EditText passwordEditText;

    private EditText usernameEditText;

    private Button loginButton;

    @Inject
    LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordEditText = findViewById(R.id.passwordEditText);
        usernameEditText = findViewById(R.id.usernameEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.validate(passwordEditText.getText().toString().trim(),
                        usernameEditText.getText().toString().trim());
            }
        });
    }
}
