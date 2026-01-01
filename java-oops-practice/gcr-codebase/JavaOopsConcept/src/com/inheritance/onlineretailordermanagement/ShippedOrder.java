package com.inheritance.onlineretailordermanagement;

class ShippedOrder extends Order {
	
	//attributes
    String trackingNumber;

    //constructor
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    //overriding method of parent class
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
