package com.oopsscenariobased.universitycourseenrollmentsystem;

class Student {
	
	//attributes
    protected int studentId;
    protected String name;
    private double gpa; 

    //constructor
    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    //updating gpa
    protected void calculateGPA(double totalPoints, int totalCredits) {
        gpa = totalPoints / totalCredits;
    }

    public double getTranscript() {
        return gpa;
    }
}


