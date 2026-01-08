package com.oopsscenariobased.pharmacyinventorandsalesystem;

import java.time.LocalDate;
import java.util.Scanner;

//superclass
public class Medicine implements ISellable {
	
	//attributes
    protected String name;
    protected LocalDate expiryDate;
    protected int quantity;

    private double price; 

    // Constructor with default quantity
    Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    private double applyDiscount(double total) {
        return (total > 500) ? total * 0.9 : total;
    }

    public void sell(int qty) {
        if (qty <= quantity) {
            double total = applyDiscount(qty * price);
            quantity -= qty;
            System.out.println("Sold " + qty + " units. Total Bill: Rs. " + total);
        } else {
            System.out.println("Insufficient stock!");
        }
    }


    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println(name + " is EXPIRED.");
        } else {
            System.out.println(name + " is safe to use.");
        }
    }
}