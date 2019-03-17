package com.kkaty.debuggingandmaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.TestingDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestingDebug.memoryKiller("startIt");
    }
}


