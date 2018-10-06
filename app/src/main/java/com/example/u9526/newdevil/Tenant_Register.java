package com.example.u9526.newdevil;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tenant_Register extends AppCompatActivity {


    private ActionBar toolbar;
    private Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant__register);
        toolbar = getSupportActionBar();
        toolbar.setTitle("房客註冊");

        next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenant_Register.this, FillRentInfo1.class);
                startActivity(intent);

            }
        });

    }
}
