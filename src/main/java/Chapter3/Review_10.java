package Chapter3;

import java.util.Arrays;
import java.util.Date;

// this changes STR obj and assign with = reference to indicate to STR ,
// BUT LITERALS ARE CREATED AT RUNTIME --> IT CANNOT INDICATE TO THE SAME LOCATION
public class Review_10 {
    public static void main(String[] args) {
        // Draw in excalidraw
        // C:\Users\User\OneDrive\Desktop\OCA_PREPARATION\src\main\java\Chapter3\Review_10.png

        // The difference between ` String a = "";` and `a = "";` lies in variable declaration versus assignment:
// `String a = "";` – Declaration and Initialization (Compile-Time) -->
// IT IS EXACTLY FIRST TIME ASSIGNS --> might NOT have pointed to a different value before

// `a = "";` – Re-assignment (Runtime)
// Here, `a` is already declared (likely earlier in the code), and we’re just re-assigning it to "".
// This re-assignment is a runtime operation because `a` might have pointed to a different value before, and we’re now updating it.
// Objects created at compile time are typically string literals that the Java compiler can evaluate and optimize before the application runs
// Although `""` itself is still a constant in the string pool, the assignment itself happens when the program runs, so it’s treated as a runtime operation.

        String a = ""; // Compile-time operation: creation of string in pool
// Memory: The literal "" (empty string) is created in the string pool, and `a` points to this object.
// Value of `a`: ""

        a += 2; // Equivalent to `a = a + 2` (runtime operation).
// `a += 2` involves `a` (a variable) which may change at runtime, so the operation is performed at runtime.
// Even if `a` starts as "", concatenation with 2 creates a new String at runtime.
// Memory: Since String is immutable, `a + 2` creates a new String "2" on the heap, and `a` is updated to point to this new String.
// Value of `a`: "2"

        a += 'c';
// Memory: Creates a new String object "2c" on the heap, and `a` now points to this object.
// Value of `a`: "2c"

        a = a + false;
// Memory: Creates a new String object "2cfalse" on the heap, and `a` now points to this new object.
// Value of `a`: "2cfalse"

        if (a == "2cfalse") System.out.println("==");
// Memory: "2cfalse" literal exists in the string pool. Since `a` refers to a runtime-created object on the heap, `a == "2cfalse"` is false.
// a -->  built through runtime concatenation operations, "2cfalse" literal --> a compile-time constant and thus exists in the string pool. The JVM interned this literal, storing it in a unique memory location in the pool.

        if (a.equals("2cfalse")) System.out.println("equals");
// `.equals()` compares content, so `a.equals("2cfalse")` is true.

        System.out.println(a); // Output: "2cfalse"

// Only compile-time string literals with identical content share the same object in the string pool.
// When strings are created at runtime, even if they have the same content as a pooled string, a new object is created on the heap.
        String a1 = "hello";           // Points to "hello" in the pool
        String b = "hello";            // Points to the same "hello" in the pool
        String c = new String("hello"); // Creates a new String object on the heap, separate from the pool

        System.out.println(a1 == b);   // true, same object in the pool
        System.out.println(a1 == c);   // false, different objects

        String d = c.intern();         // Places "hello" from `c` in the pool
        System.out.println(a1 == d);   // true, now `d` refers to pooled "hello"

// Only compile-time literals with the same content share the same object in the string pool by default.
// Runtime-created strings are separate objects unless explicitly interned, which places them in the pool.

// In Java, compile-time operations on strings are those that the compiler can evaluate and optimize before execution.
// The compiler can perform constant folding on string literals to store only one instance in the pool. Examples:

// Concatenation of literals (e.g., "Hello" + " World") is evaluated at compile-time.
        String greeting = "Hello" + " World"; // Compiler treats this as "Hello World"

// Final variables with literals can also be evaluated at compile-time because final values are constants.
        final String part1 = "Hello";
        final String part2 = "World";
        String message = part1 + " " + part2; // Compiler evaluates as "Hello World"

// Concatenation with + operator for constant expressions (literal or final values) is optimized at compile-time.
        String fullName = "John" + " " + "Doe"; // Compiler treats this as "John Doe" --> assign and init
        fullName += ""; // reassign --> runtime

// Explicitly calling `.intern()` on a string places it in the pool or retrieves it if it’s already there (done at runtime).
        String name = "John".intern(); // "John" is placed in the pool

// Constant expressions involving only literals are resolved at compile-time.
        String initials = "A" + "B" + "C"; // Compiler resolves this as "ABC"

// Non-Compile-Time Operations:
// If a string expression involves non-final variables or non-literal values, it will be evaluated at runtime.

        String prefix = "Hello";
        String suffix = "World";
        String runtimeMessage = prefix + " " + suffix; // Evaluated at runtime, creating a new String on the heap
    }
}
