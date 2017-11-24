package com.example.ghulam.quizapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ghulam on 8/27/2017.
 */

public class CustomLayout extends ArrayAdapter<QuizQuestions> {

    private ArrayList<QuizQuestions> quizQuestions;

    public CustomLayout(Context context, ArrayList<QuizQuestions> quizQuestionsArrayList){
        super(context, 0 ,quizQuestionsArrayList);
        this.quizQuestions = quizQuestionsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (convertView == null){
            Log.d("Main Activity","Convert View is Null");
            view = LayoutInflater.from(getContext()).inflate(R.layout.customlayout,parent,false);
        }

        else
            Log.d("Main Activity","Convert View is Not Null");

        QuizQuestions mquizQuestions = quizQuestions.get(position);
        TextView quiz_question = (TextView)view.findViewById(R.id.custom_layout_quiz_question);
        quiz_question.setText(mquizQuestions.mQuestions.toString());
        return view;

    }
}
