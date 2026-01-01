package com.inheritance.onlineretailordermanagement;

//superclass
class Order {
	
	//attributes
    String orderId;
    String orderDate;

    //constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //displaying order status
    String getOrderStatus() {
        return "Order Placed";
    }
}
