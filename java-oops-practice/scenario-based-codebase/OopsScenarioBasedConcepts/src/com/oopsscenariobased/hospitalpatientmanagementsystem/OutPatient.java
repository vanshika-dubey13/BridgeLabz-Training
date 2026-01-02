package com.oopsscenariobased.hospitalpatientmanagementsystem;

class OutPatient extends Patient {
	
	//attribute
    private String appointmentTime;

    //constructor
    public OutPatient(String name, int age, String medicalHistory, String appointmentTime) {
        super(name, age, medicalHistory);
        this.appointmentTime = appointmentTime;
    }

  //overriding method of parent class Patient 
    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Appointment: " + appointmentTime);
    }
}