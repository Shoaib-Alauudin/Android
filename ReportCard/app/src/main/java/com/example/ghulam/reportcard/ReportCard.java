package com.example.ghulam.reportcard;

/**
 * Created by Ghulam on 9/6/2017.
 */

public class ReportCard {
    private static final String SCHOOL_NAME = "Udacity";
    private static final double TOTAL = 5.0d;

    private String mStudentName;
    private int mRollNumber;

    private int mEnglishMarks;
    private int mMathMarks;
    private int mUrduMarks;
    private int mPhysicsMarks;
    private int mChemistryMarks;

    public ReportCard(String mStudentName, int mRollNumber, int mEnglishMarks,
                      int mMathMarks, int mUrduMarks, int mPhysicsMarks, int mChemistryMarks) {

        this.mStudentName = mStudentName;
        this.mRollNumber = mRollNumber;
        this.mEnglishMarks = mEnglishMarks;
        this.mMathMarks = mMathMarks;
        this.mUrduMarks = mUrduMarks;
        this.mPhysicsMarks = mPhysicsMarks;
        this.mChemistryMarks = mChemistryMarks;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    public static double getTOTAL() {
        return TOTAL;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public int getmRollNumber() {
        return mRollNumber;
    }

    public int getmEnglishMarks() {
        return mEnglishMarks;
    }

    public int getmMathMarks() {
        return mMathMarks;
    }

    public int getmUrduMarks() {
        return mUrduMarks;
    }

    public int getmPhysicsMarks() {
        return mPhysicsMarks;
    }

    public int getmChemistryMarks() {
        return mChemistryMarks;
    }

    public String getResult(int eng, int phy, int chem, int urdu, int math){
        String grade ;
        int sum = eng + phy + chem + phy + urdu;
        double percentage = sum / TOTAL;

        if (percentage >= 90.0){
            grade = "A";
        }
        else if (percentage < 90 && percentage >= 80){
            grade = "B";
        }

        else if (percentage < 80 && percentage >= 70){
            grade = "C";
        }

        else if (percentage < 70 && percentage >= 60){
            grade = "D";
        }

        else if (percentage < 60){
            grade = "Fail";
        }
        else
            grade = "Error";


        return grade;
    }

    public String displayResult(){
        return "REPORT CARD "+"\n\n"+
                "School Name : "+SCHOOL_NAME+"\n"+
                "Roll Number : "+mRollNumber+"\n"+
                "English Marks : "+mEnglishMarks+"\n"+
                "Math Marks : "+mMathMarks+"\n"+
                "Urdu Marks : "+mUrduMarks+"\n"+
                "Physics Marks: "+mPhysicsMarks+"\n"+
                "Chemistry Marks: "+mChemistryMarks+"\n"+
                "----------------------------------------"+"\n"+
                "Grade           : "+getResult(mEnglishMarks,mChemistryMarks,mMathMarks,mPhysicsMarks,mUrduMarks);

    }

}
