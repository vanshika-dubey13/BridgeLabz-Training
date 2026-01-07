package com.oopsscenariobased.loanapprovalautomation;

import java.util.Scanner;

abstract class LoanApplication implements IApprovable {
	
	//attributes
	protected Applicant applicant;
	protected int term;
	protected double interestRate;
	private boolean approved;

	//constructor
	public LoanApplication(Applicant applicant, int term, double interestRate) {
		this.applicant = applicant;
		this.term = term;
		this.interestRate = interestRate;
	}

	protected void setApproved(boolean status) {
		this.approved = status;
	}

	public boolean isApproved() {
		return approved;
	}

	//overriding method of interface
	@Override
	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 650 &&
				applicant.getIncome() >= applicant.getLoanAmount() / 10) {
			setApproved(true);
		}
		else {
			setApproved(false);
		}
		return approved;
	}

	//overriding method of interface
	@Override
	public double calculateEMI() {
		double P = applicant.getLoanAmount();
		double R = interestRate / (12 * 100);
		int N = term;

		return (P * R * Math.pow(1 + R, N)) /
				(Math.pow(1 + R, N) - 1);
	}
}






