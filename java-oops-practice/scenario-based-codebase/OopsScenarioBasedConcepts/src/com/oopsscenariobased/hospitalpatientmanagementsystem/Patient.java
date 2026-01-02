package com.oopsscenariobased.hospitalpatientmanagementsystem;

abstract class Patient {
	
	//attribute
    private String name;
    private int age;
    private String medicalHistory;

    //constructor
    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    //displaying patient details
    public String getSummary() {
        return "Patient: " + name + ", Age: " + age;
    }

    public abstract void displayInfo();
}
