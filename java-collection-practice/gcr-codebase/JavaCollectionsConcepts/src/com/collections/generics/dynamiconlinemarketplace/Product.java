package com.collections.generics.dynamiconlinemarketplace;

public class Product<T extends Category> implements Discountable{

	//attributes
	private String name ;
	private double price ;
	private T category ;
	
	//constructor
	public Product(String name, double price, T category) {
		this.name = name ;
		this.price = price ;
		this.category = category ;
	}
	
	//getter and setter 
	public double getPrice() {
		return price ;
		
	}
	public void setPrice(double price) {
		this.price =price ;
		
	}
	public String getName() {
		return name ;
	}
	
	public T getCategory() {
		return category ;
	}
	
	//overriding method of interface
	@Override 
	public void applyDiscount(double percentage) {
		price = price*(1 - percentage/100) ;
		System.out.println(name +"(" + category +") discounted to " +price) ;
	}
	
}