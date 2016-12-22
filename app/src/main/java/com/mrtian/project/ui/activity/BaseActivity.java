package com.mrtian.project.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mrtian.project.utils.ActivityCollector;


/**
 *
 * 所有Activity继承于BaseActivity
 * 方便管理所有的活动
 * 方便测试
 * Created by mrtian on 2016/7/7.
 */
public class BaseActivity extends AppCompatActivity {
    private final static String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
