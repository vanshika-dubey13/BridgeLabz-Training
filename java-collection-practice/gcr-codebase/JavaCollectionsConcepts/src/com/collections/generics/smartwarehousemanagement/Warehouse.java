package com.collections.generics.smartwarehousemanagement;

public abstract class Warehouse {

	//attributes
	private String name ;
	
	//constructor
	public Warehouse(String name) {
		this.name = name ;
	}
	
	//getter method to get item name
	public String getName () {
		return name ;
	}
}
