package com.oopsscenariobased.digitalbookstoresystem;

import java.util.*;

//Base Book class
abstract class Book implements IDiscountable {
	
	//attributes
	private String title;
	private String author;
	protected double price;
	private int stock;

	//constructor
	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	//updating stock
	public boolean reduceStock(int quantity) {
		if (quantity <= stock) {
			stock -= quantity;
			return true;
		}
		return false;
	}

	//getters
	public int getStock() {
		return stock;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
}

