package com.inheritance.schoolsystemwithroles;

//subclass
public class Teacher extends Person {
	
	//attributes
    String subject;

    //constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //displaying details
    void displayRole() {
        System.out.println("\nRole: Teacher");
        System.out.println("Subject: " + subject);
    }
}
