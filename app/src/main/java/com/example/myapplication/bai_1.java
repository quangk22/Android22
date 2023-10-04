package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class bai_1 extends AppCompatActivity {
    TextView userName;
    TextView password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (TextView) findViewById(R.id.textUserName);
        password = (TextView) findViewById(R.id.textPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = userName.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("quang") && pass.equals("1234")) {
                    Toast.makeText(getApplication(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplication(),"Đăng thất bại",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}