package com.interfaces.defaultmethods.paymentgatewayintegration;

public class PaymentGatewayIntegrationMain {
	public static void main(String[] args) {
		PaymentProcessor paypal = new PayPalProcessor();
		paypal.processPayment(500);
		paypal.refundPay(200);

		PaymentProcessor stripe = new StripeProcessor();
		stripe.processPayment(1000);
		stripe.refundPay(300);
	}
}
