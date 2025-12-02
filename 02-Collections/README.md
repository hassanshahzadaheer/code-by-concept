# Collections - Arrays, ArrayList, HashMap

## What I Learned

### Core Concepts
- **Arrays**: Fixed-size collections for primitive types and objects
- **ArrayList**: Dynamic, resizable arrays with built-in methods
- **HashMap**: Key-value pairs for fast lookup and data organization

### Key Insights

1. **Arrays are fixed-size** - You must know the size at creation time
2. **ArrayList grows dynamically** - Perfect when size is unknown
3. **HashMap provides O(1) lookup** - Much faster than searching arrays/lists
4. **Collections work with objects** - Can store complex data structures
5. **Each has specific use cases** - Choose based on your needs

## When to Use This

| Scenario | Best Choice | Why |
|----------|-------------|-----|
| Fixed number of items | Array | Simple, fast, memory-efficient |
| Unknown number of items | ArrayList | Dynamic sizing, easy to add/remove |
| Fast lookup by key | HashMap | O(1) access time |
| Need to maintain order | ArrayList | Preserves insertion order |
| Need to group data | HashMap | Group by key, store values |
| Counting frequency | HashMap | Key = item, Value = count |
| Simple list operations | ArrayList | Rich API (add, remove, contains) |

## Code Examples

### 01-Arrays/
- **Main.java**: Basic array operations (sum, average, min, max)
- Demonstrates: Declaration, initialization, iteration, calculations

### 02-ArrayList/
- **Main.java**: Student management with ArrayList
- **Student.java**: Object stored in ArrayList
- Demonstrates: Dynamic sizing, object storage, iteration

### 03-HashMap/
- **WordFrequency.java**: Count word occurrences
- **PhoneBook.java**: Contact lookup system
- Demonstrates: Key-value pairs, fast lookup, data grouping

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| Empty collection | Check `isEmpty()` before operations |
| Null values | Validate before adding/accessing |
| Duplicate keys (HashMap) | Use `containsKey()` before `put()` |
| Index out of bounds | Validate index before accessing |
| Not found searches | Use boolean flags or `contains()` |
| Collection synchronization | Maintain multiple collections in sync |

## Common Mistakes & How to Avoid

### ❌ Mistake 1: Using `==` for String comparison
```java
// Wrong
if (array[i] == "target") { ... }

// Correct
if (array[i].equals("target")) { ... }
```
**Why**: `==` compares memory references, `.equals()` compares values

### ❌ Mistake 2: Forgetting to initialize objects in arrays
```java
// Wrong - NullPointerException!
Expense[] expenses = new Expense[5];
expenses[0].getAmount(); // Crashes!

// Correct
Expense[] expenses = new Expense[5];
expenses[0] = new Expense(50.0, "Food", "Lunch");
```
**Why**: Creating array doesn't create objects, must instantiate each

### ❌ Mistake 3: Not checking isEmpty() before loops
```java
// Wrong - May cause issues
for (String item : list) { ... }

// Correct
if (!list.isEmpty()) {
    for (String item : list) { ... }
}
```
**Why**: Prevents errors on empty collections

### ❌ Mistake 4: Using wrong index in remove()
```java
// Wrong - Off by one error
taskManager.remove(taskNum); // User enters 1, but index is 0

// Correct
taskManager.remove(taskNum - 1);
```
**Why**: User sees 1-based numbering, arrays are 0-based

## Related Concepts

- **Object-Oriented Programming**: Collections store objects, not just primitives
- **Loops**: Essential for iterating through collections
- **Exception Handling**: Handle IndexOutOfBoundsException, NullPointerException
- **File I/O**: Read collections from files, write collections to files

## Understanding Checklist

- [ ] Can declare and initialize arrays
- [ ] Can add/remove items from ArrayList
- [ ] Can search for items in collections
- [ ] Can iterate through collections (for loop, enhanced for loop)
- [ ] Can use HashMap for key-value lookups
- [ ] Can handle empty collections
- [ ] Can prevent duplicates
- [ ] Can synchronize multiple collections
- [ ] Understand when to use Array vs ArrayList vs HashMap
- [ ] Can work with collections of objects

## Key Methods Mastered

### Arrays
- `array.length` - Get size
- `array[index]` - Access element
- `new Type[size]` - Create array

### ArrayList
- `add(element)` - Add item
- `get(index)` - Get item
- `remove(index)` - Remove item
- `size()` - Get count
- `contains(element)` - Check existence
- `isEmpty()` - Check if empty

### HashMap
- `put(key, value)` - Add/update
- `get(key)` - Retrieve value
- `containsKey(key)` - Check key exists
- `remove(key)` - Remove entry
- `keySet()` - Get all keys
- `values()` - Get all values

