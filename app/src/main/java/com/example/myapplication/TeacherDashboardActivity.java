package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TeacherDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);

        Button btnCreateExam = findViewById(R.id.btnCreateExam);
        Button btnEditExam = findViewById(R.id.btnEditExam);
        Button btnViewExams = findViewById(R.id.btnViewExams);


        btnCreateExam.setOnClickListener(v -> {
            Intent intent = new Intent(this, CreateExamActivity.class);
            startActivity(intent);
        });


        btnEditExam.setOnClickListener(v -> {
            Intent intent = new Intent(this, EditExamActivity.class);
            startActivity(intent);
        });


        btnViewExams.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewExamsActivity.class);
            startActivity(intent);
        });
    }
}
