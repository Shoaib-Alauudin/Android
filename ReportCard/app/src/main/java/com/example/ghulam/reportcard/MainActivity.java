package com.example.ghulam.reportcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView)findViewById(R.id.textView);
        final ReportCard reportCard = new ReportCard("Shoaib Alauddin",1024,70,80,90,60,65);
        textView.setText(reportCard.displayResult());
        textView.setTextSize(24);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT,reportCard.getmStudentName()+" Report Card");
                intent.putExtra(Intent.EXTRA_TEXT,reportCard.displayResult());
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });
    }
}
