package com.example.weather_app_android_studio_java;

import android.preference.PreferenceActivity;

import androidx.annotation.NonNull;

import org.json.JSONObject;

public abstract class JsonHttpResponseHandler {
    public abstract void onSuccess(@NonNull int statusCode, PreferenceActivity.Header[] headers, JSONObject response);

    public abstract void onFailure(@NonNull int statusCode, PreferenceActivity.Header[] headers, Throwable throwable, JSONObject errorResponse);
}
