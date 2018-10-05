package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Try_search extends AppCompatActivity {


    private ActionBar toolbar;
    private Button keep_going;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_search);
        toolbar = getSupportActionBar();
        toolbar.setTitle("房屋內在資料");

        openDialog();



        keep_going = (Button) findViewById(R.id.keep_going);
        keep_going.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Try_search.this, Try_search2.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Try_search.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                startActivity(intent, bndlanimation);


            }
        });



            }

    public void openDialog(){
        Alert_dialog alert_dialog = new Alert_dialog();
        alert_dialog.show(getSupportFragmentManager(), "alert_dialog");

    }


    }

