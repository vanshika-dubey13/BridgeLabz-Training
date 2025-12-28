package com.constructorandinstancevariables;

public class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to access to protected member
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);               // protected
    }
}
