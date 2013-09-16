package com.px.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Project: PX
 * Author: jeff
 * Date: 2013:05:31 17:24
 * Version: 1.0
 * Description:
 */
public class WebViewActivity extends Activity {
    /**
     *  log±Í«©.
     */
    private static final String TAG = "WebviewActivity";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }
}
