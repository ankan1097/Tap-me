package com.example.ankan.thinkb4utap;

/**
 * Created by SRIJIT DUTTA on 21-Nov-16.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
public class SaveSharedPreference {
    static final String PREF_HI_SCORE= ""+0;

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String hiscr)
    {
        Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_HI_SCORE, hiscr);
        editor.commit();
    }

    public static String getUserName(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_HI_SCORE, "");
    }

    public static void clearUserName(Context ctx)
    {
        Editor editor = getSharedPreferences(ctx).edit();
        editor.clear(); //clear all stored data
        editor.commit();
    }
}