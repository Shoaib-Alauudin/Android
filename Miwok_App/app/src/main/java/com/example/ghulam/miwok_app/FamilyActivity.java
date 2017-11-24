package com.example.ghulam.miwok_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

//        Creating an array of words
            ArrayList<Word> words = new ArrayList<Word>();

//      In a single line create a object of Word class
//      passing Constructor to it and then this objects add to the Words.add(Method)
            words.add(new Word("Father","Epa",R.drawable.family_father));
            words.add(new Word("Engsi","Son",R.drawable.family_son));
            words.add(new Word("Tune","Daughter",R.drawable.family_daughter));
            words.add(new Word("Taachi","Older brother",R.drawable.family_older_brother));
            words.add(new Word("Chalitti","Younger brother",R.drawable.family_younger_brother));
            words.add(new Word("Tete","Older sister",R.drawable.family_older_sister));
            words.add(new Word("Kolliti","Younger sister",R.drawable.family_younger_sister));
            words.add(new Word("Ama","Grandmother",R.drawable.family_grandmother));
            words.add(new Word("Paapa","Grandfather",R.drawable.family_grandfather));


            WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_family);

            ListView listView = (ListView) findViewById(R.id.listView);

            listView.setAdapter(wordAdapter);


        }
    }
