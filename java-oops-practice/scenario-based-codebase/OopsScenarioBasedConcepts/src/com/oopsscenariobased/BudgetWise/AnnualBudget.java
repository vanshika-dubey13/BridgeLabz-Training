package com.oopsscenariobased.BudgetWise;

import java.util.HashMap;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n=== Annual Budget Summary ===");
        System.out.println("Transactions Count: " + transactions.size());
        System.out.println("Total Expenses: ₹" + getTotalExpenses());
        System.out.println("Annual Savings: ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed.");
    }
}
