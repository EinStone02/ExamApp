package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewExamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exams);

        ListView listViewExams = findViewById(R.id.listViewExamsView);
        setupListView(listViewExams);
    }

    private void setupListView(ListView listView) {

        String[] exams = {"Math Exam", "Science Exam", "History Exam", "English Exam"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, exams);
        listView.setAdapter(adapter);
    }
}

