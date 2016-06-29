package com.simon.demoaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simon.mymodule.ModuleUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModuleUtil.moduleMethod(this);
    }
}
