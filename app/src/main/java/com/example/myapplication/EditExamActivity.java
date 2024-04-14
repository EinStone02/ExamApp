package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EditExamActivity extends AppCompatActivity {

    private ListView listViewExams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_exam);

        listViewExams = findViewById(R.id.listViewExams);
        setupListView();
    }

    private void setupListView() {

        String[] examData = {"Math Exam", "Science Exam", "History Exam", "Geography Exam"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examData);
        listViewExams.setAdapter(adapter);

        listViewExams.setOnItemClickListener((parent, view, position, id) -> {
            String selectedExam = adapter.getItem(position);
            Intent intent = new Intent(this, ExamDetailsActivity.class);
            intent.putExtra("examName", selectedExam);
            startActivity(intent);
        });
    }
}

