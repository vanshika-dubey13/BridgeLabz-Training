package com.encapsulation.bankingsystem;

//creating interface loanable
interface Loanable {
	
	//checking if bank account is lonable
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
