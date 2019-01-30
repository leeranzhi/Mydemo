package com.leecode1988.mydemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leecode1988.mydemo.R;

public class OtherActivity extends AppCompatActivity implements OtherBaseView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void showToast(String msg) {

    }
}
