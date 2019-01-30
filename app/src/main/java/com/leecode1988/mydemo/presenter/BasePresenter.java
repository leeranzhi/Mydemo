package com.leecode1988.mydemo.presenter;

public interface BasePresenter<T> {

    void attachView(T v);

    void disattachView();

}
