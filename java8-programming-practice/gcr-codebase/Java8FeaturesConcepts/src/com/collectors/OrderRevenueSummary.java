package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

//class Order to store order details
class Order {
	//attributes
    String customer;
    double amount;

    //constructor
    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    //method to get customer
    public String getCustomer() {
        return customer;
    }

    //method to get amount
    public double getAmount() {
        return amount;
    }
}

//main class
public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Alice", 250.50),
            new Order("Bob", 100.00),
            new Order("Alice", 75.25),
            new Order("Bob", 200.00),
            new Order("Charlie", 300.00)
        );

        Map<String, Double> revenuePerCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getAmount)
                  ));

        System.out.println(revenuePerCustomer);
    }
}

