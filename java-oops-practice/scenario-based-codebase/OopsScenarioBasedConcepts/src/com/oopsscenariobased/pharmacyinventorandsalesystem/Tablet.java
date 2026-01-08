package com.oopsscenariobased.pharmacyinventorandsalesystem;

import java.time.LocalDate;

public class Tablet extends Medicine {
	
	//constructor
    Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    //overriding method of parent class
    @Override
    public void checkExpiry() {
        System.out.println(name + " (Tablet) expires on: " + expiryDate);
    }
}
