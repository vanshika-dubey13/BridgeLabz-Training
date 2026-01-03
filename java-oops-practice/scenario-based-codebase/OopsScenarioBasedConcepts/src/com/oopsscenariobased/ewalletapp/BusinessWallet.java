package com.oopsscenariobased.ewalletapp;

//subclass
public class BusinessWallet extends Wallet {

	//constructor
    BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    //overriding method of parent class
    @Override
    public void transferTo(User receiver, double amount) {
    	// Applying 18% tax
        double tax = amount * 0.18; 
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.wallet.addBalance(amount);
            System.out.println("Business wallet transfer successful with Tax applied");
        } else {
            System.out.println("Insufficient balance for business transfer");
        }
    }
}
