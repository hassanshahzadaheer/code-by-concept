# P001 - Task Manager

## Problem Statement

Create a console-based task management application that allows users to:
- Add tasks to a list
- View all tasks
- Mark tasks as complete
- Search for tasks
- Track total number of tasks

The application should handle duplicate tasks, validate input, and provide a user-friendly menu interface.

## Concepts Demonstrated

| Concept | How It's Used |
|---------|---------------|
| **ArrayList** | Store and manage dynamic list of tasks |
| **Menu System** | While loop with switch/if-else for user interaction |
| **Input Validation** | Check for empty input, duplicate tasks |
| **Enhanced For Loop** | Iterate through tasks for display |
| **Object-Oriented Design** | TaskManager class encapsulates functionality |
| **Scanner** | Get user input from console |

## Features Implemented

- ✅ Add new tasks
- ✅ View all tasks with numbering
- ✅ Complete/remove tasks by number
- ✅ Search functionality (placeholder)
- ✅ Show total task count
- ✅ Duplicate prevention
- ✅ Input validation
- ✅ Menu-driven interface
- ✅ Continuous loop until exit

## Code Structure

### TaskManager.java
**Purpose**: Main application class managing task operations

**Key Methods**:
- `addTask()`: Add new task with duplicate check
- `viewTasks()`: Display all tasks with numbering
- `finishedTask()`: Remove completed task by index
- `mainMenu()`: Display menu and handle user choices
- `startApp()`: Entry point for application

**Key Fields**:
- `taskManager`: ArrayList<String> storing all tasks
- `sc`: Scanner for user input

### Main.java
**Purpose**: Entry point, creates TaskManager instance and starts app

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty task name | Validation check before adding |
| Duplicate tasks | Use `contains()` to check before adding |
| Invalid task number | Validate index range before removing |
| Empty task list | Check `isEmpty()` before operations |
| Non-numeric input | Try-catch for parsing errors |

## How to Run

### Compile
```bash
javac Main.java TaskManager.java
```

### Run
```bash
java Main
```

### Usage
1. Select option from menu (1-6)
2. Enter task name when prompted
3. View tasks to see numbered list
4. Enter task number to complete
5. Exit with option 6

## Testing Scenarios

### Test Case 1: Add Task
```
Input: "Buy groceries"
Expected: Task added successfully
```

### Test Case 2: Duplicate Prevention
```
Input: Add "Buy groceries" again
Expected: "Task is already added"
```

### Test Case 3: View Tasks
```
Expected: Numbered list of all tasks
```

### Test Case 4: Complete Task
```
Input: Task number 1
Expected: Task removed and marked complete
```

### Test Case 5: Invalid Task Number
```
Input: Task number 999
Expected: "Invalid task number!"
```

## Learning Outcomes

1. **ArrayList Operations**: Mastered add(), remove(), get(), size(), contains()
2. **Menu Design**: Created user-friendly console interface
3. **Input Validation**: Learned to validate user input before processing
4. **Index Management**: Understood 0-based indexing vs 1-based user display
5. **Duplicate Prevention**: Used contains() to prevent duplicate entries
6. **Error Handling**: Implemented validation for edge cases

## Interview Questions

### Q: How did you prevent duplicate tasks?
**A**: Used `ArrayList.contains()` method to check if task already exists before adding. This ensures each task appears only once.

### Q: Why did you use ArrayList instead of Array?
**A**: ArrayList is dynamic - we don't know how many tasks users will add. Arrays require fixed size, ArrayList grows automatically.

### Q: How did you handle invalid task numbers?
**A**: Validated the input number against the ArrayList size. Checked if number is greater than 0 and less than list size before removing.

### Q: What would you improve in this code?
**A**: 
- Add file persistence to save tasks
- Implement search functionality (currently placeholder)
- Add task priorities/categories
- Add due dates
- Better error messages

## Code Quality Checklist

- ✅ Clear method names
- ✅ Input validation
- ✅ Edge case handling
- ✅ User-friendly interface
- ✅ Proper encapsulation
- ⚠️ Could add file persistence
- ⚠️ Search functionality incomplete

## Status & Completion Date

**Status**: ✅ Complete (Core Features)  
**Completion Date**: November 2025  
**Version**: 1.0

## Future Enhancements

- [ ] File persistence (save tasks to file)
- [ ] Complete search functionality
- [ ] Task priorities (High, Medium, Low)
- [ ] Due dates for tasks
- [ ] Task categories/tags
- [ ] Undo/redo functionality
- [ ] Export tasks to file

