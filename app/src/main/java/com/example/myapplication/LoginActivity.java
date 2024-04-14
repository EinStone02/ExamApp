package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v -> {
            String username = editTextUsername.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (validateAdminLogin(username, password)) {
                Toast.makeText(LoginActivity.this, "Login as a tutor was succesful !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, TeacherDashboardActivity.class);
                startActivity(intent);
            } else if (validateStudentLogin(username, password)) {
                Toast.makeText(LoginActivity.this, "Login as a student was succesful !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, TakeExamActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(LoginActivity.this, "Ungültiger Benutzername oder Passwort", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean validateAdminLogin(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

    private boolean validateStudentLogin(String username, String password) {
        return username.equals("student") && password.equals("student");
    }
}


