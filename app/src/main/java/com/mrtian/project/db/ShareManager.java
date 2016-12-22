package com.mrtian.project.db;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mrtian on 2016/7/7.
 */
public class ShareManager {
    private String TAG = "ShareManager";
    private SharedPreferences share;
    private SharedPreferences.Editor editor;


    public ShareManager(Context context) {
        super();
        share = context.getSharedPreferences(ShareContents.ShareName, Context.MODE_PRIVATE);
        editor = share.edit();
    }

    public void clear() {
        editor.clear().commit();
    }

    public boolean getIsNewPeople() {
        return share.getBoolean(ShareContents.isNewPeople, true);
    }

    public void setIsNewPople(boolean newPople) {
        editor.putBoolean(ShareContents.isNewPeople, newPople).commit();
    }
}
