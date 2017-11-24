package com.example.ghulam.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        Toast.makeText(getApplicationContext(),"THis is a Albums class",Toast.LENGTH_SHORT).show();
    }
}
