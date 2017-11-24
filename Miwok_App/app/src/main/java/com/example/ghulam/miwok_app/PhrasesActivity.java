package com.example.ghulam.miwok_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        Creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();

//      In a single line create a object of Word class
//      passing Constructor to it and then this objects add to the Words.add(Method)

      words.add(new Word("minto wuksus","Where are you going?"));
        words.add(new Word("tinnә oyaase'nә","What is your name?"));
        words.add(new Word("oyaaset...", "My name is..."));
        words.add(new Word("michәksәs?", "How are you feeling?"));
        words.add(new Word("kuchi achit", "I’m feeling good."));
        words.add(new Word("әәnәs'aa?", "Are you coming?"));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming."));
        words.add(new Word("әәnәm", "I’m coming."));
        words.add(new Word("yoowutis", "Let’s go."));
        words.add(new Word("әnni'nem",  "Come here."));


        WordAdapter wordAdapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(wordAdapter);


    }
}

