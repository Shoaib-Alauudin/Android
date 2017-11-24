package com.example.ghulam.reportcardversion_2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ghulam on 9/6/2017.
 */

public class CustomReportCard extends ArrayAdapter<ReportCard> {
    ArrayList<ReportCard> students;

    public CustomReportCard(Context context, ArrayList<ReportCard> student) {
        super(context, 0, student);
        this.students = student;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.reportcard, parent, false);
            Log.v("ConvertView","Convert View is null");
        }

        ReportCard reportCard = getItem(position);

        ImageView subject_Image = (ImageView)view.findViewById(R.id.subimage);
        TextView subject_Name = (TextView)view.findViewById(R.id.subname);
        TextView subject_grade = (TextView)view.findViewById(R.id.subgrade);

        subject_Image.setImageResource(reportCard.getSubjectIcon());
        subject_Name.setText(reportCard.getSubjectName());
        subject_grade.setText(reportCard.getGrade());

        return view;


    }
}

