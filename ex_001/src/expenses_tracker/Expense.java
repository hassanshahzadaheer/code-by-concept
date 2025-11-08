package expenses_tracker;

import java.util.Date;

public class Expense {
    String category;
    double amount;
    Date date;
    String description;

    Expense(String category, double amount, Date date, String description) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return String.format("[%s] %-12s Rs.%-8.2f %-20s", date.toString(), category, amount, description);
    }
}
