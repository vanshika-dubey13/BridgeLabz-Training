package com.collections.genrics.smartwarehousemanagementsystem;

//subclass
public class Groceries extends WarehouseItem {
	//constructor
	 public Groceries(String name) {
	     super(name);
	 }

	 //overriding method of parent class
	 @Override
	 public String getCategory() {
	     return "Groceries";
	 }
}
