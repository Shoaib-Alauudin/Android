package com.example.ghulam.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.select_quiz_buttonView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent intent = new Intent(MainActivity.this, Quiz_Index_Activity.class);
                startActivity(intent);*/

                startActivity(new Intent(MainActivity.this, Quiz_Index_Activity.class));
            }
        });



        findViewById(R.id.quiz_instructions_buttonView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Quiz_Instructions.class));
            }
        });


        findViewById(R.id.best_score_buttonView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Best_Score.class);
                startActivity(intent);

            }
        });
    }
}
