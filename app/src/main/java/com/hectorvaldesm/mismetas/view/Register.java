package com.hectorvaldesm.mismetas.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hectorvaldesm.mismetas.R;

public class Register extends AppCompatActivity {
private EditText inputUserRegister, inputEmailRegister, inputPass1Register, inputPass2Register;
private Button btnRegister, btnCancelRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Register
        btnRegister.setOnClickListener(v ->{

        });

        // Cancelar
        btnCancelRegister.setOnClickListener(v ->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void init(){
        inputUserRegister = findViewById(R.id.inputUserRegister);
        inputEmailRegister = findViewById(R.id.inputEmailRegister);
        inputPass1Register = findViewById(R.id.inputPass1Register);
        inputPass2Register = findViewById(R.id.inputPass2Register);
        btnRegister = findViewById(R.id.btnRegister);
        btnCancelRegister = findViewById(R.id.btnCancelRegister);
    }
}
