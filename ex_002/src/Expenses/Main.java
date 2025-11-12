package Expenses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create array
        Expense[] expenses = new Expense[5];
        expenses[0] = new Expense(50.0, "Food", "Lunch");
        expenses[1] = new Expense(150.0, "Travel", "Bus pass");
        expenses[2] = new Expense(75.0, "Shopping", "T-shirt");
        expenses[3] = new Expense(120.0, "Food", "Dinner");
        expenses[4] = new Expense(200.0, "Bills", "Electricity");

        // Print all
        System.out.println("=== ALL EXPENSES ===");
        for (int i = 0; i < expenses.length; i++) {
            expenses[i].displayExpenses();
        }

        // Food expenses
        System.out.println("\n=== FOOD EXPENSES ===");
        int foodCount = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i].getCategory().equals("Food")) {
                expenses[i].displayExpenses();
                foodCount++;
            }
        }
        System.out.println("Total Food expenses: " + foodCount);

        // Category total
        System.out.println("\n=== CATEGORY TOTALS ===");
        double foodTotal = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i].getCategory().equals("Food")) {
                foodTotal += expenses[i].getAmount();
            }
        }
        System.out.println("Food: $" + foodTotal);

        // Most expensive
        System.out.println("\n=== MOST EXPENSIVE ===");
        Expense maxExpense = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i].getAmount() > maxExpense.getAmount()) {
                maxExpense = expenses[i];
            }
        }
        maxExpense.displayExpenses();

        // User search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter category to search: ");
        String searchCategory = sc.nextLine();

        System.out.println("\n=== SEARCH RESULTS ===");
        boolean found = false;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i].getCategory().equalsIgnoreCase(searchCategory)) {
                expenses[i].displayExpenses();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses found for: " + searchCategory);
        }
    }
}