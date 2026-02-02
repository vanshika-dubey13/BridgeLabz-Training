package com.scenariobased.optionalclass;

import java.util.Optional;

class Product {
    String name;
    Double price;
    Double discount;
    String couponCode;
    String seller;
    String description;
    String deliveryPartner;

    Product(String name, Double price, Double discount,
            String couponCode, String seller,
            String description, String deliveryPartner) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.couponCode = couponCode;
        this.seller = seller;
        this.description = description;
        this.deliveryPartner = deliveryPartner;
    }
}

public class OptionalEcommerceDemo {
	//main method
    public static void main(String[] args) {

        Product product = new Product(
                "Laptop",
                60000.0,
                // discount missing
                null,          
                // coupon missing
                null,          
                "ABC Sellers",
                // description missing
                null,         
                "BlueDart"
        );

        //  Apply default discount if not present
        Double discount = Optional.ofNullable(product.discount)
                .orElse(5.0);
        System.out.println("Discount: " + discount + "%");

        //  Fetch coupon code if present
        Optional.ofNullable(product.couponCode)
                .ifPresent(c -> System.out.println("Coupon Applied: " + c));

        //  Display seller details safely
        String seller = Optional.ofNullable(product.seller)
                .orElse("Seller details not available");
        System.out.println("Seller: " + seller);

        //  Product description default message
        String description = Optional.ofNullable(product.description)
                .orElse("No description available");
        System.out.println("Description: " + description);

        //  Fetch delivery partner info
        Optional.ofNullable(product.deliveryPartner)
                .ifPresent(d -> System.out.println("Delivery Partner: " + d));
    }
}

