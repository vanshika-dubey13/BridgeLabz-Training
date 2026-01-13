package com.oopsscenariobased.BudgetWise;

import java.util.*;

abstract class Budget implements IAnalyzable {

	//attributes
    protected double income;
    protected HashMap<String, Double> categoryLimits;
    protected ArrayList<Transaction> transactions;

    //constructor
    public Budget(double income, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // method to control expense addition
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    //method to get total expenses
    protected double getTotalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    //method to return total expenses
    public double calculateSavings() {
        return income - getTotalExpenses();
    }
}
