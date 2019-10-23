package com.hyw.app;

import android.app.Application;
import android.graphics.Color;

import com.hyw.toast.ToastUitl;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUitl.init(getApplicationContext())//初始化
//                .setBackground() 设置背景颜色 默认灰色白字
                .setTextColor(Color.BLACK)//设置字体颜色
                .setOrientation(ToastUitl.HORIZONTAL) //设置布局
                .setTextSize(24).setPosition(ToastUitl.DEFAULT); //显示的位置
    }
}
