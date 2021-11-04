package com.ahmed.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout clWelcome;

    private TextView txtLogin, txtSignup, txtPasswordForgot;
    private Button btnSubmit;

    TextInputLayout edtConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Eatmore);
        setContentView(R.layout.activity_main);

        clWelcome = findViewById(R.id.cl_welcome);
        txtLogin = findViewById(R.id.txtLogin);
        txtSignup = findViewById(R.id.txtSignUp);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtPasswordForgot = findViewById(R.id.txtForgot);
        edtConfirm = findViewById(R.id.edtConfirm);


        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtLogin.setBackground(getResources().getDrawable(R.drawable.text_selected));
                txtLogin.setTextColor(getResources().getColor(R.color.white_card));
                txtLogin.setElevation(4);
                txtSignup.setElevation(0);

                txtSignup.setBackground(getResources().getDrawable(R.drawable.text_unselected));
                txtSignup.setTextColor(getResources().getColor(R.color.red));

                btnSubmit.setText("Log in");
                txtPasswordForgot.setVisibility(View.VISIBLE);
                edtConfirm.setVisibility(View.GONE);
            }
        });

        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtLogin.setBackground(getResources().getDrawable(R.drawable.text_unselected));
                txtLogin.setTextColor(getResources().getColor(R.color.red));
                txtLogin.setElevation(0);
                txtSignup.setElevation(4);

                txtSignup.setBackground(getResources().getDrawable(R.drawable.text_selected));
                txtSignup.setTextColor(getResources().getColor(R.color.white_card));

                btnSubmit.setText("Sign Up");
                txtPasswordForgot.setVisibility(View.GONE);
                edtConfirm.setVisibility(View.VISIBLE);

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        clWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clWelcome.setVisibility(View.GONE);
            }
        });
    }
}