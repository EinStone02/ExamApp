package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TakeExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_exam);

        TextView textViewQuestion = findViewById(R.id.textViewQuestion);
        RadioGroup radioGroupAnswers = findViewById(R.id.radioGroupAnswers);
        Button btnSubmitAnswer = findViewById(R.id.btnSubmitAnswer);


        textViewQuestion.setText(getString(R.string.question));


        btnSubmitAnswer.setOnClickListener(v -> {
            int selectedId = radioGroupAnswers.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
            } else {
                RadioButton selectedRadioButton = findViewById(selectedId);
                Toast.makeText(this, "You selected: " + selectedRadioButton.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}

