package expenses_tracker;

import java.util.ArrayList;

public class User {
    String username;
    String password;

    ArrayList<Expense> expenses = new ArrayList<>();

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
