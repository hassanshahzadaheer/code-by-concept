# P004 - Phone Book

## Problem Statement

Build a contact management system (phone book) that allows users to:
- Add contacts (name and phone number)
- Search for contacts by name
- Update phone numbers for existing contacts
- Delete contacts
- View all contacts

The system should use HashMap for fast name-based lookup and validate all input.

## Concepts Demonstrated

| Concept | How It's Used |
|---------|---------------|
| **HashMap** | Store name → phone number pairs for O(1) lookup |
| **CRUD Operations** | Create, Read, Update, Delete contacts |
| **Input Validation** | Validate name and phone before operations |
| **Menu System** | While loop with if-else for user interaction |
| **Exception Handling** | Try-catch for runtime errors |
| **HashMap Methods** | put(), get(), containsKey() |

## Features Implemented

- ✅ Add new contacts
- ✅ Search contacts by name
- ✅ Update phone numbers
- ✅ Delete contacts (placeholder)
- ✅ View all contacts (placeholder)
- ✅ Input validation (name and phone)
- ✅ Duplicate handling (overwrites existing)
- ✅ Menu-driven interface

## Code Structure

### PhoneBook.java
**Purpose**: Main application class (contains main method)

**Key Operations**:
- **Add Contact**: Store name → phone in HashMap
- **Search Contact**: Check if name exists using containsKey()
- **Update Contact**: Modify phone number for existing name
- **Delete Contact**: Remove entry from HashMap (placeholder)
- **View All**: Display all contacts (placeholder)

**Key Fields**:
- `phoneBook`: HashMap<String, String> - name → phone mapping
- `sc`: Scanner for user input

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty name or phone | Validation check before adding |
| Contact not found | Check `containsKey()` before search/update |
| Duplicate names | HashMap automatically overwrites (could add warning) |
| Invalid input | Try-catch exception handling |

## How to Run

### Compile
```bash
javac PhoneBook.java
```

### Run
```bash
java PhoneBook
```

### Usage
1. Select option from menu (1-6)
2. Enter contact name and phone when adding
3. Search by exact name
4. Update phone for existing contact
5. Exit with option 6

## Testing Scenarios

### Test Case 1: Add Contact
```
Input: 
  Name: "John Doe"
  Phone: "123-456-7890"
Expected: "Contact added"
```

### Test Case 2: Search Contact
```
Input: Search "John Doe"
Expected: "Found!" (if exists) or "Not Found!"
```

### Test Case 3: Update Contact
```
Input: 
  Name: "John Doe"
  New Phone: "987-654-3210"
Expected: "update successfully!"
```

### Test Case 4: Validation
```
Input: Add contact with empty name
Expected: "name or phone number is missing!"
```

### Test Case 5: Update Non-Existent
```
Input: Update "Unknown"
Expected: "The number you want to update does not exist."
```

## Learning Outcomes

1. **HashMap Lookup**: Mastered O(1) name-based contact retrieval
2. **Key-Value Pairs**: Understood name (key) → phone (value) relationship
3. **CRUD Operations**: Implemented Create, Read, Update operations
4. **Input Validation**: Validated both name and phone fields
5. **HashMap Methods**: Used put(), get(), containsKey() effectively
6. **Menu Design**: Created user-friendly console interface

## Interview Questions

### Q: Why is HashMap perfect for a phone book?
**A**: HashMap provides O(1) constant-time lookup by name. When searching for "John Doe", we can instantly retrieve the phone number without iterating through all contacts. Much faster than ArrayList for lookups.

### Q: What happens if you add a contact with an existing name?
**A**: HashMap's `put()` method automatically overwrites the previous phone number. The name (key) remains the same, but the phone (value) is updated. Could add a check to warn user about overwriting.

### Q: How would you implement the "View All" feature?
**A**: Use `keySet()` to get all names, then iterate and use `get()` to retrieve each phone number:
```java
for (String name : phoneBook.keySet()) {
    System.out.println(name + " => " + phoneBook.get(name));
}
```

### Q: How would you add phone number validation?
**A**: Use regular expressions to validate format:
```java
if (!phone.matches("\\d{3}-\\d{3}-\\d{4}")) {
    System.out.println("Invalid phone format!");
}
```

## Code Quality Checklist

- ✅ HashMap usage
- ✅ Input validation
- ✅ Edge case handling
- ✅ Exception handling
- ✅ User-friendly interface
- ⚠️ Delete functionality incomplete
- ⚠️ View All functionality incomplete
- ✅ Search functionality

## Status & Completion Date

**Status**: ✅ Core Features Complete (Some features incomplete)  
**Completion Date**: November 2025  
**Version**: 1.0

## Future Enhancements

- [ ] Complete delete functionality
- [ ] Complete view all functionality
- [ ] Phone number format validation
- [ ] Prevent duplicate names (with warning)
- [ ] Search by phone number (reverse lookup)
- [ ] File persistence (save contacts)
- [ ] Contact categories/groups
- [ ] Multiple phone numbers per contact
- [ ] Contact editing (change name)

