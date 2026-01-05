package com.oopsscenariobased.managingcustomeraccounts;

public class CurrentAccount extends Account {
	
	//attributes
    private  double interestRate = 1.5;

    //refering to parent class object
    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    //overriding method of parent class
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
