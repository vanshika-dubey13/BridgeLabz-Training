package com.oopsscenariobased.groceryshoppingapp;

class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

   //overriding method of parent class
    @Override
    public double getDiscount() {
        return getPrice() * 0.05; 
    }
}

