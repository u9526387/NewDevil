package com.example.u9526.newdevil;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Try_search2 extends AppCompatActivity {


    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_search2);
        toolbar = getSupportActionBar();
        toolbar.setTitle("房屋外在資料");


    }
}
