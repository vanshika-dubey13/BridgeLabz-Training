package com.oopsscenariobased.BudgetWise;

import java.util.*; // <- Required for HashMap, ArrayList, Scanner

public class BudgetWiseMain {

    static Scanner sc = new Scanner(System.in);
    static Budget budget;

    public static void main(String[] args) {
        setupBudget();

        int choice;
        do {
            System.out.println("\n===== BudgetWise Menu =====");
            System.out.println("1. Add Transaction");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspend");
            System.out.println("4. Show Savings");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addTransaction();
                case 2 -> budget.generateReport();
                case 3 -> budget.detectOverspend();
                case 4 -> System.out.println("Net Savings: ₹" + budget.calculateSavings());
                case 0 -> System.out.println("BudgetWise closed.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    static void setupBudget() {
        System.out.println("Select Budget Type:");
        System.out.println("1. Monthly\n2. Annual");
        int type = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Double> limits = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Category name: ");
            String cat = sc.nextLine();
            System.out.print("Limit: ");
            double limit = sc.nextDouble();
            sc.nextLine();
            limits.put(cat, limit);
        }

        budget = (type == 1)
                ? new MonthlyBudget(income, limits)
                : new AnnualBudget(income, limits);
    }

    static void addTransaction() {
        System.out.print("Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();

        System.out.print("Type (income/expense): ");
        String type = sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Category: ");
        String cat = sc.nextLine();

        budget.addTransaction(new Transaction(amt, type, date, cat));
        System.out.println("Transaction added.");
    }
}
