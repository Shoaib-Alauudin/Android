package com.example.ghulam.quizapp;

/**
 * Created by Ghulam on 8/27/2017.
 */

public class QuizQuestions {
    public String mQuestions;
    private int mScore;
//    public static int mScore; //Static variable are called by without creating objects of that class

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public int getmScore() {
        return mScore;
    }
}
