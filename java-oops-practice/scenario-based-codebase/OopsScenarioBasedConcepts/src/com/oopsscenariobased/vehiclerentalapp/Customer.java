package com.oopsscenariobased.vehiclerentalapp;

public class Customer {
	
	//attributes
    private String customerId;
    private String name;

    //constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    //returning name of customer
    public String getName() {
        return name;
    }
}


