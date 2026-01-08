package com.oopsscenariobased.smartparkingsystem;

class Truck extends Vehicle {
	
	//constructor
    Truck(String number) {
        super(number, 100);
    }

    //overriding method of parent class
    @Override
    public double calculateCharges(int hours) {
        return (baseRate * hours) + (hours > 4 ? 200 : 0);
    }
}