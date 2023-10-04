package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai_2 extends AppCompatActivity {
    EditText soA;
    EditText phepTinhInput;
    EditText soB;
    Button tinh;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_tinhtoan);
        soA = (EditText) findViewById(R.id.soA);
        soB = (EditText) findViewById(R.id.soB);
        phepTinhInput = (EditText) findViewById(R.id.phepTinh);
        tinh = (Button) findViewById(R.id.buttonTinh);
        ketqua = (TextView) findViewById(R.id.ketqua);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1Str = soA.getText().toString();
                String num2Str = soB.getText().toString();
                String phepTinh = phepTinhInput.getText().toString();


                float fSoA = Float.parseFloat(num1Str);
                float fSoB = Float.parseFloat(num2Str);

                float result = calculateResult(fSoA, phepTinh, fSoB);

                ketqua.setText("Kết quả: " + result);
            }

            private float calculateResult(float fSoA, String phepTinh, float fSoB) {
                switch (phepTinh) {
                    case "+":
                        return fSoA + fSoB;
                    case "-":
                        return fSoA - fSoB;
                    case "*":
                        return fSoA * fSoB;
                    case "/":
                        if (fSoB != 0) {
                            return fSoA / fSoB;
                        } else {
                            return Float.NaN; // Trường hợp chia cho 0
                        }
                    default:
                        return Float.NaN; // Trường hợp phép tính không hợp lệ
                }
            }
        });
    }
}