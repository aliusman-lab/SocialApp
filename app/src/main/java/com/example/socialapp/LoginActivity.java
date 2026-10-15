
package com.example.socialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etLoginUser;
    private EditText etLoginPassword;

    private Button btnLogin;
    private Button btnGoogleLogin;
    private Button btnFacebookLogin;

    private TextView tvGoSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeViews();
        setupClickListeners();
    }

    private void initializeViews() {
        etLoginUser = findViewById(R.id.etLoginUser);
        etLoginPassword = findViewById(R.id.etLoginPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin);
        btnFacebookLogin = findViewById(R.id.btnFacebookLogin);

        tvGoSignup = findViewById(R.id.tvGoSignup);
    }

    private void setupClickListeners() {

        btnLogin.setOnClickListener(view -> {
            // Login functionality can be added here.
        });

        btnGoogleLogin.setOnClickListener(view -> {
            // Google sign-in functionality can be added here.
        });

        btnFacebookLogin.setOnClickListener(view -> {
            // Facebook sign-in functionality can be added here.
        });

        tvGoSignup.setOnClickListener(view -> {
            Intent signupIntent =
                    new Intent(LoginActivity.this, SignupActivity.class);

            startActivity(signupIntent);
        });
    }
}
