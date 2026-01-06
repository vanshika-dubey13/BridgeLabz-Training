package com.oopsscenariobased.groceryshoppingapp;

import java.util.*;

public class Cart implements ICheckout {

	//attributes
    private List<Product> products;
    private double totalPrice;

    // Constructor for empty cart
    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // Constructor for pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
        totalPrice += product.getPrice() * quantity; 
    }

    // Only Cart can update prices
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

   //overriding method of parent class
    @Override
    public double applyDiscount() {
        double discountAmount = 0;

        for (Product p : products) {
            discountAmount += p.getPrice() * p.getDiscount();
        }

        return discountAmount;
    }

    //overriding method of parent class
    @Override
    public void generateBill() {
        double discount = applyDiscount();
        double finalAmount = totalPrice - discount; 

        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}
