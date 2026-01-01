package com.encapsulation.onlinefooddelievery;


//Abstract class
abstract class FoodItem {
	
	//attributes
	private String itemName;
	private double price;
	private int quantity;

	// Constructor
	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// getters only (no direct modification)
	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Concrete method
	public String getItemDetails() {
		return itemName + " | Price: " + price + " | Qty: " + quantity;
	}

	// Abstract method
	public abstract double calculateTotalPrice();
	}
