package com.oopsscenariobased.groceryshoppingapp;

class PerishableProduct extends Product {
    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

   //overriding method of parent class
    @Override
    public double getDiscount() {
        return getPrice() * 0.10; 
    }
}

