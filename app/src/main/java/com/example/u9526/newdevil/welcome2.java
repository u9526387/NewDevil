package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome2 extends AppCompatActivity {

    private ActionBar toolbar;
    private Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome2_activity);
        toolbar = getSupportActionBar();
        toolbar.setTitle("App介紹");

        next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(welcome2.this, Try_homepage.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(welcome2.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);
            }
        });

    }
}
