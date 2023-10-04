package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai_3 extends AppCompatActivity {
    EditText textNhapN;
    Button buttonTinh;
    TextView textKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinhgiaithua);
        textNhapN = (EditText) findViewById(R.id.NhapN);
        buttonTinh = (Button) findViewById(R.id.buttonTinh);
        textKQ = (TextView) findViewById(R.id.textKQ);

        buttonTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N = textNhapN.getText().toString();
                int intN = Integer.parseInt(N);

                int kQ = 1;

                for (int i = 1; i <= intN ; i++){
                    kQ *= i;
                }

                textKQ.setText( intN +"! =" + kQ);

            }
        });


    }
}