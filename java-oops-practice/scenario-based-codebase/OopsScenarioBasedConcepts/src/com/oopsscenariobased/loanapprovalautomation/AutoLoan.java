package com.oopsscenariobased.loanapprovalautomation;

//Auto Loan subclass
public class AutoLoan extends LoanApplication {
	public AutoLoan(Applicant applicant, int term) {
		super(applicant, term, 10.5);
	}
}