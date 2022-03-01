package com.utsav.unitedfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.utsav.unitedfood.Adapter.ImageAdapter;

public class OnScreenBoarding extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dots;
    ImageAdapter imgAdapter;
    Button skip,createAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_screen_boarding);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager=findViewById(R.id.slider);
        dots=findViewById(R.id.dots);

        imgAdapter=new ImageAdapter(getApplicationContext());
        viewPager.setAdapter(imgAdapter);

        skip=findViewById(R.id.skip_btn);
        createAccountBtn=findViewById(R.id.createAccountBtn);
        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignIn.class);
                startActivity(i);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Login.class);
                startActivity(i);
            }
        });
    }
}