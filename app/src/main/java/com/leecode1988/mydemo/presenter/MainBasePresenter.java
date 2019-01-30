package com.leecode1988.mydemo.presenter;

import com.leecode1988.mydemo.model.User;
import com.leecode1988.mydemo.view.MainBaseView;

/**
 * author:LeeCode
 * create:2019/1/31 1:09
 */
public interface MainBasePresenter extends BasePresenter<MainBaseView>{

    void login(User user);
}
