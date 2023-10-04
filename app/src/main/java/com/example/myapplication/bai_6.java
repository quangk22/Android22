package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class bai_6 extends AppCompatActivity {
    EditText inputA;
    EditText inputB;
    EditText inputC;
    Button tiepTuc;
    Button giaiPT;
    Button thoat;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai_6);
        inputA = (EditText) findViewById(R.id.inputA);
        inputB = (EditText) findViewById(R.id.inputB);
        inputC = (EditText) findViewById(R.id.inputC);
        tiepTuc = (Button) findViewById(R.id.tiepTuc);
        giaiPT = (Button) findViewById(R.id.giaiPT);
        thoat = (Button) findViewById(R.id.thoat);
        kq = (TextView) findViewById(R.id.ketQuaPT);

        giaiPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = inputA.getText().toString();
                String B = inputB.getText().toString();
                String C = inputC.getText().toString();
                int a = Integer.parseInt(A);
                int b = Integer.parseInt(B);
                int c = Integer.parseInt(C);

                int delta = b * b - 4 * a * c;
                if (delta >= 0){
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    kq.setText("Phương trình có 2 nghiệm phân biệt:" + x1 + x2);
                }else if (delta == 0){
                    double x = -b / (2 * a);
                    kq.setText("Phương trình có nghiệm kép:" + x);
                }else {
                    kq.setText("Phương trình không có nghiệm thực.");
                }
            }
        });
        tiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               inputA.setText("");
                inputB.setText("");
                inputC.setText("");
            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}