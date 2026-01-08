package com.oopsscenariobased.smartparkingsystem;

//subclass
public class Car extends Vehicle {
	
	//constructor
    Car(String number) {
        super(number, 50);
    }

    //overriding method of parent class
    @Override
    public double calculateCharges(int hours) {
        return (baseRate * hours) + (hours > 5 ? 100 : 0);
    }
}
