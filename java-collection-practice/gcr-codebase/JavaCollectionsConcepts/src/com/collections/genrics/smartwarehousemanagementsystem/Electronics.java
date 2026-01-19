package com.collections.genrics.smartwarehousemanagementsystem;

//Subclasses
public class Electronics extends WarehouseItem {
	public Electronics(String name) {
		super(name);
	}

	//overriding method of parent class
	@Override
	public String getCategory() {
		return "Electronics";
	}
}
