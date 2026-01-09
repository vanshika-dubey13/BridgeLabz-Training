package com.oopsscenariobased.restaurantorderingsystem;

import java.util.ArrayList;
import java.util.List;
class Order implements IOrderable {
	
	//attributes
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // constructor for combo meals
    public Order(FoodItem... comboItems) {
        for (FoodItem item : comboItems) {
            items.add(item);
            total += item.getPrice();
        }
    }

    public Order() {}

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            total += item.getPrice();
            item.reduceStock();
        } else {
            System.out.println("Item out of stock!");
        }
    }

    // Polymorphism
    public double applyDiscount() {
        if (total >= 1000) return total * 0.20;
        else if (total >= 500) return total * 0.10;
        else return 0;
    }

    public double calculateTotal() {
        return total - applyDiscount();
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Discount: Rs. " + applyDiscount());
        System.out.println("Final Amount: Rs. " + calculateTotal());
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}

