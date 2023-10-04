package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai_4 extends AppCompatActivity {
    EditText soThuNhat;
    EditText soThuHai;
    Button button;
    TextView KQMin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timmin2songuyen);
        soThuNhat = (EditText) findViewById(R.id.soThuNhat);
        soThuHai = (EditText) findViewById(R.id.soThuHai);
        button = (Button) findViewById(R.id.button);
        KQMin = (TextView)  findViewById(R.id.KQMin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String n = soThuNhat.getText().toString();
            String m = soThuHai.getText().toString();
            int N =Integer.parseInt(n);
            int M =Integer.parseInt(m);

            if (N > M){
                KQMin.setText("Min là :" + M);
            }else {
                KQMin.setText("Min là :" + N);
            }

            }
        });

    }
}