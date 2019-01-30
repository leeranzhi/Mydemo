package com.leecode1988.mydemo.presenter;

import android.text.TextUtils;

import com.leecode1988.mydemo.model.User;
import com.leecode1988.mydemo.view.MainBaseView;

public class MainPresenter implements MainBasePresenter {
    private MainBaseView baseView;


    @Override
    public void attachView(MainBaseView v) {
        this.baseView = v;
    }

    @Override
    public void disattachView() {
        baseView = null;
    }

    @Override
    public void login(User user) {
        if (!TextUtils.isEmpty(user.getName()) && !TextUtils.isEmpty(user.getPassword())) {
            if (user.getName().equals("lee") && user.getPassword().equals("123")) {
                baseView.loginSuccess("SUCCESS!");
            } else {
                baseView.loginFailed("FAILED!");
            }
        } else {
            baseView.showToast("ERROR! Empty!");
        }
    }
}
