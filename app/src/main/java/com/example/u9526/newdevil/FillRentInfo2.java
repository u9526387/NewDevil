package com.example.u9526.newdevil;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FillRentInfo2 extends AppCompatActivity {


    private Button bt_nextstep2;
    private ActionBar toolbar;
    private Spinner sp_city,sp_region,sp_month,sp_year,sp_day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_rent_info2);
        toolbar = getSupportActionBar();
        toolbar.setTitle("填寫房屋資料");
        sp_city = (Spinner) findViewById(R.id.sp_city);
        sp_region = (Spinner) findViewById(R.id.sp_region);
        sp_year = (Spinner) findViewById(R.id.sp_year);
        sp_month = (Spinner) findViewById(R.id.sp_month);
        sp_day = (Spinner) findViewById(R.id.sp_day);

        bt_nextstep2 = (Button) findViewById(R.id.bt_nextstep2);
        bt_nextstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FillRentInfo2.this, FillRentInfo3.class);
                startActivity(intent);
            }
        });


                sp_city.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {


                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String[] region_set = new String[0];
                        if (position == 0) //選取台北市
                            region_set = getResources().getStringArray(R.array.RTaipei);
                        if (position == 1) //選取新北市
                            region_set = getResources().getStringArray(R.array.RNewTaipei);
                        if (position == 2) //選取台中市
                            region_set = getResources().getStringArray(R.array.RTaichung);
                        if (position == 3)
                            region_set = getResources().getStringArray(R.array.RTainan);
                        if (position == 4)
                            region_set = getResources().getStringArray(R.array.RKaohsiung);
                        if (position == 5)
                            region_set = getResources().getStringArray(R.array.RTaoyuan);
                        if (position == 6)
                            region_set = getResources().getStringArray(R.array.RHsinchuCity);
                        if (position == 7)
                            region_set = getResources().getStringArray(R.array.RHsinchuCountry);
                        if (position == 8)
                            region_set = getResources().getStringArray(R.array.RMiaoli);
                        if (position == 9)
                            region_set = getResources().getStringArray(R.array.RChanghua);
                        if (position == 10)
                            region_set = getResources().getStringArray(R.array.RKeelung);
                        if (position == 11)
                            region_set = getResources().getStringArray(R.array.RYilan);
                        if (position == 12)
                            region_set = getResources().getStringArray(R.array.RChiayiCity);
                        if (position == 13)
                            region_set = getResources().getStringArray(R.array.RPingtung);
                        if (position == 14)
                            region_set = getResources().getStringArray(R.array.RHualien);
                        if (position == 15)
                            region_set = getResources().getStringArray(R.array.RYunlin);
                        if (position == 16)
                            region_set = getResources().getStringArray(R.array.RNantou);
                        if (position == 17)
                            region_set = getResources().getStringArray(R.array.RChiayiCountry);
                        if (position == 18)
                            region_set = getResources().getStringArray(R.array.RTaitung);
                        if (position == 19)
                            region_set = getResources().getStringArray(R.array.RKinmen);
                        if (position == 20)
                            region_set = getResources().getStringArray(R.array.RPenghu);
                        else if (position == 21)
                            region_set = getResources().getStringArray(R.array.RLienchiang);

                        ArrayAdapter<String> region = new ArrayAdapter<String>(
                                FillRentInfo2.this, android.R.layout.simple_spinner_item, region_set);
                        region.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        sp_region.setAdapter(region);


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                sp_month.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String[] month_set = new String[0];
                        if (position == 0)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 1)
                            month_set = getResources().getStringArray(R.array.spn_Sday);
                        if (position == 2)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 3)
                            month_set = getResources().getStringArray(R.array.spn_Mday);
                        if (position == 4)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 5)
                            month_set = getResources().getStringArray(R.array.spn_Mday);
                        if (position == 6)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 7)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 8)
                            month_set = getResources().getStringArray(R.array.spn_Mday);
                        if (position == 9)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 10)
                            month_set = getResources().getStringArray(R.array.spn_Lday);
                        if (position == 11)
                            month_set = getResources().getStringArray(R.array.spn_Lday);


                        ArrayAdapter<String> month = new ArrayAdapter<String>(
                                FillRentInfo2.this, android.R.layout.simple_spinner_item, month_set);
                        month.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        sp_day.setAdapter(month);

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });





        }
    }


