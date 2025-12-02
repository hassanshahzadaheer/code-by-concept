# Interview Notes

Quick reference guide for Java interview questions based on concepts learned in this repository.

## Collections

### Q: What's the difference between Array and ArrayList?

**Answer**:
- **Array**: Fixed-size, created with `new Type[size]`. Size cannot change after creation. More memory-efficient. Use when size is known.
- **ArrayList**: Dynamic-size, grows automatically. More flexible. Use when size is unknown.

**Example**:
```java
// Array - fixed size
int[] numbers = new int[5];

// ArrayList - dynamic size
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10); // Can keep adding
```

**When to Use**:
- Array: Known size, performance-critical, primitive types
- ArrayList: Unknown size, need to add/remove frequently, objects

---

### Q: When would you use HashMap vs ArrayList?

**Answer**:
- **HashMap**: Use when you need fast lookup by key (O(1) time). Perfect for key-value relationships, grouping data, counting frequency.
- **ArrayList**: Use when you need ordered list, sequential access, or when order matters.

**Example**:
```java
// HashMap - fast lookup by name
HashMap<String, String> phoneBook = new HashMap<>();
phoneBook.put("John", "123-456-7890");
String phone = phoneBook.get("John"); // O(1) lookup

// ArrayList - sequential access
ArrayList<String> names = new ArrayList<>();
names.add("John");
// To find "John", need to iterate - O(n) time
```

**Real-world Use Cases**:
- HashMap: Phone book, user authentication, caching, grouping
- ArrayList: Task lists, shopping carts, ordered data

---

### Q: How do you prevent duplicates in a collection?

**Answer**:
- **ArrayList**: Use `contains()` method before adding
- **HashMap**: Keys are automatically unique, but can check `containsKey()` before put()

**Example**:
```java
// ArrayList
if (!list.contains(item)) {
    list.add(item);
}

// HashMap - keys are unique automatically
if (!map.containsKey(key)) {
    map.put(key, value);
}
```

---

## Object-Oriented Programming

### Q: What's the difference between `==` and `.equals()` for strings?

**Answer**:
- **`==`**: Compares memory references (addresses). Returns true only if both variables point to same object.
- **`.equals()`**: Compares actual string values (content). Returns true if strings have same characters.

**Example**:
```java
String str1 = "Hello";
String str2 = new String("Hello");

System.out.println(str1 == str2);        // false (different objects)
System.out.println(str1.equals(str2));  // true (same content)
```

**Best Practice**: Always use `.equals()` for string comparison, unless you specifically need to check if two references point to the same object.

---

### Q: Explain inheritance in Java.

**Answer**:
Inheritance allows a class (child) to inherit fields and methods from another class (parent). Uses `extends` keyword.

**Benefits**:
- Code reuse - common code in parent class
- Polymorphism - treat child as parent type
- Maintainability - change parent affects all children

**Example**:
```java
// Parent class
class Product {
    String name;
    double price;
}

// Child class
class Book extends Product {
    String author; // Additional field
    // Inherits name and price from Product
}
```

**Key Points**:
- Child can access parent's public/protected members
- Use `super` to call parent constructor/methods
- Can override parent methods with `@Override`

---

### Q: What's the difference between abstract classes and interfaces?

**Answer**:

| Abstract Class | Interface |
|----------------|-----------|
| Can have instance variables | Only constants (implicitly final) |
| Can have concrete methods | All methods abstract (implicitly) |
| Can have constructors | Cannot have constructors |
| Single inheritance | Multiple interfaces possible |
| Use `extends` | Use `implements` |
| Partial implementation | Pure contract |

**When to Use**:
- **Abstract Class**: When you have common code to share, need constructors, have instance variables
- **Interface**: When you need multiple inheritance, pure contract, unrelated classes need same behavior

**Example**:
```java
// Abstract class - has implementation
abstract class PaymentProcessor {
    protected double amount; // Instance variable
    
    public void process() { // Concrete method
        validate();
        execute();
    }
    
    abstract void execute(); // Abstract method
}

// Interface - pure contract
interface PaymentMethod {
    void pay(double amount); // Abstract (implicitly)
}
```

---

### Q: What is polymorphism?

**Answer**:
Polymorphism means "many forms" - ability to treat objects of different types uniformly through a common interface.

**Types**:
1. **Compile-time**: Method overloading (same name, different parameters)
2. **Runtime**: Method overriding (child overrides parent method)

**Example**:
```java
// Parent reference, child object
PaymentProcessor processor = new PayPalProcessor();
processor.process(); // Calls PayPalProcessor's process()

processor = new StripeProcessor();
processor.process(); // Calls StripeProcessor's process()
```

**Benefits**:
- Flexibility - can swap implementations
- Extensibility - add new types without changing existing code
- Code reuse - write code once, works with multiple types

---

## File I/O

### Q: How do you read from a file in Java?

**Answer**:
Multiple ways depending on needs:

**1. FileReader + BufferedReader** (for text files):
```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

**2. Scanner** (easier, for simple cases):
```java
try (Scanner scanner = new Scanner(new File("file.txt"))) {
    while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

**Key Points**:
- Always handle FileNotFoundException/IOException
- Use try-with-resources for automatic cleanup
- Check if file exists before reading

---

### Q: How do you write to a file?

**Answer**:
```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
    writer.write("Hello World");
    writer.newLine();
    writer.write("Second line");
    writer.flush(); // Ensure written to disk
} catch (IOException e) {
    e.printStackTrace();
}
```

**Key Points**:
- Use BufferedWriter for efficiency
- Call `flush()` before closing to ensure data is written
- Use try-with-resources for automatic cleanup
- Can use `FileWriter(file, true)` to append

---

## String Manipulation

### Q: Why use StringBuilder instead of String concatenation?

**Answer**:
- **String**: Immutable - each concatenation creates new object (inefficient for many operations)
- **StringBuilder**: Mutable - modifies existing object (efficient)

**Example**:
```java
// Inefficient - creates many String objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i; // Creates new String each time
}

// Efficient - modifies single object
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i); // Modifies existing object
}
String result = sb.toString();
```

**When to Use**:
- **String**: Few concatenations, simple cases
- **StringBuilder**: Many concatenations, loops, building large strings

---

## Exception Handling

### Q: What's the difference between checked and unchecked exceptions?

**Answer**:
- **Checked Exceptions**: Must be handled (compile-time check). Examples: IOException, FileNotFoundException
- **Unchecked Exceptions**: Don't need to be handled. Examples: NullPointerException, ArrayIndexOutOfBoundsException

**Example**:
```java
// Checked - must handle
try {
    FileReader reader = new FileReader("file.txt");
} catch (FileNotFoundException e) { // Required
    e.printStackTrace();
}

// Unchecked - optional handling
try {
    int[] arr = new int[5];
    arr[10] = 5; // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) { // Optional
    e.printStackTrace();
}
```

---

## Project-Specific Questions

### Q: How did you implement user authentication in Expense Tracker?

**Answer**:
Used HashMap<String, User> where key is username. Each User object contains password and expense list.

**Process**:
1. Registration: Check if username exists using `containsKey()`, if not, create new User and add to HashMap
2. Login: Retrieve User by username, compare password, set `currentUser` if match
3. All operations work on `currentUser.expenses` ArrayList

**Key Points**:
- Fast lookup by username (O(1))
- Each user has isolated expense list
- Password stored in plain text (should hash in production)

---

### Q: How did you synchronize multiple lists in Attendance System?

**Answer**:
Maintained three ArrayLists: `allStudents`, `present`, `absent`. When marking attendance:
- Mark present: Add to `present`, remove from `absent`
- Mark absent: Add to `absent`, remove from `present`

This ensures a student can't be in both lists simultaneously.

**Key Points**:
- Always update related lists together
- Check if student exists in roster before marking
- Handle unmarked students in calculations

---

### Q: How did you handle date parsing in Expense Tracker?

**Answer**:
Used `DateTimeFormatter` with pattern "dd-MM-yyyy" and `LocalDate.parse()`.

**Code**:
```java
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDate date = LocalDate.parse(userDate, format);
```

**Why Formatter**:
Without formatter, Java doesn't know date format. "11-09-2025" could be Nov 9 or Sep 11.

**Error Handling**:
Wrapped in try-catch to handle `DateTimeParseException` for invalid formats.

---

## Problem-Solving Approach

### Q: How do you approach a new programming problem?

**Answer**:
1. **Understand the Problem**: Read carefully, identify requirements
2. **Break Down**: Divide into smaller sub-problems
3. **Choose Data Structures**: Based on operations needed (lookup → HashMap, ordered → ArrayList)
4. **Design Classes**: Model real-world entities
5. **Implement Step by Step**: Start with core functionality
6. **Test**: Handle edge cases, validate input
7. **Refactor**: Improve code quality

**Example** (Task Manager):
1. Need to store tasks → ArrayList
2. Need menu → while loop with switch
3. Need to add → validate, check duplicates, add to list
4. Need to view → iterate and display
5. Need to remove → validate index, remove from list

---

## Code Quality

### Q: How do you ensure code quality?

**Answer**:
1. **Clear Naming**: Descriptive variable and method names
2. **Encapsulation**: Private fields, public methods
3. **Input Validation**: Always validate user input
4. **Error Handling**: Handle exceptions gracefully
5. **Comments**: Explain complex logic
6. **Edge Cases**: Handle empty collections, null values, invalid input
7. **Modularity**: Single responsibility per method/class

**Example**:
```java
// Good
public void addTask(String task) {
    if (task == null || task.isEmpty()) {
        throw new IllegalArgumentException("Task cannot be empty");
    }
    if (!tasks.contains(task)) {
        tasks.add(task);
    }
}

// Bad
public void add(String t) {
    tasks.add(t); // No validation, poor naming
}
```

---

## Common Mistakes to Avoid

1. **Using `==` for String comparison** → Use `.equals()`
2. **Not checking `isEmpty()`** → Always check before operations
3. **Forgetting to initialize objects in arrays** → Must create objects separately
4. **Not closing file resources** → Use try-with-resources
5. **Ignoring exceptions** → Always handle or propagate
6. **Not validating input** → Always validate user input
7. **Using wrong collection** → Choose based on operations needed

---

**Practice Tip**: Review these notes before interviews. Be ready to explain your code choices and discuss trade-offs.

**Last Updated**: November 2025

