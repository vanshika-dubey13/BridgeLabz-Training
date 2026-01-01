package com.encapsulation.ecommerceplatform;

//subclass
class Electronics extends Product implements Taxable {

	//constructor
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

  //overriding method of parent class 
    @Override
    public double calculateDiscount() {
        // Example: 10% discount on electronics
        return getPrice() * 0.10;
    }

  //overriding method of parent class 
    @Override
    public double calculateTax() {
        // Example: 15% tax
        return getPrice() * 0.15;
    }

  //overriding method of parent class 
    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + calculateTax();
    }
}
