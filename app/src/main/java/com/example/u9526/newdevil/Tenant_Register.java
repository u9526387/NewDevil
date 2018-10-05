package com.example.u9526.newdevil;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tenant_Register extends AppCompatActivity {


    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant__register);
        toolbar = getSupportActionBar();
        toolbar.setTitle("房客註冊");

    }
}
