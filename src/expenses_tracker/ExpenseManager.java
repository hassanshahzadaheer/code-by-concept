package expenses_tracker;

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

            System.out.print("Description: ");
            String desc = sc.nextLine();

            System.out.print("Category (Food, Travel, Bills, Shopping): ");
            String cat = sc.nextLine();

            System.out.print("Amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            System.out.print("Date (yyyy-mm-dd): ");
            String datStr = sc.nextLine();

            Date date = new GregorianCalendar(
                    Integer.parseInt(datStr.substring(0, 4)),
                    Integer.parseInt(datStr.substring(5, 7)) - 1,
                    Integer.parseInt(datStr.substring(8, 10))
            ).getTime();

            currentUser.expenses.add(new Expense(cat,amount,date,desc));

            System.out.println("Expense added!");

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
                System.out.println("remove expenses");
            else if (choice.equals("4"))
                System.out.println("expense report");
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
