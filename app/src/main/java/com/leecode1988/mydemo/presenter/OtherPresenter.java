package com.leecode1988.mydemo.presenter;

import com.leecode1988.mydemo.view.OtherBaseView;

/**
 * author:LeeCode
 * create:2019/1/31 1:23
 */
public class OtherPresenter implements OtherBasePresenter {
    private OtherBaseView otherBaseView;

    @Override
    public void requestPhotos() {

    }

    @Override
    public void attachView(OtherBaseView v) {
        this.otherBaseView = v;
    }

    @Override
    public void disattachView() {
        otherBaseView = null;
    }
}
