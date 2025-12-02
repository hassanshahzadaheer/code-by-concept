# P003 - Code Template Generator

## Problem Statement

Create a code snippet management system that allows developers to:
- Store reusable code templates
- Search templates by name
- View all templates
- Organize templates by programming language
- Each template includes: ID, name, description, language, and code snippet

The system should use HashMap for fast lookup and provide a clean interface for managing code templates.

## Concepts Demonstrated

| Concept | How It's Used |
|---------|---------------|
| **HashMap** | Store templates with name as key for O(1) lookup |
| **Custom Objects** | Template class with multiple fields |
| **CRUD Operations** | Create, Read, Update, Delete templates |
| **ID Generation** | Auto-generate unique template IDs |
| **Input Validation** | Validate all fields before creating template |
| **toString() Override** | Custom string representation for Template |
| **Menu System** | User-friendly console interface |

## Features Implemented

- ✅ Add new code templates
- ✅ View all templates
- ✅ Search template by name
- ✅ Auto-generate unique template IDs
- ✅ Store: name, description, language, code snippet
- ✅ Input validation for all fields
- ✅ Organized by programming language
- ✅ Clean template display format
- ⚠️ File persistence (placeholder - TODO)

## Code Structure

### TemplateManager.java
**Purpose**: Main class managing template operations

**Key Methods**:
- `addTemplate()`: Create new template with validation
- `viewAllTemplates()`: Display all templates
- `searchTemplate()`: Find template by name
- `generateId()`: Auto-generate unique ID (TMPL_1, TMPL_2, etc.)
- `showMenu()`: Display menu options
- `start()`: Main application loop
- `saveToFile()`: Placeholder for file persistence
- `loadFromFile()`: Placeholder for loading from file

**Key Fields**:
- `templates`: HashMap<String, Template> - name → template mapping
- `templateCounter`: int - for ID generation
- `sc`: Scanner for input

### Template.java
**Purpose**: Template data model

**Fields**:
- `id`: Unique identifier (TMPL_1, TMPL_2, ...)
- `name`: Template name (used as HashMap key)
- `description`: What the template does
- `language`: Programming language
- `code`: Actual code snippet

**Methods**:
- Constructor: Initialize all fields
- `toString()`: Custom formatted display

### Main.java
**Purpose**: Entry point, creates TemplateManager and starts app

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty name | Validation check before adding |
| Empty description | Validate all required fields |
| Empty language | Check each field individually |
| Empty code snippet | Comprehensive validation |
| Template not found | Check `containsKey()` before search |
| Duplicate names | HashMap automatically overwrites (could add check) |

## How to Run

### Compile
```bash
javac Main.java TemplateManager.java Template.java
```

### Run
```bash
java Main
```

### Usage
1. Select option from menu (1-4)
2. Enter template details when adding
3. View all templates to see complete list
4. Search by exact name
5. Exit to save (when file persistence implemented)

## Data Persistence

**Current**: In-memory only (data lost on exit)  
**Planned**: Save to file on exit, load on startup  
**Status**: Methods created but not implemented (TODO)

## Testing Scenarios

### Test Case 1: Add Template
```
Input: 
  Name: "Hello World"
  Description: "Basic Java program"
  Language: "Java"
  Code: "public class Hello { ... }"
Expected: Template added successfully
```

### Test Case 2: View All Templates
```
Expected: Formatted list showing all templates with details
```

### Test Case 3: Search Template
```
Input: Search "Hello World"
Expected: Display matching template details
```

### Test Case 4: Search Non-Existent
```
Input: Search "NonExistent"
Expected: "Template not found!"
```

### Test Case 5: Validation
```
Input: Add template with empty name
Expected: "please enter name"
```

## Learning Outcomes

1. **HashMap Usage**: Mastered key-value storage for fast lookup
2. **Custom Objects**: Created Template class with multiple fields
3. **ID Generation**: Implemented counter-based unique ID system
4. **CRUD Operations**: Complete Create, Read operations
5. **Input Validation**: Comprehensive field validation
6. **toString() Override**: Custom object representation
7. **HashMap Methods**: Used put(), get(), containsKey(), keySet()

## Interview Questions

### Q: Why did you use HashMap instead of ArrayList?
**A**: HashMap provides O(1) lookup time for searching templates by name. ArrayList would require O(n) linear search. For frequent searches, HashMap is much more efficient.

### Q: How does your ID generation work?
**A**: I use a counter that increments each time a template is added. Format is "TMPL_" + counter. This ensures unique IDs: TMPL_1, TMPL_2, etc.

### Q: What happens if two templates have the same name?
**A**: HashMap automatically overwrites the previous template since name is the key. Could add validation to prevent duplicates if needed.

### Q: How would you implement file persistence?
**A**: 
- Save: Write each template to file (JSON or CSV format)
- Load: Parse file on startup, recreate HashMap
- Use FileWriter/BufferedWriter for writing
- Use FileReader/BufferedReader for reading
- Handle FileNotFoundException

## Code Quality Checklist

- ✅ Clear class structure
- ✅ Input validation
- ✅ Edge case handling
- ✅ Custom toString() method
- ✅ Clean code organization
- ⚠️ File persistence not implemented (TODO)
- ✅ User-friendly interface
- ✅ Proper encapsulation

## Status & Completion Date

**Status**: ✅ Core Features Complete (File persistence pending)  
**Completion Date**: November 2025  
**Version**: 1.0

## Future Enhancements

- [ ] Implement file persistence (save/load)
- [ ] Prevent duplicate template names
- [ ] Edit existing templates
- [ ] Delete templates
- [ ] Search by language
- [ ] Search by keyword in description
- [ ] Export templates to file
- [ ] Import templates from file
- [ ] Template categories/tags
- [ ] Code syntax highlighting in display

