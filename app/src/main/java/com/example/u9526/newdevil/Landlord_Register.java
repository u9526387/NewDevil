package com.example.u9526.newdevil;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Landlord_Register extends AppCompatActivity implements View.OnClickListener{



    private ActionBar toolbar;
    private EditText etPhone_number,etVerification,etName,etPassword,etPassword_check,etIntroduction;
    private Button btVerfication,finish_register;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_register);
        toolbar = getSupportActionBar();
        toolbar.setTitle("屋主註冊");

        etPhone_number = (EditText) findViewById(R.id.etPhone_number);
        etVerification = (EditText) findViewById(R.id.etVerification);
        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword_check = (EditText) findViewById(R.id.etPassword_check);


        progressDialog = new ProgressDialog(this);



    }

    @Override
    public void onClick(View v) {
        final String Phone_number = etPhone_number.getText().toString().trim();
        final String Verfication = etVerification.getText().toString().trim();
        final String Nmae = etName.getText().toString().trim();
        final String Password = etPassword.getText().toString().trim();
        final String Password_check = etPassword_check.getText().toString().trim();

        progressDialog.setMessage("正在輸入...");
        progressDialog.show();



    }
}
