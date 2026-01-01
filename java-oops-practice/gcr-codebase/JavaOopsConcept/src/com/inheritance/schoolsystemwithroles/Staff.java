package com.inheritance.schoolsystemwithroles;

//subclass
public class Staff extends Person {
	
	//attributes
    String department;

    //constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    //displaying details
    void displayRole() {
        System.out.println("\nRole: Staff");
        System.out.println("Department: " + department);
    }
}
