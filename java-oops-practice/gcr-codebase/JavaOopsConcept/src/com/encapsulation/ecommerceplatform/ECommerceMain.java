package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

//main class
public class ECommerceMain {
    public static void main(String[] args) {
    	
    	//creating list of products
        List<Product> products = new ArrayList<>();

        //adding products
        products.add(new Electronics(101, "Laptop", 1000));
        products.add(new Clothing(102, "T-Shirt", 50));
        products.add(new Groceries(103, "Apple", 2));

        //calculating price
        PriceCalculator.calculateFinalPrices(products);
    }
}
