package com.encapsulation.vehiclerental;

//subclass
class Bike extends Vehicle implements Insurable {
	
	//attributes
    private String insurancePolicyNo;

    //constructor
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
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
        // Example: Bike insurance is 5% of rentalRate per day
        return getRentalRate() * 0.05;
    }

  //overriding method of parent class
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNo;
    }
}