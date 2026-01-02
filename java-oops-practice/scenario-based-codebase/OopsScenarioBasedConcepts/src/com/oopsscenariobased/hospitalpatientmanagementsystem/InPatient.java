package com.oopsscenariobased.hospitalpatientmanagementsystem;


class InPatient extends Patient {
	
	//attribute
    private int roomNumber;

    //constructor
    public InPatient(String name, int age, String medicalHistory, int roomNumber) {
        super(name, age, medicalHistory);
        this.roomNumber = roomNumber;
    }

  //overriding method of parent class Patient 
    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Room: " + roomNumber);
    }
}

