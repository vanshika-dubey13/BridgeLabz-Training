package com.oopsscenariobased.restaurantorderingsystem;

import java.util.Random;

class FoodItem {
	
	//attributes
    private String name;
    private String category;
    protected double price;
    private int stock;

    //constructor
    public FoodItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = new Random().nextInt(10) + 1; 
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        if (stock > 0) stock--;
    }

    public void display() {
        System.out.println(name + " | " + category + " | Rs. " + price + " | Stock: " + stock);
    }
}
