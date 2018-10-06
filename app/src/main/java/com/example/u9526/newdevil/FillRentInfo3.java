package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FillRentInfo3 extends AppCompatActivity {


    private Button keep_going;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_rent_info3);
        toolbar = getSupportActionBar();
        toolbar.setTitle("填寫房屋資料");

        keep_going = (Button) findViewById(R.id.keep_going);
        keep_going.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FillRentInfo3.this, FillRentInfo4.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(FillRentInfo3.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);


            }
        });

    }
}
