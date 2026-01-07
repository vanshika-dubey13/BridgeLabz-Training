package com.oopsscenariobased.loanapprovalautomation;

public class Applicant {
	
	//attributes
	 private String name;
	 private int creditScore;
	 private double income;
	 private double loanAmount;

	 //constructor
	 public Applicant(String name, int creditScore, double income, double loanAmount) {
	     this.name = name;
	     this.creditScore = creditScore;
	     this.income = income;
	     this.loanAmount = loanAmount;
	 }

	 public int getCreditScore() {
	     return creditScore;
	 }

	 public double getIncome() {
	     return income;
	 }

	 public double getLoanAmount() {
	     return loanAmount;
	 }

	 public String getName() {
	     return name;
	 }
}