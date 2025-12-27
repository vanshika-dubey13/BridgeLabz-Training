package com.constructorandinstancevariables;

class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count when a product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mobile Phone", 30000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}

