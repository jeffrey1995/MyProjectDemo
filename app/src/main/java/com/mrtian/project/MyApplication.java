package com.mrtian.project;

import android.app.Application;
import android.content.Context;


/**
 * Created by tianxiying on 16/12/21.
 */
public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
    public static Context getContext() {
        return context;
    }
}
