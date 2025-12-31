package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

//Customer class
class ECommerceCustomer {
	
	//attributes
	private String name;
	private List<Order> orders; // Customer has multiple orders

	//storing customer's names and orders placed
	public ECommerceCustomer(String name) {
		this.name = name;
		this.orders = new ArrayList<>();
	}

	public void placeOrder(Order order) {
		orders.add(order);
		System.out.println(name + " placed " + order);
	}

	//displaying orders
	public void showOrders() {
		System.out.println("Orders of " + name + ":");
		for (Order order : orders) {
			System.out.println(order);
		}
	}
}

