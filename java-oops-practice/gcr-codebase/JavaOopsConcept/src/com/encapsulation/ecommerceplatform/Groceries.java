package com.encapsulation.ecommerceplatform;

//subclass
class Groceries extends Product {

	//constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

  //overriding method of parent class 
    @Override
    public double calculateDiscount() {
        // Example: 5% discount on groceries
        return getPrice() * 0.05;
    }

}
