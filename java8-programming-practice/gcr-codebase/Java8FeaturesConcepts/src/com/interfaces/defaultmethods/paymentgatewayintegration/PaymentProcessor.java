package com.interfaces.defaultmethods.paymentgatewayintegration;

//interface for processing payments
interface PaymentProcessor {
	void processPayment(double amount);

	// Default method
	default void refundPay(double amount) {
		System.out.println("Refund of Rs. " + amount + " processed using default refund logic.");
	}
}
