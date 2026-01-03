package com.dsa.linkedlist.singlylinkedlist.inventorymanagemetsystem;

public class ItemMain {
    public static void main(String[] args) {

        ItemOperations inventory = new ItemOperations();

        //performing operations on linked list
        inventory.addAtEnd(201, "Laptop", 5, 55000);
        inventory.addAtBeginning(202, "Mouse", 25, 500);
        inventory.addAtEnd(203, "Keyboard", 15, 1200);
        inventory.addAtPosition(2, 204, "Monitor", 7, 8000);

        System.out.println("Inventory List:");
        inventory.displayInventory();

        System.out.println("\nSearch Item by ID 203:");
        inventory.searchById(203);

        System.out.println("\nUpdate Quantity of Item ID 201:");
        inventory.updateQuantity(201, 8);
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSort by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.displayInventory();

        System.out.println("\nSort by Name (Descending):");
        inventory.sortByName(false);
        inventory.displayInventory();

        System.out.println("\nRemove Item with ID 202:");
        inventory.removeById(202);
        inventory.displayInventory();
    }
}
