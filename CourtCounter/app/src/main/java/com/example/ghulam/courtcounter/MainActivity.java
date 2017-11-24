package com.example.ghulam.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (teamAScore > teamBScore){
//            TextView textView = (TextView)findViewById(R.id.winningTeam);
//            textView.setText("Team A win");
//        }
//        else{
//            TextView textView = (TextView)findViewById(R.id.winningTeam);
//            textView.setText("Team B win");
//        }
    }

    public void threePlusPointsTeamA(View view){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void twoPlusPointsTeamA(View view){
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void freeHitTeamA(View view){
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamA(int score){
        TextView textView = (TextView)findViewById(R.id.team_A_Score);
        textView.setText(String.valueOf(score));
    }

    public void threePlusPointsTeamB(View view){

        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void twoPlusPointsTeamB(View view){

        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void freeHitTeamB(View view){
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void displayForTeamB(int score){
        TextView textView = (TextView)findViewById(R.id.team_B_Score);
        textView.setText(String.valueOf(score));
    }

    public void resetButton(View view){
        teamAScore = 0 ;
        teamBScore = 0 ;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }



}
