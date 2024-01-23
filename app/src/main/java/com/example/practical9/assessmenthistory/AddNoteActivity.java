package com.example.practical9.assessmenthistory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.practical9.R;

public class AddNoteActivity extends AppCompatActivity {

    private TextView TVDate, TVSubject, TVScore;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TVDate = findViewById(R.id.TVDate);
        TVSubject = findViewById(R.id.TVSubject);
        TVScore = findViewById(R.id.TVScore);

        // Retrieve data from the Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(QuizActivity.EXTRA_DATE)
                && intent.hasExtra(QuizActivity.EXTRA_SUBJECT)
                && intent.hasExtra(QuizActivity.EXTRA_SCORE)) {

            // Get data from Intent
            String date = intent.getStringExtra(QuizActivity.EXTRA_DATE);
            String subject = intent.getStringExtra(QuizActivity.EXTRA_SUBJECT);
            int score = intent.getIntExtra(QuizActivity.EXTRA_SCORE, 0);

            // Display or process the data
            TVDate.setText(date);
            TVSubject.setText(subject);
            TVScore.setText(String.valueOf(score));
        } else {
            // Handle the case where data is not provided
            // For example, you can set default values or show an error message
            // Here, I'm setting default values as an example
            TVDate.setText("Default Date");
            TVSubject.setText("Default Subject");
            TVScore.setText("0");
        }
    }
}
