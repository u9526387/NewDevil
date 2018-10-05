package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class welcome1 extends AppCompatActivity {

    private ActionBar toolbar;
    private Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        toolbar = getSupportActionBar();
        toolbar.setTitle("App介紹");

        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(welcome1.this, Try_search.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(welcome1.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);

            }
        });
    }




}

