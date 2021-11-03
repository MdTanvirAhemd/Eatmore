package com.ahmed.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout clWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Eatmore);
        setContentView(R.layout.activity_main);

        clWelcome = findViewById(R.id.cl_welcome);
        clWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clWelcome.setVisibility(View.GONE);
            }
        });
    }
}