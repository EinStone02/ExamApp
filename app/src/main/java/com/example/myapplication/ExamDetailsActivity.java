package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExamDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_details);


        TextView textViewDetails = findViewById(R.id.textViewDetails);
        String examName = getIntent().getStringExtra("examName");

        textViewDetails.setText(getString(R.string.details_for_exam, examName));
    }
}

