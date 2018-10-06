package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FillRentInfo4 extends AppCompatActivity {


    private Button bt_nextstep4;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_rent_info4);
        toolbar = getSupportActionBar();
        toolbar.setTitle("填寫房屋資料");

        bt_nextstep4 = (Button) findViewById(R.id.bt_nextstep4);
        bt_nextstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FillRentInfo4.this, FillRentInfo5.class);
                startActivity(intent);
            }
        });

    }
}
