package dsa.scenariobased.bst;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class EcommerceInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TreeMap keeps SKU sorted automatically (BST behavior)
        TreeMap<String, Double> inventory = new TreeMap<>();

        // 🔹 Taking initial inventory from user
        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter SKU for product " + i + ": ");
            String skuKey = sc.nextLine();

            System.out.print("Enter price for " + skuKey + ": ");
            double price = sc.nextDouble();
            // consume newline
            sc.nextLine(); 

            inventory.put(skuKey, price);
        }

        int choice;

        // Displaying menu
        do {
            System.out.println("\n===== E-Commerce Inventory Menu =====");
            System.out.println("1. Lookup Product by SKU");
            System.out.println("2. Update Product Price");
            System.out.println("3. Display All Products (Sorted by SKU)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            // consume newline
            sc.nextLine();

            switch (choice) {

                // 🔹 Scenario 1: Lookup
            	// searching for customers using product sku
                case 1:
                    System.out.print("Enter SKU to search: ");
                    String searchSKU = sc.nextLine();

                    if (inventory.containsKey(searchSKU)) {
                        System.out.println("Price: Rs. " + inventory.get(searchSKU));
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                // 🔹 Scenario 2: Price Update
                // updating products using sku key
                case 2:
                    System.out.print("Enter SKU to update: ");
                    String updateSKU = sc.nextLine();

                    if (inventory.containsKey(updateSKU)) {
                        System.out.print("Enter new price: ");
                        double newPrice = sc.nextDouble();
                        sc.nextLine(); // consume newline
                        inventory.put(updateSKU, newPrice);
                        System.out.println("Price updated successfully!");
                    } else {
                        System.out.println("SKU not found!");
                    }
                    break;

                // 🔹 Scenario 3: Sorted List
                // displaying all products in sorted order of sku
                case 3:
                    System.out.println("\n--- Product List (Sorted by SKU) ---");
                    for (Map.Entry<String, Double> entry : inventory.entrySet()) {
                        System.out.println(entry.getKey() + "  Rs. " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 4);

        sc.close();
    }
}
