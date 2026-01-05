package com.oopsscenariobased.managingcustomeraccounts;

public class SavingsAccount extends Account {

	//attributes
    private double interestRate = 4.0;

    //referring to parent class
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    //overriding parent class method
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
