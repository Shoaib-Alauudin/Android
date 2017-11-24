package com.example.ghulam.reportcardversion_2;

/**
 * Created by Ghulam on 9/6/2017.
 */

public class ReportCard {
    private String subjectName;
    private int subjectIcon;
    private String grade;

    public ReportCard(){
        super();
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectIcon(int subjectIcon) {
        this.subjectIcon = subjectIcon;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectIcon() {
        return subjectIcon;
    }

    public String getGrade() {
        return grade;
    }

    public ReportCard(String subjectName, int subjectIcon, String grade) {
        super();
        this.subjectName = subjectName;
        this.subjectIcon = subjectIcon;
        this.grade = grade;
    }
}
