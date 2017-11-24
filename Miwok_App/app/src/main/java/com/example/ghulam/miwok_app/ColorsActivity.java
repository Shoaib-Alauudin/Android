package com.example.ghulam.miwok_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        Creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();

//      In a single line create a object of Word class
//      passing Constructor to it and then this objects add to the Words.add(Method)
        words.add(new Word("Wetetti","Red",R.drawable.color_red));
        words.add(new Word("Chiwiita","Mustard yellow",R.drawable.color_mustard_yellow));
        words.add(new Word("Topiisa","Dusty yellow",R.drawable.color_dusty_yellow));
        words.add(new Word("Chokokki","Green",R.drawable.color_green));
        words.add(new Word("Takkakki","Brown",R.drawable.color_brown));
        words.add(new Word("Topoppi","Gray",R.drawable.color_gray));
        words.add(new Word("Kulilli","Black",R.drawable.color_black));
        words.add(new Word("Kelelli","White",R.drawable.color_white));



        WordAdapter wordAdapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(wordAdapter);
    }
}
