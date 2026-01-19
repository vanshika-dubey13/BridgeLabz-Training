package com.collections.genrics.smartwarehousemanagementsystem;

//subclass
public class Furniture extends WarehouseItem {
	//constructor
	 public Furniture(String name) {
	     super(name);
	 }

	 //overriding method of parent class
	 @Override
	 public String getCategory() {
	     return "Furniture";
	 }
}

