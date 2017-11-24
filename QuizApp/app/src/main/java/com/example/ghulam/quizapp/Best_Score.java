package com.example.ghulam.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Best_Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best__score);

        int bestQuizScore = new QuizQuestions().getmScore();
        TextView bestScoreTextView = (TextView)findViewById(R.id.best_score_TextView);
        bestScoreTextView.setText(""+bestQuizScore);

    }
}
