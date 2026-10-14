# String In Java

## I. String in C and C++

1. String is considered as an array of characters in C.
2. In C, string is not a separate built-in datatype but it is treated as a concept.
3. In C++, we can use the `string` class from the `<string>` header file.
4. In C, a string is defined as an array of characters that ends with `\0`.
5. In C and C++, there are multiple ways in which we can create a string.

### A) Creating a String

**1. By initializing the characters individually**

```c
char Arr[6] = {'h', 'e', 'l', 'l', 'o', '\0'};
```

**2. By using double quotes**

```c
char Brr[] = "Hello";
```

6. In the first syntax, if we want to initialize the characters individually, we have to write `\0` at the end.
7. In the second syntax, if we initialize the string using double quotes, the `\0` gets added automatically.

### B) String and Pointer

1. As it is a character array, we can create a character pointer that points to the array.
2. By writing an appropriate loop, we can traverse through the string.

Consider the below loop used to traverse the string.

```c
char Brr[] = "Hello";
char *p = Brr;
int i = 0;

while (*p != '\0')
{
    i++;
    p++;
}

printf("%d", i);
```

**Output:**
```text
5
```

**Explanation:**

I. In the above syntax, there is one string and one pointer.

II. The pointer points to the base address of that array.

III. By using the `while` loop, we traverse the whole string.

IV. To apply any logic to the string, we can use the same loop.

### C) Inbuilt String Functions in C

In C, there is an inbuilt header file named `string.h` which contains multiple inbuilt functions that operate on strings.

Examples:

1. `strlen()` : It counts the number of characters in the string, excluding `\0`.
2. `strcat()` : It is used to concatenate two strings.
3. `strcpy()` : It is used to copy one string into another.
4. `strcmp()` : It is used to compare two strings.

---

# String In Java

1. In Java, String is a non-primitive datatype.
2. String is the most frequently used datatype in Java.
3. There are multiple inbuilt functions in Java that we can use to develop applications.
4. In Java, there are three classes which represent the concept of strings.

   A) `String`

   B) `StringBuffer`

   C) `StringBuilder`

## Diagram Demonstrating the Above Context

```text
                 String Concept
                       |
          +------------+------------+
          |            |            |
        String     StringBuffer  StringBuilder
          |            |            |
      Immutable      Mutable       Mutable
          |            |            |
      Not thread     Thread-safe  Not thread-safe
         safe
```

---

## A) String Class

1. It is an immutable string class.
2. If we create a String class object, the contents of the string cannot be modified.
3. Once we assign the content, we cannot change the existing String object. If we perform an operation that changes the content, a new String object is created.

### Creating a String

There are two ways in which we can create a string:

A) Without using the `new` keyword.

B) With using the `new` keyword.

**1. Without using the `new` keyword**

```java
String s1 = "Hello";
String s2 = "Hello";
```

When we create a string without the `new` keyword using a string literal, it gets memory space inside the String Constant Pool.

In the above example, both references point to the same pooled String object.

**2. With using the `new` keyword**

```java
String s1 = new String("Hello");
String s2 = new String("Hello");
```

When we use the `new` keyword, a new String object is created in heap memory for each statement.

In the above example, `s1` and `s2` refer to different String objects.

### Diagram Demonstrating the Above Context

**1. Without using the `new` keyword**

```text
        String s1 = "Hello";
        String s2 = "Hello";

           s1          s2
            |           |
            +-----+-----+
                  |
                  v
          String Constant Pool
             +---------+
             | "Hello" |
             +---------+
```

**2. With using the `new` keyword**

```text
 String s1 = new String("Hello");
 String s2 = new String("Hello");

       s1                    s2
        |                     |
        v                     v
      Heap                  Heap
   +---------+           +---------+
   | "Hello" |           | "Hello" |
   +---------+           +---------+
```

---

## B) StringBuffer Class

1. It is a mutable string class.
2. We can modify the string in this class.
3. It is a thread-safe class.
4. Its methods are synchronized, which helps prevent multiple threads from modifying the same StringBuffer at the same time through those methods.
5. Due to this, it is considered a synchronized class.
6. We have to use the `new` keyword to create a StringBuffer object.

**Example:**

```java
StringBuffer sobj = new StringBuffer("Hello");

sobj.append(" Java");

System.out.println(sobj);
```

**Output:**

```text
Hello Java
```

Here, we modified the existing StringBuffer object by adding `" Java"` to it.

### Diagram Demonstrating StringBuffer

```text
       StringBuffer Object
               |
               v
        +--------------+
        |    Hello     |
        +--------------+
               |
        append(" Java")
               |
               v
        +--------------+
        |  Hello Java  |
        +--------------+

        Existing object modified
```

---

## C) StringBuilder Class

1. It is also mutable like StringBuffer.
2. It is not thread-safe.
3. If multiple threads try to modify the same StringBuilder object simultaneously, their operations can interfere with one another and produce unexpected results.
4. In the case of StringBuilder and StringBuffer, we have to use the `new` keyword to create objects.
5. StringBuilder is generally faster than StringBuffer when synchronization is not required.

**Example:**

```java
StringBuilder sobj = new StringBuilder("Hello");

sobj.append(" Java");

System.out.println(sobj);
```

**Output:**

```text
Hello Java
```

Here, we modified the existing StringBuilder object by adding `" Java"` to it.

### Diagram Demonstrating StringBuilder

```text
       StringBuilder Object
               |
               v
        +--------------+
        |    Hello     |
        +--------------+
               |
        append(" Java")
               |
               v
        +--------------+
        |  Hello Java  |
        +--------------+

        Existing object modified
```

---

## D) Program Demonstrating String, StringBuffer and StringBuilder

```java
class Program1
{
    public static void main(String A[])
    {
        // String Example
        String sobj1 = "Hello";
        sobj1.concat(" Java");

        System.out.println(sobj1);

        // StringBuffer Example
        StringBuffer sobj2 = new StringBuffer("Hello");
        sobj2.append(" Java");

        System.out.println(sobj2);

        // StringBuilder Example
        StringBuilder sobj3 = new StringBuilder("Hello");
        sobj3.append(" Java");

        System.out.println(sobj3);
    }
}
```

**Output:**

```text
Hello
Hello Java
Hello Java
```

### Explanation

I. In the String class, `concat()` returns a new String object. Since we did not assign the result back to `sobj1`, the original content remains `"Hello"`.

II. In the StringBuffer class, `append()` modifies the existing object.

III. In the StringBuilder class, `append()` also modifies the existing object.

IV. String is immutable, whereas StringBuffer and StringBuilder are mutable.

---

## E) Difference Between String, StringBuffer and StringBuilder

| Feature | String | StringBuffer | StringBuilder |
|---|---|---|---|
| Nature | Immutable | Mutable | Mutable |
| Thread-safe | Safe due to immutability | Yes, its methods are synchronized | No |
| Modification | Creates a new String when changed | Modifies the existing object | Modifies the existing object |
| Performance | Depends on the operation | Synchronization adds overhead | Generally faster when synchronization is not required |
| Creation | Literal or `new` | Using `new` | Using `new` |

---

## References

### Java Official Documentation

1. String Class: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html
2. StringBuffer Class: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuffer.html
3. StringBuilder Class: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html
4. Java Language Specification: https://docs.oracle.com/javase/specs/

### C and C++ References

1. **Book:** *The C Programming Language* — Brian W. Kernighan and Dennis M. Ritchie.
2. C++ Standard Library String Reference: https://en.cppreference.com/w/cpp/string/basic_string.html
3. C String Handling Reference: https://en.cppreference.com/w/c/string/byte.html