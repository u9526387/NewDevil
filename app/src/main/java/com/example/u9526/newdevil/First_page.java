package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_page extends AppCompatActivity {

    private ActionBar toolbar;
    private Button not_first_time,first_time,go_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        toolbar = getSupportActionBar();
        toolbar.setTitle("請選擇");

        not_first_time = (Button) findViewById(R.id.not_first_time);
        first_time = (Button) findViewById(R.id.first_time);
        go_register = (Button) findViewById(R.id.go_register);

        first_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(First_page.this, welcome1.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(First_page.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);

            }
        });

        not_first_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(First_page.this, LoginPage.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(First_page.this.getApplicationContext(), R.anim.animation_up,R.anim.animation_up2).toBundle();
                startActivity(intent1, bndlanimation);
            }
        });

        go_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(First_page.this, Choose_Identity.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(First_page.this.getApplicationContext(), R.anim.animation_up,R.anim.animation_up2).toBundle();
                startActivity(intent1, bndlanimation);
            }
        });







    }


}
