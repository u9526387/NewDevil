package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Try_homepage extends AppCompatActivity {


    private ActionBar toolbar;
    private Button register,btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_homepage);
        toolbar = getSupportActionBar();
        toolbar.setTitle("試用主頁");

        register = (Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Try_homepage.this, Choose_Identity.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Try_homepage.this.getApplicationContext(), R.anim.animation_up,R.anim.animation_up2).toBundle();
                startActivity(intent, bndlanimation);
            }
        });

        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(Try_homepage.this, LoginPage.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Try_homepage.this.getApplicationContext(), R.anim.animation_up,R.anim.animation_up2).toBundle();
                startActivity(intent1, bndlanimation);
            }
        });
    }
}
