package com.example.ghulam.miwok_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MiwokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miwok);

//      Find the view that shows the numbers category
        final TextView Numbers = (TextView)findViewById(R.id.numbers);

//      Set a ClickListener on that View
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              start a new activity to open a new intent
                Intent intent = new Intent(MiwokActivity.this, NumbersActivity.class);
                intent.putExtra(" ",R.color.category_numbers);
                startActivity(intent);
//                startActivity(new Intent(MiwokActivity.this, NumbersActivity.class));

            }
        });

//      Find the view that shows the family members category
        TextView family_member = (TextView)findViewById(R.id.family_members);

//      Set a clickListener on that view
        family_member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              start a new activity to open a new intent
                startActivity(new Intent(MiwokActivity.this, FamilyActivity.class));
            }
        });

//      Find the view that shows the Colors category
        TextView colors = (TextView)findViewById(R.id.colors);

//      Set a clickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              start a new activity to open a new intent
                startActivity(new Intent(MiwokActivity.this, ColorsActivity.class));
            }
        });

//      Find the view that shows the Phrases category
        TextView phrases = (TextView)findViewById(R.id.phrases);

//      Set a clickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              start a new activity to open a new intent
                startActivity(new Intent(MiwokActivity.this, PhrasesActivity.class));
            }
        });


    }
}
