package com.oopsscenariobased.groceryshoppingapp;

abstract class Product {
	
	//attributes
    private String name;
    private double price;
    private String category;

    //constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract double getDiscount();
}

