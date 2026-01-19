package com.collections.generics.smartwarehousemanagement;

import java.util.List;

public class WarehouseUtil {

	//method to display items in the warehouse 
	public static void displayItems(List <? extends Warehouse > items) {
		for(Warehouse item : items) {
			System.out.println(item.getName()) ;
		}
	}
}
