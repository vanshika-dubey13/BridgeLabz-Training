package com.encapsulation.ecommerceplatform;

import java.util.List;


class PriceCalculator {
    public static void calculateFinalPrices(List<Product> products) {
    	
    	//calculating prices
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = price + tax - discount;
            
            //displaying prices
            System.out.println(product.getName() + " Final Price: " + finalPrice);
            System.out.println("------------------------------------");
        }
    }
}
