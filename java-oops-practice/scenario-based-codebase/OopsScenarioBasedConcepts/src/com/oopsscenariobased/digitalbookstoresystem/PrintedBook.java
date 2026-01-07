package com.oopsscenariobased.digitalbookstoresystem;

//subclass
public class PrintedBook extends Book {
	
	//constructor
	 public PrintedBook(String title, String author, double price, int stock) {
	     super(title, author, price, stock);
	 }

	//overriding method of parent class
	 @Override
	 public double applyDiscount(int quantity) {
	     if (quantity >= 2)
	         return price * quantity * 0.15; 
	     return 0;
	 }
}