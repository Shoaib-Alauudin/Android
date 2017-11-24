package com.example.ghulam.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Quiz_Instructions extends AppCompatActivity {
    TextView instruction_1,instruction_2,instruction_3,instruction_4,instruction_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__instructions);

        instruction_1 = (TextView)findViewById(R.id.quiz_instructions_TextView);
        instruction_2 = (TextView)findViewById(R.id.quiz_instructions_TextView2);
        instruction_3 = (TextView)findViewById(R.id.quiz_instructions_TextView3);
        instruction_4 = (TextView)findViewById(R.id.quiz_instructions_TextView4);
        instruction_5 = (TextView)findViewById(R.id.quiz_instructions_TextView5);

        String[] list_of_instructions = new String[5];
        list_of_instructions = getResources().getStringArray(R.array.Quiz_Instructions);
        instruction_1.setText(list_of_instructions[0]);
        instruction_2.setText(list_of_instructions[1]);
        instruction_3.setText(list_of_instructions[2]);
        instruction_4.setText(list_of_instructions[3]);
        instruction_5.setText(list_of_instructions[4]);


    }
}
