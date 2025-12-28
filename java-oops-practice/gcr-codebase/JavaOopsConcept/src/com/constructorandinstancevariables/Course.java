package com.constructorandinstancevariables;

class Course {
    // Instance variables
    String courseName;
    int duration;   // in months
    double fee;

    // Class variable (common for all objects)
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("----------------------------");
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
