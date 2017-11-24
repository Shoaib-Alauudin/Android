package com.example.ghulam.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class Bussiness_Quiz_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussiness__quiz_);

        ArrayList<QuizQuestions> quiz_questions = new ArrayList<>();

        String[] list_of_questions = new String[20];
        list_of_questions = getResources().getStringArray(R.array.Questions);
        for (int i=0; i<list_of_questions.length; i++){
            QuizQuestions mquizQuestions = new QuizQuestions();
            mquizQuestions.mQuestions = list_of_questions[i];
            quiz_questions.add(mquizQuestions);
        }


        CustomLayout customLayout = new CustomLayout(this,quiz_questions);
        ListView listView = (ListView) findViewById(R.id.Quiz_Category_listView);
        listView.setAdapter(customLayout);
    }
}
