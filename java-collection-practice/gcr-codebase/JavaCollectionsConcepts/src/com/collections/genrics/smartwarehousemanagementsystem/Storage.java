package com.collections.genrics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

//Generic storage class with bounded type
public class Storage<T extends WarehouseItem> {
	//attributes
	private List<T> items = new ArrayList<>();

	//method to add items
	public void addItem(T item) {
		items.add(item);
	}

	//method to get items
	public List<T> getItems() {
		return items;
	}
}

