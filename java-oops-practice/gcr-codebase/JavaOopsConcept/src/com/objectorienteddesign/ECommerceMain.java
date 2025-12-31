package com.objectorienteddesign;

//Main class to test the system
public class ECommerceMain {
 public static void main(String[] args) {
     // Create some products
     Product laptop = new Product("Laptop", 1200.00);
     Product mouse = new Product("Mouse", 25.50);
     Product keyboard = new Product("Keyboard", 45.75);

     // Create a customer
     ECommerceCustomer alice = new ECommerceCustomer("Alice");

     // Create an order for Alice
     Order order1 = new Order(101);
     order1.addProduct(laptop);
     order1.addProduct(mouse);

     // Customer places the order
     alice.placeOrder(order1);

     // Create another order
     Order order2 = new Order(102);
     order2.addProduct(keyboard);
     order2.addProduct(mouse);
     alice.placeOrder(order2);

     // Show all orders of Alice
     alice.showOrders();
 }
}

