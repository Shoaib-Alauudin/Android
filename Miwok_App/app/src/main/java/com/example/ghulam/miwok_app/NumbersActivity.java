package com.example.ghulam.miwok_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        Creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();

//      In a single line create a object of Word class
//      passing Constructor to it and then this objects add to the Words.add(Method)
        words.add(new Word("Lutti","One",R.drawable.number_one));
        words.add(new Word("Otiiko","Two",R.drawable.number_two));
        words.add(new Word("Tolookosu","Three",R.drawable.number_three));
        words.add(new Word("Oyyisa","Four",R.drawable.number_four));
        words.add(new Word("Massokka","Five",R.drawable.number_five));
        words.add(new Word("Temmokka","Six",R.drawable.number_six));
        words.add(new Word("Kenekaku","Seven",R.drawable.number_seven));
        words.add(new Word("Kawinta","Eight",R.drawable.number_eight));
        words.add(new Word("Wo'e","Nine",R.drawable.number_nine));
        words.add(new Word("Na'aache","Ten",R.drawable.number_ten));


        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(wordAdapter);
        listView.setBackgroundResource(R.color.category_numbers);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "This is a NUmber activity class", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
