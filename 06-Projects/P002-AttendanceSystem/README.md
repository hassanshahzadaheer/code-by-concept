# P002 - Attendance System

## Problem Statement

Build a student attendance tracking system that manages:
- Student roster (add students)
- Mark students as present or absent
- View present/absent/all students separately
- Calculate attendance percentage
- Generate attendance reports

The system must maintain synchronization between multiple lists (all students, present, absent) and handle edge cases like students not yet marked.

## Concepts Demonstrated

| Concept | How It's Used |
|---------|---------------|
| **Multiple ArrayLists** | Three lists: allStudents, present, absent |
| **Data Synchronization** | Keep lists in sync when marking attendance |
| **Calculations** | Calculate attendance percentage |
| **Enhanced For Loop** | Iterate through lists for display |
| **Switch Statement** | Menu selection |
| **Input Validation** | Validate student names, check existence |
| **Exception Handling** | Try-catch for runtime errors |

## Features Implemented

- ✅ Add students to roster
- ✅ Mark students as present
- ✅ Mark students as absent
- ✅ View present students list
- ✅ View absent students list
- ✅ View all students
- ✅ Calculate attendance percentage
- ✅ Generate attendance report
- ✅ Prevent duplicate students
- ✅ Synchronize lists (present/absent)
- ✅ Handle unmarked students

## Code Structure

### AttendanceSystem.java
**Purpose**: Main class managing attendance operations

**Key Methods**:
- `addStudent()`: Add student to roster with duplicate check
- `markPresent()`: Move student to present list, remove from absent
- `markAbsent()`: Move student to absent list, remove from present
- `viewPresent()`: Display all present students
- `viewAbsent()`: Display all absent students
- `viewAllStudents()`: Display entire roster
- `calculateAttendance()`: Generate report with percentages
- `mainMenu()`: Menu-driven interface
- `startApp()`: Application entry point

**Key Fields**:
- `allStudents`: ArrayList<String> - Complete roster
- `present`: ArrayList<String> - Present students
- `absent`: ArrayList<String> - Absent students
- `sc`: Scanner for input

### Main.java
**Purpose**: Entry point, creates AttendanceSystem and starts app

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty student name | Validation check before adding |
| Duplicate students | Check `contains()` before adding |
| Student not in roster | Validate existence before marking |
| Already marked present | Check and prevent duplicate marking |
| Empty roster | Check `isEmpty()` before calculations |
| Unmarked students | Calculate: total - present - absent |
| Division by zero | Check empty roster before percentage calculation |

## How to Run

### Compile
```bash
javac Main.java AttendanceSystem.java
```

### Run
```bash
java Main
```

### Usage
1. Add students to roster (option 1)
2. Mark attendance (options 2-3)
3. View lists (options 4-6)
4. Generate report (option 7)
5. Exit (option 8)

## Data Persistence

**Current**: In-memory only (data lost on exit)  
**Future**: Save to `student_data.txt` file

## Testing Scenarios

### Test Case 1: Add Student
```
Input: "John Doe"
Expected: "John Doe added successfully!"
```

### Test Case 2: Duplicate Prevention
```
Input: Add "John Doe" again
Expected: "Name is already exists!"
```

### Test Case 3: Mark Present
```
Input: Mark "John Doe" as present
Expected: "John Doe marked present!" (removed from absent if there)
```

### Test Case 4: Attendance Report
```
Input: Generate report with 5 total, 3 present, 1 absent
Expected: Shows 60% attendance, 1 not marked
```

### Test Case 5: Invalid Student Name
```
Input: Mark "Unknown Student" as present
Expected: "Invalid Student name given"
```

## Learning Outcomes

1. **Multiple Collections**: Managed three synchronized ArrayLists
2. **Data Synchronization**: Learned to keep related lists in sync
3. **List Operations**: Mastered add(), remove(), contains(), isEmpty()
4. **Calculations**: Performed percentage calculations with proper casting
5. **Enhanced For Loops**: Used for clean iteration
6. **Switch Statements**: Implemented menu with switch
7. **Edge Case Handling**: Handled empty lists, duplicates, invalid input

## Interview Questions

### Q: How did you keep the three lists synchronized?
**A**: When marking present, I add to present list and remove from absent list. When marking absent, I add to absent and remove from present. This ensures a student can't be in both lists simultaneously.

### Q: How did you calculate attendance percentage?
**A**: Cast present count to double, divide by total students, multiply by 100. Used `((double) presentCount / total) * 100` to ensure accurate decimal calculation.

### Q: What happens if a student is added but not marked?
**A**: The `calculateAttendance()` method calculates unmarked students as: `total - presentCount - absentCount`. This shows students who haven't been marked yet.

### Q: Why use three separate lists instead of one?
**A**: Separation allows quick access to specific groups (present/absent) without filtering. Also makes calculations easier and code more readable.

## Code Quality Checklist

- ✅ Clear method names
- ✅ Input validation
- ✅ Edge case handling
- ✅ Data synchronization
- ✅ Proper calculations
- ✅ User-friendly interface
- ⚠️ No file persistence (future enhancement)
- ✅ Exception handling

## Status & Completion Date

**Status**: ✅ Complete  
**Completion Date**: November 2025  
**Version**: 1.0

## Future Enhancements

- [ ] File persistence (save/load roster)
- [ ] Date-based attendance tracking
- [ ] Monthly/weekly reports
- [ ] Export reports to file
- [ ] Student ID system
- [ ] Search functionality
- [ ] Edit student names
- [ ] Attendance history

