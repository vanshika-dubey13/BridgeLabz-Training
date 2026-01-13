package com.oopsscenariobased.BudgetWise;

import java.util.HashMap;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Monthly Budget Report ---");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        System.out.println("Total Expenses: ₹" + getTotalExpenses());
        System.out.println("Net Savings: ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        HashMap<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                spent.put(t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
            }
        }

        for (String cat : categoryLimits.keySet()) {
            if (spent.getOrDefault(cat, 0.0) > categoryLimits.get(cat)) {
                System.out.println("Overspend detected in category: " + cat);
            }
        }
    }
}
