package com.leecode1988.mydemo.view;

/**
 * author:LeeCode
 * create:2019/1/31 1:02
 */
public interface MainBaseView extends BaseView {

    void loginSuccess(String msg);

    void loginFailed(String msg);

}
