package com.oopsscenariobased.pharmacyinventorandsalesystem;

import java.time.LocalDate;

//subclass
public class Syrup extends Medicine {
	
	//constructor
    Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    //overriding method of parent class
    @Override
    public void checkExpiry() {
        System.out.println(name + " (Syrup) must be discarded immediately after expiry!");
    }
}
