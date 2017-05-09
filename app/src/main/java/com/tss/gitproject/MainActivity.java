package com.tss.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        L.e("hubert create simple log.");
        Log.e(TAG,"this is user2 edit");
        Log.e(TAG,"this is user1 edit");
        Log.e(TAG,"this is user1 add edit.");
        Log.e(TAG,"this is user2 edit, too");
        L.e("hubert has add deploy keys");
    }
}
