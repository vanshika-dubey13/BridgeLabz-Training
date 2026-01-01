package com.encapsulation.vehiclerental;

class Truck extends Vehicle implements Insurable {
	
	//attributes
    private String insurancePolicyNo;

    //constructor
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNo = insurancePolicyNo;
    }

  //overriding method of parent class
    @Override
    public double calculateRentalCost(int days) {
        // Example: Truck has a base + per day cost
        return getRentalRate() * days + 50; // Flat fee + per day rate
    }

  //overriding method of parent class
    @Override
    public double calculateInsurance() {
        // Truck insurance is 15% of rentalRate per day
        return getRentalRate() * 0.15;
    }

  //overriding method of parent class
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNo;
    }
}

