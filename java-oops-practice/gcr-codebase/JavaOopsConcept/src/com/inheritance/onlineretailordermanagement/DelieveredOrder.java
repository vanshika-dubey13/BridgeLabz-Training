package com.inheritance.onlineretailordermanagement;

//subclass
public class DelieveredOrder extends ShippedOrder {
	
	//attributes
	String deliveryDate;

	//constructor
    DelieveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    //overriding method of parent class 
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
