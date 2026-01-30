package com.lambdaexpressions;

import java.util.*;

class Product {
    int id;
    String name;
    double price;
    double rating;
    double discount;

    Product(int id, String name, double price, double rating, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price +
               " | Rating: " + rating +
               " | Discount: " + discount + "%";
    }
}

public class EcommerceCustomSort {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 55000, 4.5, 10));
        products.add(new Product(2, "Mobile", 30000, 4.7, 15));
        products.add(new Product(3, "Headphones", 2000, 4.2, 25));

        // 🔹 Sort by Price (Low to High)
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // 🔹 Sort by Rating (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // 🔹 Sort by Discount (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}

