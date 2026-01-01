package com.inheritance.schoolsystemwithroles;

//subclass
public class Student extends Person {
	
	//attributes
    String grade;

    //constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    //displaying details
    void displayRole() {
        System.out.println("\nRole: Student");
        System.out.println("Grade: " + grade);
    }
}
