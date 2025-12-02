package expenses_tracker;


//class ExpenseManager {
//    HashMap<String, User> users = new HashMap<>();
//    User currentUser = null;
//    Scanner sc = new Scanner(System.in);
//
//    // Authentication
//    void register() {
//
//        System.out.print("Enter username: ");
//        String u = sc.nextLine();
//
//        if (users.containsKey(u))
//        {
//            System.out.println("Username exists!");
//            return;
//        }
//        System.out.print("Enter password: ");
//        String p = sc.nextLine();
//        users.put(u, new User(u, p));
//        System.out.println("Registered successfully!");
//    }
//
//    boolean login() {
//        System.out.print("Username: ");
//        String u = sc.nextLine();
//
//        System.out.print("Password: ");
//        String p = sc.nextLine();
//
//        User user = users.get(u);
//        if (user != null && user.password.equals(p)) {
//            currentUser = user;
//            System.out.println("Login successful!");
//            return true;
//        }
//        System.out.println("Invalid credentials."); return false;
//    }
//
//    // Expense add/view/remove/report
//    void addExpense() {
//        try {
//            System.out.print("Description: ");
//            String desc = sc.nextLine();
//
//            System.out.print("Category (Food, Travel, Bills, Shopping): ");
//            String cat = sc.nextLine();
//
//            System.out.print("Amount: ");
//            double amt = Double.parseDouble(sc.nextLine());
//
//            System.out.print("Date (yyyy-mm-dd): ");
//            String datStr = sc.nextLine();
//
//            Date dat = new GregorianCalendar(
//                    Integer.parseInt(datStr.substring(0, 4)),
//                    Integer.parseInt(datStr.csubstring(5, 7)) - 1,
//                    Integer.parseInt(datStr.substring(8, 10))
//            ).getTime();


//            currentUser.expenses.add(new Expense(cat, amt, dat, desc));

//            System.out.println("Expense added!");

//        } catch (Exception e) {
//            System.out.println("Error in input. Please try again.");
//        }
//    }
//
//    void viewExpenses() {
//        ArrayList<Expense> exps = currentUser.expenses;
//        if (exps.isEmpty()) { System.out.println("No expenses."); return; }
//        // Sort by date (optional)
//        exps.sort(Comparator.comparing(e -> e.date));
//        for (int i = 0; i < exps.size(); i++) {
//            System.out.println((i + 1) + ". " + exps.get(i));
//        }
//    }
//
//    void removeExpense() {
//        viewExpenses();
//        System.out.print("Enter expense number to remove: ");
//        try {
//            int idx = Integer.parseInt(sc.nextLine()) - 1;
//            currentUser.expenses.remove(idx);
//            System.out.println("Expense removed!");
//        } catch (Exception e) {
//            System.out.println("Invalid input.");
//        }
//    }
//
//    void expenseReport() {
//        Map<String, Double> categoryTotals = new HashMap<>();
//        double total = 0;
//        for (Expense e : currentUser.expenses) {
//            total += e.amount;
//            categoryTotals.put(e.category, categoryTotals.getOrDefault(e.category, 0.0) + e.amount);
//        }
//        System.out.println("Total: Rs." + total);
//        for (String cat : categoryTotals.keySet()) {
//            System.out.println(String.format("  %-10s Rs.%.2f", cat, categoryTotals.get(cat)));
//        }
//    }
//
//    void mainMenu() {
//        while (true) {
//            System.out.println("\n1. Add Expense\n2. View Expenses\n3. Remove Expense\n4. Expense Report\n0. Logout");
//            System.out.print("Select: ");
//            String choice = sc.nextLine();
//            if (choice.equals("1")) addExpense();
//            else if (choice.equals("2")) viewExpenses();
//            else if (choice.equals("3")) removeExpense();
//            else if (choice.equals("4")) expenseReport();
//            else if (choice.equals("0")) { currentUser = null; break; }
//            else System.out.println("Invalid.");
//        }
//    }
//
//    void appStart() {
//        while (true) {
//            System.out.println("\n===== Expense Manager Console (Bank Grade) =====");
//            System.out.println("1. Register\n2. Login\n0. Exit");
//            System.out.print("Select: ");
//            String choice = sc.nextLine();
//            if (choice.equals("1")) register();
//            else if (choice.equals("2") && login()) mainMenu();
//            else if (choice.equals("0")) break;
//            else System.out.println("Invalid.");
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        new ExpenseManager().appStart();
    }
}
