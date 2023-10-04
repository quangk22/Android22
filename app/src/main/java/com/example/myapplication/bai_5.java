package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class bai_5 extends AppCompatActivity {
    CheckBox checkAdroid;
    CheckBox checkIOS;
    CheckBox checkPHP;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        checkAdroid = (CheckBox) findViewById(R.id.checkAdroid);
        checkIOS = (CheckBox) findViewById(R.id.checkIOS);
        checkPHP = (CheckBox) findViewById(R.id.checkPHP);
        button3 = (Button) findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tb = "Bạn đã chọn môn học ";
                if (checkAdroid.isChecked()){
                    tb += "\n" + "Android";
                }
                if (checkIOS.isChecked()){
                    tb += "\n" + " IOS";
                }
                if (checkPHP.isChecked()){
                    tb += "\n" + "PHP";
                }
                Toast.makeText(getApplication(),tb,Toast.LENGTH_LONG).show();
            }
        });
    }
}