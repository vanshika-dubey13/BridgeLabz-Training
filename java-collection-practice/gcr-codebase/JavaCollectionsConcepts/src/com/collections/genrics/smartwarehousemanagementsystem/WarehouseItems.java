package com.collections.genrics.smartwarehousemanagementsystem;

//Abstract base class
abstract class WarehouseItem {
	//attributes
	private String name;

	//constructor
	public WarehouseItem(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public abstract String getCategory();

	@Override
	public String toString() {
		return getCategory() + " Item: " + name;
	}
}
