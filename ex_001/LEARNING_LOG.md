

## Day 13 - Arrays with Objects - 12 Nov 2025
**Time:** 1 hour  
**Status:** ✅ Complete

### What I Built:
- Expense class with fields, constructor, and methods
- Array of 5 Expense objects
- Filter expenses by category
- Calculate category totals
- Find most expensive expense
- User search by category

### Key Takeaway:
Objects in arrays are WAY more powerful than separate parallel arrays! Instead of managing multiple arrays, everything is bundled together.

### Working Code:
```java
Expense[] expenses = new Expense[5];
expenses[0] = new Expense(50.0, "Food", "Lunch");

// Filter by category
for (int i = 0; i < expenses.length; i++) {
    if (expenses[i].getCategory().equals("Food")) {
        expenses[i].displayExpense();
    }
}
```

### Struggled With:
- At first forgot to initialize objects (NullPointerException)
- Remembered: Creating array doesn't create objects, must do `new Expense(...)` for each

### What Clicked:
- Objects bundle related data together
- Much cleaner than having separate arrays for amount, category, description
- Using getters to access private fields

---
## Day 12 - Array Search & String Comparison - 11 Nov 2025

**Time:** 1.5 hour

**Status:** ✅ Complete

### What I Built:

* Solved 3 mini challenges using arrays and loops.
* Used **parallel arrays** to track categories and expenses.
* Compared strings using `.equals()` (not `==`).
* Handled “not found” cases using **boolean flags**.
* Used **break statements** to stop loops early.
* Found the **second highest expense** logically (without sorting).


### Key Learning:

* String comparison (`.equals()` vs `==`)
* Handling “not found” cases
* Using flags (`boolean` variables)
* `break` statement to exit loops early

### Struggled With:

* Remembering when to use `.equals()` vs `==` for strings.
* Tracking both **highest** and **second highest** without sorting.

### Fixed By:

* Learned `.equals()` compares **values**, while `==` compares **memory references**.
* Used two variables (`highest`, `secondHighest`) and simple conditions to keep them updated.


---

## Day 11 - Arrays Basics (Expense Tracker) - 10 Nov 2025

**Time:** 1 hour
**Status:** ✅ Complete

### What I Built:

* Created an `expenses` array to store daily costs.
* Calculated total, average, highest, and lowest expense.
* Counted how many expenses were above $100.

### Key Takeaway:

Understood **declaration**, **creation**, and **initialization** of arrays — and how to loop through them for calculations.

### Working Code:

```java
package array;

public class Main {
    public static void main (String[] args) {
        double[] expenses = new double[5];
        expenses[0] = 50.0;
        expenses[1] = 340.0;
        expenses[2] = 195.3;
        expenses[3] = 19.9;
        expenses[4] = 200.0;

        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
        }

        double total = 0;
        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
        }
        System.out.println("Total: $" + total);

        double max = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Highest: $" + max);

        double min = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
        }
        System.out.println("Lowest: $" + min);

        int count = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > 100) {
                count++;
            }
        }
        System.out.println("Above $100: " + count);

        double average = total / expenses.length;
        System.out.println("Average: $" + average);
    }
}
```

### Struggled With:

* Why the loop for finding `min` and `max` starts from index **1** instead of **0**.

### Fixed By:

* Because we already assume the **first element (index 0)** is both the current min and max.
* Starting from index **1** avoids comparing the first element to itself — it’s a small optimization and cleaner logic.


---

## Day 10 - Rewrite Expense Function - Nov 09, 2025

**Time:** 1 hour
**Status:** ✅ Complete

### What I Built:

- Complete `addExpense()` function from scratch
- Input validation for all fields (description, amount, date, category)
- Used `try-catch` to handle parsing errors
- Successfully added Expense object to ArrayList

### Key Takeaway:

Reading input as String first gives me control to validate before converting to other types!

### Working Code:

```java
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
        LocalDate date = LocalDate.parse(userDate, format);

        System.out.print("Category: (Food, Shopping, Travel) ");
        String category = sc.nextLine();

        if (description.isEmpty()) {
            System.out.println("Please enter product description");
        } else if (userAmount.isEmpty()) {
            System.out.println("Please enter amount");
        } else if (amount < 0) {
            System.out.println("Amount must be positive");
        } else if (userDate.isEmpty()) {
            System.out.println("Please enter date");
        } else if (category.isEmpty()) {
            System.out.println("please enter category");
        } else {
            currentUser.expenses.add(new Expense(category, amount, date, description));
            System.out.println("Expenses added!");
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```

### What I Learned Today:

**1. Date Parsing (This was tricky!):**

- `DateTimeFormatter` defines the format pattern: `"dd-MM-yyyy"`
- `LocalDate.parse(userDate, format)` converts String → LocalDate
- Without formatter, Java doesn't know if "11-09-2025" means Nov 9 or Sep 11!

**2. String to Number Conversion:**

- `Double.parseDouble(userAmount)` converts String → Double
- If user types "abc", it throws `NumberFormatException` (caught by try-catch)

**3. Adding to ArrayList:**

- `currentUser.expenses` is an ArrayList<Expense>
- `.add(new Expense(...))` creates new object AND adds it in one line
- Order of parameters must match Expense constructor!

### Struggled With:

- **Date parsing** - didn't understand why we need DateTimeFormatter
- Confused about when to convert String to Double (before or after validation?)
- Adding object to ArrayList syntax
