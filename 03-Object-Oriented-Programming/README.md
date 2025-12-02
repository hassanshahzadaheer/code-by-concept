# Object-Oriented Programming

## What I Learned

### Core Concepts
- **Classes & Objects**: Blueprints and instances
- **Inheritance**: Code reuse through parent-child relationships
- **Method Overloading**: Multiple methods with same name, different parameters
- **Polymorphism**: One interface, multiple implementations
- **Abstract Classes**: Base classes that cannot be instantiated
- **Interfaces**: Contracts that classes must implement

### Key Insights

1. **Encapsulation**: Hide data (private fields), expose behavior (public methods)
2. **Inheritance reduces duplication**: Common code in parent class
3. **Polymorphism enables flexibility**: Treat different types uniformly
4. **Abstract classes**: Partial implementation, force subclasses to complete
5. **Interfaces**: Define contracts without implementation
6. **Method overloading**: Same method name, different signatures

## When to Use This

| Concept | When to Use | Example |
|---------|-------------|---------|
| **Classes & Objects** | Modeling real-world entities | Book, Student, Expense |
| **Inheritance** | Shared behavior across types | Product → Book, Clothes, Electronics |
| **Method Overloading** | Same operation, different inputs | `add(int)`, `add(double)`, `add(int, int)` |
| **Polymorphism** | Process different types uniformly | Process all PaymentProcessors the same way |
| **Abstract Classes** | Partial implementation needed | PaymentProcessor with common code |
| **Interfaces** | Multiple unrelated classes need same behavior | PaymentMethod interface |

## Code Examples

### 01-Classes-Objects/
- **Book.java**: Basic class with fields, constructor, methods
- **Student.java**: Object with multiple attributes
- **Expense.java**: Object with validation
- **UserManager.java**: Utility class with static methods

### 02-Inheritance/
- **Product.java**: Base class with common fields/methods
- **Book.java**, **Clothes.java**, **Electronics.java**: Child classes
- **Shop.java**: Uses inheritance for polymorphism
- Demonstrates: `extends`, `super`, method overriding

### 03-Method-Overloading/
- **SmartMessageCenter.java**: Same method name, different parameters
- **PaymentProcessor.java**: Overloaded `add()` and `print()` methods
- Demonstrates: Different parameter types, varargs

### 04-Polymorphism-Interfaces/
- **PaymentMethod.java**: Interface contract
- **CreditCardPayment.java**: Implementation
- **Main.java**: Polymorphic usage
- Demonstrates: `implements`, interface methods

### 05-Abstract-Classes/
- **PaymentProcessor.java**: Abstract base class
- **PayPalProcessor.java**, **StripeProcessor.java**: Concrete implementations
- Demonstrates: `abstract` keyword, `abstract` methods

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Null object references | Null checks before method calls |
| Invalid constructor parameters | Validation in constructors |
| Method not implemented | Abstract methods force implementation |
| Type casting errors | Use `instanceof` before casting |
| Overriding vs overloading confusion | Understand method signatures |

## Common Mistakes & How to Avoid

### ❌ Mistake 1: Forgetting `this` keyword
```java
// Wrong - shadowing
public void setName(String name) {
    name = name; // Doesn't work!
}

// Correct
public void setName(String name) {
    this.name = name;
}
```
**Why**: `this` refers to instance variable, parameter shadows it

### ❌ Mistake 2: Not calling `super()` in constructor
```java
// Wrong - compilation error if parent has no default constructor
public class Child extends Parent {
    public Child(int value) {
        // Missing super() call
    }
}

// Correct
public class Child extends Parent {
    public Child(int value) {
        super(value); // Call parent constructor
    }
}
```
**Why**: Child must initialize parent first

### ❌ Mistake 3: Confusing overriding vs overloading
```java
// Overloading - Same name, different parameters
void add(int a) { ... }
void add(double a) { ... }

// Overriding - Same signature, different implementation
@Override
void process() { ... } // In child class
```
**Why**: Overloading = compile-time, Overriding = runtime polymorphism

### ❌ Mistake 4: Trying to instantiate abstract class
```java
// Wrong - compilation error
PaymentProcessor p = new PaymentProcessor();

// Correct
PaymentProcessor p = new PayPalProcessor();
```
**Why**: Abstract classes cannot be instantiated, only concrete subclasses

## Related Concepts

- **Collections**: Store objects in ArrayLists, HashMaps
- **Exception Handling**: Validate in constructors and methods
- **File I/O**: Serialize/deserialize objects
- **Design Patterns**: Strategy, Template Method patterns

## Understanding Checklist

- [ ] Can create classes with fields, constructors, methods
- [ ] Understand `private`, `public`, `protected` access modifiers
- [ ] Can use `this` keyword correctly
- [ ] Can create inheritance hierarchies
- [ ] Understand `super` keyword
- [ ] Can override methods properly
- [ ] Can overload methods with different signatures
- [ ] Understand difference between abstract classes and interfaces
- [ ] Can implement interfaces
- [ ] Can use polymorphism effectively
- [ ] Understand when to use inheritance vs composition

## Key Concepts Mastered

### Encapsulation
- Private fields protect data
- Public methods control access
- Getters and setters for controlled access

### Inheritance
- `extends` keyword
- `super` for parent access
- Method overriding with `@Override`
- `protected` for child access

### Polymorphism
- Parent reference, child object
- Runtime method resolution
- Interface-based polymorphism

### Abstract Classes
- `abstract` keyword
- Cannot instantiate
- Can have both abstract and concrete methods
- Forces implementation in subclasses

### Interfaces
- `implements` keyword
- All methods are public abstract (implicitly)
- Multiple interfaces possible
- Defines contracts

## Design Principles Applied

1. **Single Responsibility**: Each class has one purpose
2. **Open/Closed**: Open for extension, closed for modification
3. **Liskov Substitution**: Child classes can replace parent
4. **Dependency Inversion**: Depend on abstractions (interfaces)

