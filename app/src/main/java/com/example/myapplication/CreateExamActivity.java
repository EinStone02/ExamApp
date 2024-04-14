package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_exam);

        EditText examTitleEditText = findViewById(R.id.editTextExamTitle);
        EditText examDescriptionEditText = findViewById(R.id.editTextExamDescription);
        Button saveExamButton = findViewById(R.id.btnSaveExam);

        saveExamButton.setOnClickListener(v -> saveExam(examTitleEditText, examDescriptionEditText));
    }

    private void saveExam(EditText examTitleEditText, EditText examDescriptionEditText) {
        String title = examTitleEditText.getText().toString().trim();
        String description = examDescriptionEditText.getText().toString().trim();

        if (!title.isEmpty() && !description.isEmpty()) {
            Toast.makeText(this, "Exam saved successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        }
    }
}

