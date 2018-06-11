package com.hengtiansoft.toastutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hengtiansoft.toast.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.show("启动");
    }
}
