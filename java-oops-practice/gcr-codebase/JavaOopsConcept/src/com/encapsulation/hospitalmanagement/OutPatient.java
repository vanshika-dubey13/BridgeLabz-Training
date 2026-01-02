package com.encapsulation.hospitalmanagement;

//subclass
public class OutPatient extends Patient {
	//attribute
    private double consultationFee;

    //constructor
    public OutPatient(int id, String name, int age, String diagnosis,
                      double consultationFee) {
        super(id, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

 // overriding method of parent class
    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
