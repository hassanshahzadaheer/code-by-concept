# Java Fundamentals

## What I Learned

### Core Concepts
- **Variables & Data Types**: int, double, String, boolean
- **Loops**: for, while, enhanced for
- **Conditionals**: if-else, switch
- **Methods**: Parameters, return types, void
- **Input/Output**: Scanner for user input, System.out for output

### Key Insights

1. **Primitive vs Reference Types**: Primitives store values, references store addresses
2. **Variable Scope**: Local vs instance variables
3. **Loop Control**: break, continue statements
4. **Method Design**: Single responsibility, clear naming
5. **Input Validation**: Always validate user input

## When to Use This

| Concept | When to Use | Example |
|---------|-------------|---------|
| **Variables** | Store data | `int age = 25;` |
| **Loops** | Repeat operations | Process array elements |
| **Conditionals** | Make decisions | Validate input, control flow |
| **Methods** | Organize code | Reusable functionality |
| **Scanner** | Get user input | Interactive programs |

## Code Examples

### 01-Variables-DataTypes/
- Basic variable declarations and types
- Demonstrates: Primitives, objects, type conversion

### 02-Loops/
- Different loop types and control flow
- Demonstrates: for, while, enhanced for, break, continue

### 03-Conditionals/
- Decision making with if-else and switch
- Demonstrates: Conditions, logical operators, nested ifs

### 04-Methods/
- Method creation and usage
- Demonstrates: Parameters, return values, method calls

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Invalid input | Input validation with conditionals |
| Division by zero | Check before dividing |
| Null values | Null checks before operations |
| Empty input | Check `isEmpty()` or `length() == 0` |
| Type mismatches | Type casting or conversion |

## Common Mistakes & How to Avoid

### ❌ Mistake 1: Using wrong loop type
```java
// Wrong - for loop when while is better
for (int i = 0; i < unknownSize; i++) { ... }

// Correct - while for unknown iterations
while (condition) { ... }
```
**Why**: Choose loop type based on situation

### ❌ Mistake 2: Not validating input
```java
// Wrong - crashes on invalid input
int num = scanner.nextInt();

// Correct
if (scanner.hasNextInt()) {
    int num = scanner.nextInt();
} else {
    System.out.println("Invalid input!");
}
```
**Why**: User input is unpredictable, must validate

### ❌ Mistake 3: Forgetting break in switch
```java
// Wrong - falls through cases
switch (choice) {
    case 1: doSomething();
    case 2: doSomethingElse(); // Executes even if choice is 1!
}

// Correct
switch (choice) {
    case 1: 
        doSomething();
        break;
    case 2: 
        doSomethingElse();
        break;
}
```
**Why**: Switch cases fall through without break

## Related Concepts

- **Collections**: Use loops to iterate collections
- **OOP**: Methods become class methods
- **Exception Handling**: Handle invalid input
- **File I/O**: Read input from files

## Understanding Checklist

- [ ] Can declare and initialize variables
- [ ] Understand primitive vs reference types
- [ ] Can use for loops effectively
- [ ] Can use while loops effectively
- [ ] Can use enhanced for loops
- [ ] Can write if-else statements
- [ ] Can use switch statements
- [ ] Can create methods with parameters
- [ ] Can return values from methods
- [ ] Can get user input with Scanner
- [ ] Can validate input
- [ ] Understand variable scope

## Key Concepts

### Variables
- **Primitive Types**: int, double, boolean, char
- **Reference Types**: String, Arrays, Objects
- **Type Conversion**: Casting, parsing

### Loops
- **for**: Known iterations
- **while**: Unknown iterations, condition-based
- **Enhanced for**: Iterate collections
- **break**: Exit loop early
- **continue**: Skip to next iteration

### Conditionals
- **if-else**: Basic decision making
- **switch**: Multiple choices
- **Logical Operators**: &&, ||, !
- **Comparison**: ==, !=, <, >, <=, >=

### Methods
- **Parameters**: Pass data to methods
- **Return Types**: void, primitives, objects
- **Method Calls**: Invoke methods
- **Method Overloading**: Same name, different parameters

