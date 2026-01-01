package com.encapsulation.bankingsystem;

//subclass
class LoanableSavingsAccount extends SavingsAccount implements Loanable {

	//constructor
    public LoanableSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance, interestRate);
    }

    //overriding method of parent class
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for amount: " + amount);
        } else {
            System.out.println("Loan Denied");
        }
    }

  //overriding method of parent class
    @Override
    public boolean calculateLoanEligibility() {
        // Simple eligibility check: balance must be at least 1000
        return getBalance() >= 1000;
    }
}
