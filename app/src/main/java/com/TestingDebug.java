package com;

import android.util.Log;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class TestingDebug {

    public static String memoryKiller(String passedString){
        ArrayList<String> list = new ArrayList<>();
        Log.d("TAG", "memoryKiller: " + passedString);
        Log.w(TAG, "logw: ", new Exception("Exception"));
        Log.e(TAG, "loge: ", new Exception("EXCPT2"));
        Log.i(TAG, "logi: ");
        list.add(memoryKiller(passedString));

           return  "HAHAHAHAH";
         }
    }

