# File I/O & Persistence

## What I Learned

### Core Concepts
- **Reading Files**: FileReader, BufferedReader, Scanner
- **Writing Files**: FileWriter, BufferedWriter, PrintWriter
- **File Paths**: Relative vs absolute paths
- **Exception Handling**: FileNotFoundException, IOException
- **Data Parsing**: Converting file content to objects
- **Persistence**: Saving application state to files

### Key Insights

1. **Always handle exceptions**: Files may not exist or be inaccessible
2. **Use try-with-resources**: Automatic resource management
3. **Buffered I/O is faster**: Reduces disk operations
4. **Parse structured data**: Convert strings to objects
5. **Close resources**: Prevent memory leaks
6. **Validate file existence**: Check before reading

## When to Use This

| Scenario | Approach | Why |
|----------|----------|-----|
| Read configuration | FileReader + BufferedReader | Simple text reading |
| Write logs | FileWriter + BufferedWriter | Efficient writing |
| Parse structured data | Scanner with delimiters | Easy parsing |
| Large files | BufferedReader | Memory efficient |
| Simple text I/O | Scanner | Easy to use |
| Binary data | FileInputStream/OutputStream | Handle bytes |

## Code Examples

### 01-Basic-Read-Write/
- **FileBasic.java**: Basic file read/write operations
- **LogEntry.java**: Parse log entries from file
- **NoteBook.java**: CRUD operations with file persistence
- Demonstrates: Reading, writing, parsing, error handling

## Edge Cases Handled

| Edge Case | Solution |
|-----------|----------|
| File doesn't exist | Try-catch FileNotFoundException |
| File is empty | Check file size or handle empty content |
| Invalid file format | Validate before parsing |
| Permission denied | Catch IOException |
| File locked | Handle IOException gracefully |
| Corrupted data | Validate parsed data |

## Common Mistakes & How to Avoid

### ❌ Mistake 1: Not closing file resources
```java
// Wrong - resource leak
FileReader reader = new FileReader("file.txt");
// ... use reader
// Forgot to close!

// Correct - try-with-resources
try (FileReader reader = new FileReader("file.txt")) {
    // ... use reader
} // Automatically closed
```
**Why**: Unclosed resources cause memory leaks

### ❌ Mistake 2: Not handling FileNotFoundException
```java
// Wrong - crashes if file missing
FileReader reader = new FileReader("file.txt");

// Correct
try {
    FileReader reader = new FileReader("file.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found!");
}
```
**Why**: Files may not exist, must handle exception

### ❌ Mistake 3: Reading file incorrectly
```java
// Wrong - may not read entire file
String line = reader.readLine(); // Only first line

// Correct - read all lines
String line;
while ((line = reader.readLine()) != null) {
    // Process line
}
```
**Why**: Must loop to read entire file

### ❌ Mistake 4: Not flushing before closing
```java
// Wrong - data may not be written
writer.write("data");
writer.close(); // May lose data

// Correct
writer.write("data");
writer.flush(); // Ensure written
writer.close();
```
**Why**: Buffered writers need flush to write immediately

## Related Concepts

- **Collections**: Store parsed data in ArrayLists/HashMaps
- **String Manipulation**: Parse and format file content
- **Exception Handling**: Critical for file operations
- **Objects**: Convert file data to objects

## Understanding Checklist

- [ ] Can read from text files
- [ ] Can write to text files
- [ ] Can handle FileNotFoundException
- [ ] Can handle IOException
- [ ] Can use try-with-resources
- [ ] Can parse structured data from files
- [ ] Can save application state to files
- [ ] Can load application state from files
- [ ] Understand when to use BufferedReader vs Scanner
- [ ] Can validate file content before parsing

## Key Classes & Methods

### Reading Files
- `FileReader`: Read character streams
- `BufferedReader`: Efficient reading with buffering
- `Scanner`: Easy parsing with delimiters
- `readLine()`: Read one line at a time

### Writing Files
- `FileWriter`: Write character streams
- `BufferedWriter`: Efficient writing with buffering
- `PrintWriter`: Formatted output
- `write()`: Write data
- `flush()`: Force write to disk

### File Operations
- `File.exists()`: Check if file exists
- `File.length()`: Get file size
- `File.delete()`: Delete file

## Best Practices

1. **Always use try-with-resources** for automatic cleanup
2. **Handle exceptions gracefully** - don't let app crash
3. **Validate file content** before parsing
4. **Use buffered I/O** for better performance
5. **Close resources explicitly** if not using try-with-resources
6. **Check file existence** before operations
7. **Handle empty files** gracefully
8. **Use relative paths** for portability

