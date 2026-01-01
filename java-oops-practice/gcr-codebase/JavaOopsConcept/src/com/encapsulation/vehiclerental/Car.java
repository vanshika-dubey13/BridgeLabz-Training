package com.encapsulation.vehiclerental;

//subclass
class Car extends Vehicle implements Insurable {
	
	//attributes
    private String insurancePolicyNo;

    ///constructor
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNo = insurancePolicyNo;
    }

    //overriding method of parent class 
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

  //overriding method of parent class 
    @Override
    public double calculateInsurance() {
        // Example: Car insurance is 10% of rentalRate per day
        return getRentalRate() * 0.1;
    }

  //overriding method of parent class 
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNo;
    }
}



