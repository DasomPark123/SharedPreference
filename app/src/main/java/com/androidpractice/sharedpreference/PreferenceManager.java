package com.androidpractice.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

    public static final String PREFERENCES_NAME = "preferences";

    private static final String DEFAULT_VALUE_STRING = "";
    private static final boolean DEFAULT_VALUE_BOOLEAN = false;
    private static final int DEFAULT_VALUE_INT = -1;
    private static final long DEFAULT_VALUE_LONG = -1L;
    private static final float DEFAULT_VALUE_FLOAT = -1F;

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public static void setString(Context context, String key, String value) {
        SharedPreferences prefers = getPreferences(context);
        SharedPreferences.Editor editor = prefers.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void setInt(Context context, String key, int value) {
        SharedPreferences prefers = getPreferences(context);
        SharedPreferences.Editor editor = prefers.edit();
        editor.putInt(key, value);
        editor.commit();

    }

    public static void setLong(Context context, String key, long value) {
        SharedPreferences prefers = getPreferences(context);
        SharedPreferences.Editor editor = prefers.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static void setFloat(Context context, String key, float value) {
        SharedPreferences prefers = getPreferences(context);
        SharedPreferences.Editor editor = prefers.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public static void setBoolean(Context context,String key, boolean value){
        SharedPreferences prefers = getPreferences(context);
        SharedPreferences.Editor editor = prefers.edit();
        editor.putBoolean(key,value);
        editor.commit();
    }

    public static String getString(Context context, String key) {
        SharedPreferences prefers = getPreferences(context);
        String value = prefers.getString(key, DEFAULT_VALUE_STRING);
        return value;
    }

    public static int getInt(Context context, String key) {
        SharedPreferences prefers = getPreferences(context);
        int value = prefers.getInt(key, DEFAULT_VALUE_INT);
        return value;
    }

    public static long getLong(Context context, String key) {
        SharedPreferences prefers = getPreferences(context);
        long value = prefers.getLong(key, DEFAULT_VALUE_LONG);
        return value;
    }

    public static float getFloat(Context context, String key) {
        SharedPreferences prefers = getPreferences(context);
        float value = prefers.getFloat(key, DEFAULT_VALUE_FLOAT);
        return value;
    }

    public static boolean getBoolean(Context context,String key){
        SharedPreferences prefers = getPreferences(context);
        boolean value = prefers.getBoolean(key,DEFAULT_VALUE_BOOLEAN);
        return value;
    }


}
