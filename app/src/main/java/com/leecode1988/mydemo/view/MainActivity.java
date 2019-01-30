package com.leecode1988.mydemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.leecode1988.mydemo.R;
import com.leecode1988.mydemo.model.User;
import com.leecode1988.mydemo.presenter.BasePresenter;
import com.leecode1988.mydemo.presenter.MainBasePresenter;
import com.leecode1988.mydemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainBaseView {

    private Button submit, reset;
    private TextView userName, userPassword;
    private MainBasePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.reset);
        userName = findViewById(R.id.user_name);
        userPassword = findViewById(R.id.user_password);
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(userName.getText().toString(), userPassword.getText().toString());
                mPresenter.login(user);
            }
        });
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(String msg) {
        showToast(msg);

    }

    @Override
    public void loginFailed(String msg) {
        showToast(msg);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.disattachView();
    }
}
