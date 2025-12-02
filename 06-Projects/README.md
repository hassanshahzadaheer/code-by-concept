# Projects

This folder contains real-world applications demonstrating multiple Java concepts working together.

## Overview

Each project solves a practical problem and showcases:
- Multiple concepts integrated
- Real-world problem-solving
- Production-ready code practices
- Edge case handling
- User-friendly interfaces

## Projects

### P001 - Task Manager
**Concepts**: ArrayList, Menu Systems, Input Validation  
**Status**: ✅ Complete  
**Description**: Console-based task management with add, view, complete, and search functionality.

[View Details →](./P001-TaskManager/README.md)

---

### P002 - Attendance System
**Concepts**: Multiple ArrayLists, Data Synchronization, Reports  
**Status**: ✅ Complete  
**Description**: Student attendance tracking with present/absent lists and attendance percentage calculation.

[View Details →](./P002-AttendanceSystem/README.md)

---

### P003 - Code Template Generator
**Concepts**: HashMap, CRUD Operations, Custom Objects  
**Status**: ✅ Complete (File persistence pending)  
**Description**: Code snippet management system with fast lookup and template organization.

[View Details →](./P003-CodeTemplateGenerator/README.md)

---

### P004 - Phone Book
**Concepts**: HashMap, Key-Value Lookup, CRUD Operations  
**Status**: ✅ Core Features Complete  
**Description**: Contact management system with fast name-based lookup using HashMap.

[View Details →](./P004-PhoneBook/README.md)

---

### P005 - Expense Tracker
**Concepts**: User Authentication, Nested Collections, Date Parsing, Reports  
**Status**: ✅ Complete  
**Description**: Multi-user expense tracking with authentication, category-based reports, and date handling.

[View Details →](./P005-ExpenseTracker/README.md)

---

## Project Comparison

| Project | Collections Used | Key Challenge | Complexity |
|---------|-----------------|---------------|------------|
| P001 - Task Manager | ArrayList | Duplicate prevention | ⭐⭐ |
| P002 - Attendance System | Multiple ArrayLists | Data synchronization | ⭐⭐⭐ |
| P003 - Template Generator | HashMap | Fast lookup, ID generation | ⭐⭐ |
| P004 - Phone Book | HashMap | Key-value relationships | ⭐⭐ |
| P005 - Expense Tracker | HashMap + ArrayList | Multi-user, nested structures | ⭐⭐⭐⭐ |

## Common Patterns Across Projects

### 1. Menu-Driven Interface
All projects use while loops with switch/if-else for user interaction:
```java
while (true) {
    showMenu();
    String choice = scanner.nextLine();
    switch (choice) {
        case "1": addItem(); break;
        case "2": viewItems(); break;
        // ...
    }
}
```

### 2. Input Validation
Every project validates user input:
- Check for empty strings
- Validate ranges
- Check for duplicates
- Handle invalid formats

### 3. Edge Case Handling
All projects handle:
- Empty collections
- Invalid input
- Not found scenarios
- Boundary conditions

### 4. CRUD Operations
Most projects implement:
- **Create**: Add new items
- **Read**: View/search items
- **Update**: Modify existing items
- **Delete**: Remove items

## Learning Progression

Projects are ordered by complexity:
1. **P001** - Single collection (ArrayList)
2. **P002** - Multiple synchronized collections
3. **P003** - HashMap with custom objects
4. **P004** - Simple HashMap operations
5. **P005** - Complex nested structures + authentication

## Running Projects

Each project folder contains:
- Source code (.java files)
- README.md with detailed documentation
- Compile and run instructions
- Testing scenarios

**General Steps**:
1. Navigate to project folder
2. Compile: `javac *.java`
3. Run: `java Main`

## Future Projects

Potential projects to build:
- [ ] Library Management System (File I/O + Collections)
- [ ] Inventory Management (File persistence + CRUD)
- [ ] Student Grade System (Calculations + Reports)
- [ ] Bank Account Manager (Transactions + History)
- [ ] Recipe Manager (Search + Categories)

---

**Total Projects**: 5  
**Total Lines of Code**: 2000+  
**Concepts Demonstrated**: 15+  
**Status**: Active Development

