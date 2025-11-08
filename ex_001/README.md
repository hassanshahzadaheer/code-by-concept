# Code by Concept - Java Learning Examples

This repository contains practical Java examples covering fundamental Object-Oriented Programming concepts and design patterns.

## 📚 Concepts Covered

### 1. **Abstract Classes** (`src/abstract_classes/`)
- Understanding abstract classes and abstract methods
- Implementing abstract methods in concrete subclasses
- Payment processing example with PayPal and Stripe processors
- Demonstrates polymorphism with abstract base class

**Key Learning:**
- Abstract classes can have both abstract and concrete methods
- Child classes must implement all abstract methods
- Polymorphic behavior through abstract class references

### 2. **Inheritance** (`src/inheritance/`)
- Base class (`Product`) with shared properties
- Extending base class with specialized types: `Book`, `Clothes`, `Electronics`
- Method overriding (`getDetails()`)
- Shopping cart implementation using polymorphism
- Demonstrates code reusability and IS-A relationship

**Key Learning:**
- Inheritance enables code reuse
- Subclasses inherit properties and methods from parent class
- Method overriding provides specialized behavior
- Polymorphism allows treating different objects uniformly

### 3. **Method Overloading** (`src/method_overload/`)
- Multiple methods with same name but different parameters
- Smart message center with various `sendMessage()` implementations
- Varargs usage for flexible parameter lists
- Compile-time polymorphism

**Key Learning:**
- Method overloading based on parameter type, count, or order
- Java automatically selects the appropriate method at compile time
- Varargs (`int... userIds`) for variable-length arguments

### 4. **Collections & Data Structures** (`src/expenses_tracker/`)
- `HashMap` for user storage (username → User object)
- `ArrayList` for managing expenses
- User authentication system
- CRUD operations (Create, Read, Update, Delete)

**Key Learning:**
- HashMap for key-value pair storage
- ArrayList for dynamic list management
- Working with Date and GregorianCalendar
- Exception handling with try-catch blocks

### 5. **Encapsulation** (Multiple examples)
- Private fields with public methods
- Constructor usage for object initialization
- Data hiding and controlled access
- Seen across all classes (`User`, `Expense`, `Product`, etc.)

**Key Learning:**
- Encapsulation protects object state
- Constructors initialize objects properly
- Getter/setter pattern for controlled access

### 6. **String Operations & Validation** (`src/user_management/`)
- Email validation using `contains()`
- Password strength validation using regex patterns
- String manipulation methods
- Input validation best practices

**Key Learning:**
- String methods: `length()`, `contains()`, `matches()`
- Regular expressions for pattern matching
- Validation logic implementation

### 7. **Control Flow & Loops** (`src/expenses_tracker/`)
- `while` loops for menu systems
- `for` loops for iterating collections
- Conditional statements (`if-else`)
- Menu-driven console application

**Key Learning:**
- Loop structures for repetitive tasks
- Conditional logic for decision making
- Building interactive console applications

### 8. **Object-Oriented Design Patterns**
- **Strategy Pattern**: Abstract payment processors
- **Composite Pattern**: Shopping cart with multiple products
- **Builder Pattern**: Expense object creation
- **MVC-like Structure**: Separation of concerns in expense tracker

## 🎯 Project Examples

### Payment Processing System
Complete abstract class example demonstrating polymorphism with different payment processors.

### E-commerce Shopping Cart
Inheritance-based product system with dynamic pricing calculation.

### Expense Tracker Application
Full-featured console application with:
- User registration and authentication
- Expense management (add, view, remove)
- Category-based expense tracking
- Date-based expense organization

### Smart Messaging Center
Method overloading demonstration with multiple message sending options.

### User Management System
Input validation and string manipulation for user credentials.


### Running the Examples

Each package can be run independently through its `Main` class:

```bash
# Abstract Classes Example
java abstract_classes.Main

# Inheritance Example
java inheritance.Shop

# Expense Tracker
java expenses_tracker.Main

# Method Overloading
java method_overload.SmartMessageCenter

# User Management
java user_management.UserManager
```


## 🤝 Contributing

Feel free to add more examples or improve existing ones!

## 📝 License

Open for educational purposes.

---

**Note**: This is a learning repository focused on understanding Java OOP concepts through practical examples.
