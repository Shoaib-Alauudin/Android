package com.example.ghulam.reportcardversion_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCards = new ArrayList<>();

        reportCards.add(new ReportCard("Mathematics",R.mipmap.ic_launcher,"A"));
        reportCards.add(new ReportCard("English",R.mipmap.ic_launcher_round,"B"));
        reportCards.add(new ReportCard("Physics",R.mipmap.ic_launcher_round,"D"));
        reportCards.add(new ReportCard("Chemistry",R.mipmap.ic_launcher,"A+"));
        reportCards.add(new ReportCard("Urdu",R.mipmap.ic_launcher_round,"A"));
        reportCards.add(new ReportCard("Pak_studies",R.mipmap.ic_launcher,"B+"));
        reportCards.add(new ReportCard("Islamiat",R.mipmap.ic_launcher,"A"));
        reportCards.add(new ReportCard("French",R.mipmap.ic_launcher_round,"C"));
        reportCards.add(new ReportCard("Arabic",R.mipmap.ic_launcher,"F"));
        reportCards.add(new ReportCard("AI",R.mipmap.ic_launcher_round,"D+"));



        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new CustomReportCard(this,reportCards));


    }
}
