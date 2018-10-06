package com.example.u9526.newdevil;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FillRentInfo1 extends AppCompatActivity {


    private ActionBar toolbar;
    private Button next_step1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_rent_info1);
        toolbar = getSupportActionBar();
        toolbar.setTitle("填寫房屋資料");

        next_step1 = (Button) findViewById(R.id.next_step1);
        next_step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FillRentInfo1.this, FillRentInfo2.class);
                startActivity(intent);
            }
        });


    }
}
