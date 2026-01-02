package com.encapsulation.hospitalmanagement;

//subclass
public class InPatient extends Patient {
	//attributes
    private int daysAdmitted;
    private double dailyCharge;

    //constructor
    public InPatient(int id, String name, int age, String diagnosis,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

 // overriding method of parent class
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}
