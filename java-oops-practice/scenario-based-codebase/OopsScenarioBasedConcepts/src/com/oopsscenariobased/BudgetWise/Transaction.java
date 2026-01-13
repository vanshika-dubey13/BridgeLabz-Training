package com.oopsscenariobased.BudgetWise;

public class Transaction {
	
	//attributes
    private double amount;
    private String type;
    private String date;
    private String category;

    //constructor
    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + category + " | ₹" + amount;
    }
}
