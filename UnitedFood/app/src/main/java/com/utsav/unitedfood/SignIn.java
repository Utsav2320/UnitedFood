package com.utsav.unitedfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    Button btnSignIn;
    TextView txtAlreadySignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnSignIn=findViewById(R.id.buttonSignIn);
        txtAlreadySignIn=findViewById(R.id.txtAlreadySignIn);

        txtAlreadySignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(SignIn.this,Login.class);
                startActivity(i);
            }
        });
    }
}