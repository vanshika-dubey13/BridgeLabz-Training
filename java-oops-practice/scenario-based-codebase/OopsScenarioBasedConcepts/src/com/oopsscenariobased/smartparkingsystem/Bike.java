package com.oopsscenariobased.smartparkingsystem;

//subclass
class Bike extends Vehicle {
	
	//constructor
    Bike(String number) {
        super(number, 20);
    }

    //overriding method of parent class
    @Override
    public double calculateCharges(int hours) {
        return (baseRate * hours) + (hours > 6 ? 50 : 0);
    }
}