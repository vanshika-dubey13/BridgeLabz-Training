package com.collections.genrics.smartwarehousemanagementsystem;

import java.util.*;

//Main class
public class SmartWarehouseMain {

	// Wildcard method
	public static void displayItems(List<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();

		System.out.print("Enter number of items to add: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\n1. Electronics\n2. Groceries\n3. Furniture");
			System.out.print("Choose item type: ");
			int choice = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter item name: ");
			String name = sc.nextLine();

			switch (choice) {
				case 1 -> electronicsStorage.addItem(new Electronics(name));
				case 2 -> groceriesStorage.addItem(new Groceries(name));
				case 3 -> furnitureStorage.addItem(new Furniture(name));
				default -> System.out.println("Invalid choice!");
			}
		}

		System.out.println("\n--- Electronics Storage ---");
		displayItems(electronicsStorage.getItems());

		System.out.println("\n--- Groceries Storage ---");
		displayItems(groceriesStorage.getItems());

		System.out.println("\n--- Furniture Storage ---");
		displayItems(furnitureStorage.getItems());

		sc.close();
	}
}
