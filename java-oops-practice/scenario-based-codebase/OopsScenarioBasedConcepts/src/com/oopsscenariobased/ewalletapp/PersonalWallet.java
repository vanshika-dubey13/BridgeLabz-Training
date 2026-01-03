package com.oopsscenariobased.ewalletapp;

//subclass
class PersonalWallet extends Wallet {

	//constructor
    PersonalWallet(double initialBalance) {
        super(initialBalance);
    }
   

    //overriding method of parent class
    @Override
    public void transferTo(User receiver, double amount) {
        if (deductBalance(amount)) {
            receiver.wallet.addBalance(amount);
            System.out.println("Personal wallet transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
