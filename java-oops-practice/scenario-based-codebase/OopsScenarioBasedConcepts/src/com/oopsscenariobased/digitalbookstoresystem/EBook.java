package com.oopsscenariobased.digitalbookstoresystem;

//subclass
class EBook extends Book {
	
	//constructor
	 public EBook(String title, String author, double price, int stock) {
	     super(title, author, price, stock);
	 }

	 // overriding method of parent class
	 @Override
	 public double applyDiscount(int quantity) {
	     return price * quantity * 0.10; 
	 }
}