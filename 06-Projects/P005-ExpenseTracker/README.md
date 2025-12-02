# P005 - Expense Tracker

## Problem Statement

Build a multi-user expense tracking application that allows:
- User registration and authentication
- Add expenses with category, amount, date, description
- View all expenses for logged-in user
- Remove expenses
- Generate expense reports by category
- Calculate total spending

The system must support multiple users, with each user having their own expense list. Expenses should include category, amount, date, and description.

## Concepts Demonstrated

| Concept | How It's Used |
|---------|---------------|
| **User Authentication** | HashMap for username → User mapping |
| **Multiple Collections** | HashMap for users, ArrayList for expenses per user |
| **Object-Oriented Design** | User and Expense classes |
| **Date Handling** | LocalDate and DateTimeFormatter for dates |
| **Input Validation** | Comprehensive validation for all fields |
| **Exception Handling** | Try-catch for parsing errors |
| **Report Generation** | Calculate totals and category breakdowns |
| **Nested Data Structures** | User → ArrayList<Expense> relationship |

## Features Implemented

- ✅ User registration
- ✅ User login/logout
- ✅ Add expenses with validation
- ✅ View all expenses
- ✅ Remove expenses by index
- ✅ Expense reports (total + by category)
- ✅ Date parsing (dd-MM-yyyy format)
- ✅ Input validation (amount, date, category, description)
- ✅ Multi-user support
- ✅ Category-based grouping

## Code Structure

### ExpenseManager.java
**Purpose**: Main application class managing users and expenses

**Key Methods**:
- `register()`: Create new user account
- `login()`: Authenticate user
- `addExpense()`: Add expense to current user's list
- `viewExpenses()`: Display all expenses for current user
- `removeExpense()`: Delete expense by index
- `expenseReport()`: Generate totals and category breakdown
- `mainMenu()`: Logged-in user menu
- `appStart()`: Application entry point with login/register

**Key Fields**:
- `users`: HashMap<String, User> - username → User mapping
- `currentUser`: User - currently logged-in user
- `sc`: Scanner for input

### User.java
**Purpose**: User data model

**Fields**:
- `username`: String - unique identifier
- `password`: String - authentication
- `expenses`: ArrayList<Expense> - user's expense list

**Methods**:
- Constructor: Initialize username, password, expenses list

### Expense.java
**Purpose**: Expense data model

**Fields**:
- `category`: String - expense category (Food, Shopping, Travel)
- `amount`: double - expense amount
- `date`: LocalDate - expense date
- `description`: String - what was purchased

**Methods**:
- Constructor: Initialize all fields
- `toString()`: Formatted display

### Main.java
**Purpose**: Entry point, creates ExpenseManager and starts app

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty fields | Validate description, amount, date, category |
| Negative amounts | Check amount >= 0 |
| Invalid date format | Try-catch DateTimeParseException |
| Invalid number format | Try-catch NumberFormatException |
| User already exists | Check `containsKey()` before registration |
| Invalid login | Validate username and password |
| Empty expense list | Check `isEmpty()` before display |
| Invalid expense index | Try-catch IndexOutOfBoundsException |
| No expenses for report | Handle empty list gracefully |

## How to Run

### Compile
```bash
javac Main.java ExpenseManager.java User.java Expense.java
```

### Run
```bash
java Main
```

### Usage
1. Register new user or login
2. Add expenses with all details
3. View expenses list
4. Remove expenses by number
5. Generate expense reports
6. Logout to switch users

## Data Persistence

**Current**: In-memory only (data lost on exit)  
**Future**: Save users and expenses to `user_info.txt` file

## Testing Scenarios

### Test Case 1: Register User
```
Input:
  Username: "john"
  Password: "pass123"
Expected: "Registered successfully!"
```

### Test Case 2: Add Expense
```
Input:
  Description: "Lunch"
  Amount: "25.50"
  Date: "15-11-2025"
  Category: "Food"
Expected: "Expenses added!"
```

### Test Case 3: View Expenses
```
Expected: Numbered list of all expenses with details
```

### Test Case 4: Expense Report
```
Input: Generate report with expenses in Food, Shopping categories
Expected: Total amount + breakdown by category
```

### Test Case 5: Invalid Date Format
```
Input: Date "11/15/2025" (wrong format)
Expected: Exception handled, error message
```

## Learning Outcomes

1. **User Authentication**: Implemented login/register system
2. **Nested Collections**: HashMap of users, each with ArrayList of expenses
3. **Date Parsing**: Used LocalDate and DateTimeFormatter
4. **Input Validation**: Comprehensive validation for all fields
5. **Exception Handling**: Handled parsing and index errors
6. **Report Generation**: Calculated totals and category breakdowns
7. **Multi-User System**: Separated data per user
8. **HashMap Grouping**: Used HashMap to group expenses by category

## Interview Questions

### Q: How did you implement multi-user support?
**A**: Used HashMap<String, User> where key is username. Each User object has its own ArrayList<Expense>. When user logs in, `currentUser` points to their User object, so all operations work on their expense list.

### Q: How did you handle date parsing?
**A**: Used DateTimeFormatter with pattern "dd-MM-yyyy" and LocalDate.parse(). Wrapped in try-catch to handle invalid formats. This ensures consistent date format.

### Q: How does the expense report work?
**A**: Iterate through current user's expenses, sum total amount, and use HashMap<String, Double> to group by category. For each expense, add amount to category total using `getOrDefault()`.

### Q: What would you improve?
**A**:
- Add file persistence (save/load users and expenses)
- Add expense editing (currently only add/remove)
- Add date range filtering for reports
- Add expense search functionality
- Add password hashing (currently plain text)
- Add expense categories as enum
- Add monthly/yearly reports

## Code Quality Checklist

- ✅ Multi-user architecture
- ✅ Comprehensive input validation
- ✅ Exception handling
- ✅ Date parsing and formatting
- ✅ Report generation
- ✅ Clean code structure
- ⚠️ No file persistence (future enhancement)
- ⚠️ Password stored in plain text (security concern)
- ✅ User-friendly interface

## Status & Completion Date

**Status**: ✅ Core Features Complete  
**Completion Date**: November 2025  
**Version**: 1.0

## Future Enhancements

- [ ] File persistence (save/load data)
- [ ] Password hashing (security)
- [ ] Edit expenses (currently only add/remove)
- [ ] Date range filtering
- [ ] Search expenses by description/category
- [ ] Monthly/yearly reports
- [ ] Export reports to file
- [ ] Expense categories as enum
- [ ] Budget tracking
- [ ] Expense trends/charts

