package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choose_Identity extends AppCompatActivity {


    private ActionBar toolbar;
    private Button choose_landlord, choose_tenant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__identity);
        toolbar = getSupportActionBar();
        toolbar.setTitle("選擇註冊身分");

        choose_landlord = (Button) findViewById(R.id.choose_landlord);
        choose_landlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Choose_Identity.this, Landlord_Register.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Choose_Identity.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);
            }
        });

        choose_tenant = (Button) findViewById(R.id.choose_tenant);
        choose_tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(Choose_Identity.this, Tenant_Register.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Choose_Identity.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent1, bndlanimation);
            }
        });


    }
}
