package com.oopsscenariobased.smartparkingsystem;

abstract class Vehicle implements IPayable {
	
	//attributes
    protected String vehicleNumber;
    protected double baseRate;

    //constructor
    Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

}



