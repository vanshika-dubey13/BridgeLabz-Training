package com.encapsulation.ecommerceplatform;

//subclass
class Clothing extends Product implements Taxable {

	//constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    //overriding method of parent class 
    @Override
    public double calculateDiscount() {
        // Example: 20% discount on clothing
        return getPrice() * 0.20;
    }

  //overriding method of parent class 
    @Override
    public double calculateTax() {
        // Example: 5% tax
        return getPrice() * 0.05;
    }

  //overriding method of parent class 
    @Override
    public String getTaxDetails() {
        return "Clothing Tax: " + calculateTax();
    }
}
