package com.oopsscenariobased.hospitalpatientmanagementsystem;

class Doctor {
	
	//attributes
    private String name;
    private String specialization;

    
    //constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    //displaying doctor details
    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}