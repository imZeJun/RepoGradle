package com.example.lizejun.repogradle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "ConstantValue=" + Constant.NAME + ",Boolean=" + BuildConfig.BOOLEAN_VALUE);
    }
}
