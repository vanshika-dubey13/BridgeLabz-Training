package com.oopsscenariobased.pharmacyinventorandsalesystem;

import java.time.LocalDate;

//subclass
public class Injection extends Medicine {
	
	//constructor
    Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    //overriding method of parent class
    @Override
    public void checkExpiry() {
        System.out.println(name + " (Injection) requires strict expiry monitoring.");
    }
}

