package com.inheritance.onlineretailordermanagement;

//main class
public class OnlineRetailMain {
    public static void main(String[] args) {
    	
    	//creating objects of subclasses
        Order order = new Order("ORD001", "2025-01-10");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-01-11", "TRK12345");
        DelieveredOrder delivered = new DelieveredOrder("ORD003", "2025-01-12", "TRK67890", "2025-01-15");

        //displaying details
        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
