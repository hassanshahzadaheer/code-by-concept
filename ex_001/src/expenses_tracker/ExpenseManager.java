package expenses_tracker;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExpenseManager {
    HashMap<String, User> users = new HashMap<>();
    User currentUser = null;
    Scanner sc = new Scanner(System.in);


    void register() {
        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        if (users.containsKey(u)) {
            System.out.println("User already exists!");
            return;
        }
        System.out.print("Enter Password: ");
        String p = sc.nextLine();
        users.put(u, new User(u,p));
        System.out.println("Registered successfully!");
    }

    boolean login() {
        System.out.print("Username: ");
        String u = sc.nextLine();

        System.out.print("Password: ");
        String p = sc.nextLine();

        User user = users.get(u);

        if (user != null && user.password.equals(p)) {
            currentUser = user;
            System.out.println("Login successful!");
            return  true;
        }
        System.out.println("Invalid username/password");
        return false;
    }

    void addExpense() {
        try {

            System.out.print("What you bought? : ");
            String description = sc.nextLine();

            System.out.print("Amount: $");
            String userAmount = sc.nextLine();

            Double amount = Double.parseDouble(userAmount);


            System.out.print("Enter date (dd-MM-yyyy): ");
            String userDate = sc.nextLine();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(userDate,format);

            System.out.print("Category: (Food, Shopping, Travel) ");
            String category = sc.nextLine();

            if (description.isEmpty()) {
                System.out.println("Please enter product description");
            } else if (userAmount.isEmpty()) {
                System.out.println("Please enter amount");
            } else if (amount < 0 ) {
                System.out.println("Amount must be positive");
            } else if (userDate.isEmpty()) {
                System.out.println("Please enter date");
            } else if (category.isEmpty()) {
                System.out.println(" please enter category");
            } else currentUser.expenses.add(new Expense(category, amount, date, description));

            System.out.println("Expenses added!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void viewExpenses() {
        ArrayList<Expense> expenses = currentUser.expenses;

        if (expenses.isEmpty()) {
            System.out.println("No Expenses found.");
            return;
        }

        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((i + 1) +  " . " + expenses.get(i));
        }

    }

    void removeExpense() {
        viewExpenses();
        System.out.print("Enter expense number to remove: ");
        try {
            int idx = Integer.parseInt(sc.nextLine()) - 1;
            currentUser.expenses.remove(idx);
            System.out.println("Expense removed!");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }


    void expenseReport() {
        Map<String, Double> categoryTotals = new HashMap<>();
        double total = 0;
        for (Expense e : currentUser.expenses) {
            total += e.amount;
            categoryTotals.put(e.category, categoryTotals.getOrDefault(e.category, 0.0) + e.amount);
        }
        System.out.println("Total: Rs." + total);
        for (String cat : categoryTotals.keySet()) {
            System.out.println(String.format("  %-10s Rs.%.2f", cat, categoryTotals.get(cat)));
        }
    }

    void mainMenu() {
        while (true) {
            System.out.println("\n" +
                    "1. Add Expense\n" +
                    "2. View Expenses\n" +
                    "3. Remove Expense\n" +
                    "4. Expense Report\n" +
                    "0. Logout"
            );
            System.out.print("Select: ");
            String choice = sc.nextLine();
            if (choice.equals("1"))
                addExpense();
            else if (choice.equals("2"))
               viewExpenses();
            else if (choice.equals("3"))
                removeExpense();
            else if (choice.equals("4"))
              expenseReport();
            else if (choice.equals("0")) {
                currentUser = null;
                break;
            }
            else System.out.println("Invalid.");
        }
    }

    void appStart() {
        while (true) {
            System.out.println("\n" +
                    "===== Expense Manager Console =====");
            System.out.println("" +
                    "1. Register\n" +
                    "2. Login\n" +
                    "0. Exit"
            );
            System.out.print("Select: ");
            String choice = sc.nextLine();

            if (choice.equals("1"))
                register();
            else if (choice.equals("2") && login())
                mainMenu();
            else if (choice.equals("0"))
                break;
            else
                System.out.println("Invalid.");
        }
    }

}
