package com.mrtian.project.utils;

import com.google.gson.Gson;

/**
 * Created by tianxiying on 2016/12/21.
 */
public class GsonProvider {
    private Gson gson;

    private static GsonProvider instance;

    private GsonProvider() {
        gson = new Gson();
    }

    public static GsonProvider getInstance() {
        if (instance == null) {
            synchronized (GsonProvider.class) {
                if (instance == null) {
                    instance = new GsonProvider();
                }
            }
        }
        return instance;
    }

    public Gson getGson() {
        return gson;
    }
}
