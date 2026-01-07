package com.oopsscenariobased.digitalbookstoresystem;

//Order class
public class Order {
	
	//attributes
	private String userName;
	private Book book;
	private int quantity;
	private double totalCost;
	private String status = "CREATED";

	//constructor
	public Order(String userName, Book book, int quantity) {
		this.userName = userName;
		this.book = book;
		this.quantity = quantity;
		calculateTotal();
	}
	
	//calculating book prices
	private void calculateTotal() {
		double discount = book.applyDiscount(quantity);
		totalCost = (book.getPrice() * quantity) - discount;
	}

	protected void updateStatus(String status) {
		this.status = status;
	}

	//displaying order details
	public void showOrder() {
		System.out.println("User: " + userName);
		System.out.println("Book: " + book.getTitle());
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Cost: Rs. " + totalCost);
		System.out.println("Order Status: " + status);
	}
}

