package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PassActivity extends AppCompatActivity {
    String pass;
    Toast tt;
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        t = findViewById(R.id.editText_Number);

        Button check = findViewById(R.id.button3);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pass = t.getText().toString();
                AlertDialog.Builder di = new AlertDialog.Builder(PassActivity.this);
                int a = pass.length();
                String pass1 = "1111111111111";
                String pass2 = "2222222222222";

                if(a!=13){
                    tt= Toast.makeText(PassActivity.this , "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก" , Toast.LENGTH_LONG);
                    tt.show();
                }

                else if(pass.equals(pass1) || pass.equals(pass2)){
                    di.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
                    di.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    di.setNegativeButton("OK" , null);
                    di.show();
                }

                else {
                    di.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
                    di.setMessage("คุณไม่มีมีสิทธิ์เลือกตั้ง");
                    di.setNegativeButton("OK" , null);
                    di.show();
                }

            }
        });







        Button back = findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}