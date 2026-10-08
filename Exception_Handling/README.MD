# ☕ Java Exception Handling

> 📚 **Learning Notes & Practical Programs**
>
> These notes cover the fundamentals of **Exception Handling in Java**, including `try`, `catch`, `finally`, `throw`, and `throws`, along with practical programs for understanding exception handling.

---

## 📖 Exception Handling in Java

1. Exception is considered as a runtime issue occured while executing the program
2. Java is cosidered as Robust programming language due to its strong Exception handling.
3. in their is inbuilt facility to handle runtime exception
4. In Industrial Programming techniques the exception handling is the important technique
5. Without the Exception handling the code will terminate abnormally but with the exception handling we avoid abnormal termination
6. In case of exception handling we have to understand the meaning of 5 keywords
   - **A] try-block**
   - **B] catch-block**
   - **C] finally-block**
   - **D] throw-block**
   - **E] throws**
7. Facility of exception handling is also their in c++ but it will not match that poer of java.

---

### A] try-block

1. Inside the try block we have to write the exception prone code (the code that may throw an error)
2. The code which is written under the try block gets executed under the observation of the jvm itself
3. Whenever their is any exception inside the try block the jvm will throw the error to the catch block

### B] catch-block

1. catch block is called as exception handler
2. the code insode the catch block gets executed whenever their is exception in the try block

### C] throw

1. this keyword is used to throe the exception explicitly
2. generally this keyword is used incase of user define exception

### D] throws

1. this keyword may indixate that the code may throw an exception

---

## 9] Exception without handling

Consider the below application which may generate an exception at line 7

```
1//code start//

7// exception prone code

12//end of code
```

1. in the above 12 lines of code if the exception occured at line-7 the code abnoramlly terminates over their and stops the exceution
2. this happens because the exception is not handle in the given code.

---

## 10] Exception handling using try, catch, finally

Consider the code which contains the exception handling mechanism using try(),catch(),finally() blocks

```
1.//code starts\\
4.try
5.{
----------------
-------------------
9.}
10.catch()
11.{
    -------------------
    -----------------------

14.}

15.finally{
    --------------------
    -------------------

19.}
```

1. in this example 1,2,3,are necked code
2. code from 4 to 9 is called exception prone code
3. as per design policies of java the code which is written under the try block gets executed under the observation of the jvm
4. if their is any exception in the part of the code the jvm will create the object of that exception class
5. The jvm the jvm will write the details about that exception in that exception object
6. this exception class object gets thrown by the jvm and it gets caught by the catch block
7. if we consider the exception at line-no7 the code jumps from line 7 to 10 which is the start of catch block
8. After executing the catch block the complete finally block gets executed irrespective of the exception
9. if their is no exception in the try block the catch block gets skipped and finally block gets executed

---

## ⭐ Some Important Points About try, catch, finally

1. After the try block their should be and immediate catch block or finnlay block (we should prefer the catch block)
2. for one try block their can be multiple catch block
3. writing the finally block is optional
4. in single application we can write the multiple pair of the try catch block
5. Exception is the root class of all types of exception
6. when we handle the exception our application becomes robust application due to which the probability of getting failure is less.

---

## 💻 Practical Programs

The concepts above are practiced using the following Java programs (click a file name to open the code):

| Program | Concept |
|---|---|
| [`ExceptionDemo1.java`](./ExceptionDemo1.java) | Basic exception-prone division |
| [`ExceptionDemo1X.java`](./ExceptionDemo1X.java) | `try`, `catch`, `finally` with `ArithmeticException` |
| [`ExceptionDemo2.java`](./ExceptionDemo2.java) | Array index exception |
| [`ExceptionDemo2X.java`](./ExceptionDemo2X.java) | Handling `ArrayIndexOutOfBoundsException` |
| [`ExceptionDemo3.java`](./ExceptionDemo3.java) | Exception-prone method |
| [`ExceptionDemo3X.java`](./ExceptionDemo3X.java) | Using `throws ArithmeticException` |
| [`ExceptionDemoXX.java`](./ExceptionDemoXX.java) | Multiple `catch` blocks with `finally` |

For example, [`ExceptionDemo1.java`](./ExceptionDemo1.java) contains the division operation marked as exception-prone code.

The handled version, [`ExceptionDemo1X.java`](./ExceptionDemo1X.java), demonstrates the use of `try`, `catch`, and `finally`.

---

## 🔗 Official Java References

For further learning and official documentation:

- 🔗 [Oracle Java Tutorials — Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- 🔗 [Oracle Java Documentation — Throwable](https://docs.oracle.com/en/java/javase/)

---

## 🎯 Learning Goal

The purpose of these programs is to understand **how Java handles runtime exceptions**, how exception-prone code is placed inside a `try` block, how exceptions are handled using `catch`, and how `finally` is used for code that should execute after exception handling.

> **Learning by implementation — understand the concept, write the program, test it, and observe the exception flow.**