package com.collections.generics.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

//creating Storage class using generics
public class Storage <T extends Warehouse>{
	
	//attributes
	private List<T> items = new ArrayList<> () ;

	//method to add item to list
	public void addItem(T item) {
		items.add(item) ;
	} 
	
	//method to display items
	public List<T> getItems() {
		return items ;
	}
	
}