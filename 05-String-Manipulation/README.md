# String Manipulation

## What I Learned

### Core Concepts
- **String Methods**: length(), substring(), indexOf(), replace()
- **String Comparison**: equals(), equalsIgnoreCase()
- **String Formatting**: String.format(), printf()
- **Regular Expressions**: Pattern matching with matches()
- **StringBuilder**: Efficient string concatenation
- **Parsing**: Converting strings to numbers, dates

### Key Insights

1. **Strings are immutable**: Operations return new strings
2. **Use StringBuilder for concatenation**: More efficient than `+`
3. **equals() vs ==**: equals() compares values, == compares references
4. **Regular expressions**: Powerful pattern matching
5. **Parsing requires validation**: Handle NumberFormatException
6. **String formatting**: Better than concatenation for complex output

## When to Use This

| Scenario | Approach | Example |
|----------|----------|---------|
| Compare strings | `equals()` | User input validation |
| Case-insensitive compare | `equalsIgnoreCase()` | Search functionality |
| Extract substring | `substring()` | Parse file paths |
| Find position | `indexOf()` | Search in text |
| Replace text | `replace()` | Text processing |
| Pattern matching | `matches()` | Email validation |
| Format output | `String.format()` | Reports, logs |
| Multiple concatenations | `StringBuilder` | Building large strings |

## Code Examples

### StringFormatter.java
- String formatting and manipulation
- Demonstrates: Formatting, parsing, validation

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty strings | Check `isEmpty()` or `length() == 0` |
| Null strings | Null checks before operations |
| String comparison | Use `equals()` not `==` |
| Index out of bounds | Validate index before `substring()` |
| Parsing errors | Try-catch NumberFormatException |
| Case sensitivity | Use `equalsIgnoreCase()` when needed |

## Common Mistakes & How to Avoid

### ❌ Mistake 1: Using `==` for string comparison
```java
// Wrong - compares references, not values
if (str == "target") { ... }

// Correct - compares values
if (str.equals("target")) { ... }
```
**Why**: `==` checks memory address, `equals()` checks content

### ❌ Mistake 2: Not handling null strings
```java
// Wrong - NullPointerException
if (str.length() > 0) { ... }

// Correct
if (str != null && str.length() > 0) { ... }
// Or
if (str != null && !str.isEmpty()) { ... }
```
**Why**: Null strings cause crashes

### ❌ Mistake 3: Inefficient string concatenation
```java
// Wrong - creates many temporary objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i; // Creates new string each time
}

// Correct - efficient
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String result = sb.toString();
```
**Why**: StringBuilder mutates, String creates new objects

### ❌ Mistake 4: Not validating before parsing
```java
// Wrong - crashes on invalid input
int num = Integer.parseInt(userInput);

// Correct
try {
    int num = Integer.parseInt(userInput);
} catch (NumberFormatException e) {
    System.out.println("Invalid number!");
}
```
**Why**: Parsing can fail, must handle exception

## Related Concepts

- **File I/O**: Read strings from files, write formatted strings
- **Collections**: Store and search strings
- **Input Validation**: Validate user input strings
- **Regular Expressions**: Pattern matching for validation

## Understanding Checklist

- [ ] Can compare strings correctly (`equals()` vs `==`)
- [ ] Can extract substrings
- [ ] Can search within strings (`indexOf()`, `contains()`)
- [ ] Can format strings (`String.format()`, `printf()`)
- [ ] Can parse strings to numbers
- [ ] Can use regular expressions for validation
- [ ] Understand string immutability
- [ ] Can use StringBuilder efficiently
- [ ] Can handle null and empty strings
- [ ] Can validate string input

## Key Methods Mastered

### String Methods
- `length()`: Get string length
- `charAt(index)`: Get character at position
- `substring(start, end)`: Extract substring
- `indexOf(str)`: Find position of substring
- `contains(str)`: Check if contains substring
- `equals(str)`: Compare strings
- `equalsIgnoreCase(str)`: Case-insensitive compare
- `replace(old, new)`: Replace text
- `toLowerCase()` / `toUpperCase()`: Change case
- `trim()`: Remove whitespace
- `split(delimiter)`: Split into array
- `matches(regex)`: Pattern matching

### StringBuilder Methods
- `append(str)`: Add to string
- `insert(index, str)`: Insert at position
- `delete(start, end)`: Remove substring
- `toString()`: Convert to String

### Parsing Methods
- `Integer.parseInt(str)`: String to int
- `Double.parseDouble(str)`: String to double
- `Boolean.parseBoolean(str)`: String to boolean

## Best Practices

1. **Always use `equals()`** for string comparison
2. **Check for null** before string operations
3. **Use StringBuilder** for multiple concatenations
4. **Validate input** before parsing
5. **Handle parsing exceptions** with try-catch
6. **Use `trim()`** on user input
7. **Prefer `isEmpty()`** over `length() == 0`
8. **Use regular expressions** for complex validation

