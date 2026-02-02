package com.interfaces.defaultmethods.paymentgatewayintegration;

//New provider can override if needed
class StripeProcessor implements PaymentProcessor {
	public void processPayment(double amount) {
		System.out.println("Stripe processing payment of Rs. " + amount);
	}

	//overriding method of interface
	@Override
	public void refund(double amount) {
		System.out.println("Stripe refunding Rs. " + amount + " via Stripe API.");
	}
}
