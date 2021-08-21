package com.hectorvaldesm.mismetas.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hectorvaldesm.mismetas.R;

public class MainActivity extends AppCompatActivity {
    private EditText inputUserLogin, inputPassLogin;
    private CheckBox chkRemember;
    private Button btnLogin;
    private TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Login
        btnLogin.setOnClickListener(v ->{

        });

        // Register
        tvRegister.setOnClickListener(v ->{
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        });

    }

    private void init(){
        inputUserLogin = findViewById(R.id.inputUserLogin);
        inputPassLogin = findViewById(R.id.inputPassLogin);
        chkRemember = findViewById(R.id.chkRemember);
        btnLogin = findViewById(R.id.btnLogin);
        tvRegister = findViewById(R.id.tvRegister);
    }
}
