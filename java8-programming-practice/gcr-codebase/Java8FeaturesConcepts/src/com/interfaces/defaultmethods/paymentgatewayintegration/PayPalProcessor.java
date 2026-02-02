package com.interfaces.defaultmethods.paymentgatewayintegration;

//Old provider - no change needed
class PayPalProcessor implements PaymentProcessor {
	public void processPayment(double amount) {
		System.out.println("PayPal processing payment of ₹" + amount);
	}
}
