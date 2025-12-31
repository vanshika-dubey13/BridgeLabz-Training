package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

//Order class
class Order {
	//attributes
	private int orderId;
	private List<Product> products; // Order aggregates multiple products

	public Order(int orderId) {
		this.orderId = orderId;
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public double calculateTotal() {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Order #" + orderId + " " + products + " | Total: Rs" + calculateTotal();
	}
}