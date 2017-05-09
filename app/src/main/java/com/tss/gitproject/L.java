package com.tss.gitproject;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by hubert on 2017/5/9.
 */

public class L {

    private static final String TAG = "hubert_log";
    private static boolean debug=true;

    public static void e(String msg){
        if(debug){
            Log.e(TAG,msg);
        }
    }
}
