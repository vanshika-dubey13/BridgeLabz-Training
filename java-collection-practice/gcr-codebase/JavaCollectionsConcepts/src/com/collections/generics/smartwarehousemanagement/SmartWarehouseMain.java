package com.collections.generics.smartwarehousemanagement;

import java.util.*;
public class SmartWarehouseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Storage <Electronics> electronics = new Storage<>() ;
		Storage<Groceries> groceries = new Storage<>();
		Storage <Furniture> furniture = new Storage<> () ;
		
		//taking user choice as input, calling methods and displaying result accordingly
		System.out.println("====Smart Warehouse Management System====") ;
		
		System.out.println("Enter number of items to add : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n;i ++) {
			System.out.println("Choose item type(1.Electronics/ 2. Groceries/ 3. Furniture") ;
			int choice = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name of item : ") ;
			String name = sc.nextLine() ;
			
			switch(choice) {
			case 1: 
				electronics.addItem(new Electronics(name)) ;
				break ;
			case 2 :
				groceries.addItem(new Groceries(name)) ;
				break ;
			case 3:
				furniture.addItem(new Furniture(name)) ;
				break ;
			default : 
				System.out.println("Invalid Choice!") ;
			}
			
	        System.out.println("--- Electronics ---");
	        WarehouseUtil.displayItems(electronics.getItems());
	        System.out.println("====================");
	        System.out.println("--- Groceries ---");
	        WarehouseUtil.displayItems(groceries.getItems());
	        System.out.println("====================");
	        System.out.println("--- Furniture ---");
	        WarehouseUtil.displayItems(furniture.getItems());
	        System.out.println("====================");
		}
	}

}