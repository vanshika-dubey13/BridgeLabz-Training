package com.oopsscenariobased.ridehailingapp;

public class Driver {
	
	//attributes
    private String name;
    private String licenseNumber;
    private double rating; 

    //constructor
    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}
