package com.example.ghulam.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Quiz_Index_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__index_);

        findViewById(R.id.bussiness_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Bussiness_Quiz_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.iq_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Quiz_Index_Activity.this, Iq_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.sport_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Sport_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.geograpy_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Geograpy_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.animal_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Animals_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.science_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Science_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.history_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, History_Quiz.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.entertainment_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz_Index_Activity.this, Entertainment_Quiz.class);
                startActivity(intent);
            }
        });
    }
}
