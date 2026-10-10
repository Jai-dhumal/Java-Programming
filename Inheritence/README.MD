# Inheritance in C++ and Java

Notes and examples on **inheritance**, one of the most important Object-Oriented Programming concepts in C++ and Java.

---

## 📂 Java Examples (Click to Open)

| # | Type of Inheritance | File |
|---|---------------------|------|
| 1 | Single Level | [SingleLevel.java](./SingleLevel.java) |
| 2 | Multilevel | [Multilevel.java](./Multilevel.java) |
| 3 | Hierarchical | [Hierarchial.java](./Hierarchial.java) |

---

## 📖 What is Inheritance?

- Inheritance means **reusability of existing characteristics (variables) and behaviour (methods) of a class**.
- It is widely used in industrial programming to **avoid rework in coding**.
- When we inherit a class, all its characteristics and behaviour get copied into its **child class**.
- Inheritance always has a **parent–child relationship**:
  - **Parent class** = Base class
  - **Child class** = Derived class

---

## 🧩 Types of Inheritance

| Type | C++ | Java |
|------|:---:|:----:|
| Single Level | ✅ | ✅ |
| Multilevel | ✅ | ✅ |
| Hierarchical | ✅ | ✅ |
| Multiple | ✅ | ❌ |

> Based on the project requirement, we can select any of these types.

### Diagrams

```
Single Level      Multilevel       Multiple          Hierarchical

   [A]               [A]           [A]   [B]             [A]
    ↓                 ↓              ↘   ↙              ↙  ↓  ↘
   [B]               [B]              [C]            [B]  [C]  [D]
                      ↓
                     [C]
```

> **Why is multiple inheritance removed in Java?**
> Because of the **ambiguity (confusion) issue**. Java therefore supports only 3 types: single level, multilevel and hierarchical.

---

## 🔤 Syntax Difference: C++ vs Java

| Feature | C++ | Java |
|---------|-----|------|
| Inherit a class | `:` (colon operator) | `extends` keyword |
| Example | `class Derived : public Base` | `class Derived extends Base` |

C++ and Java are different languages. They are **conceptually the same but syntactically different**.

---

## 1️⃣ Single Level Inheritance

### C++ Syntax

```cpp
class Base
{
public:
    int i, j;
    void fun() { }
    void sun() { }
};

class Derived : public Base
{
public:
    int x, y;
    void sun() { }
};

Base bobj;
Derived dobj;
```

### Java Syntax

```java
class Base
{
    public int i, j;
    public void fun() { }
    public void sun() { }
}

class Derived extends Base
{
    public int x, y;
    public void sun() { }
}

Base bobj = new Base();
Derived dobj = new Derived();
```

### Explanation

1. There are two classes: `Base` and `Derived`.
2. `Base` contains two characteristics, `i` and `j` (both integers).
3. `Base` contains two behaviours, `fun()` and `sun()`.
4. `Derived` inherits from `Base`.
5. `Derived` contains two characteristics, `x` and `y`.
6. `Derived` contains one behaviour, `sun()`.

### Object Layout

**Base class object (`bobj`): 8 bytes**

| Address | Member |
|---------|--------|
| 100 | `Base::i` |
| 104 | `Base::j` |

**Derived class object (`dobj`): 16 bytes**

| Address | Member |
|---------|--------|
| 200 | `Base::i` |
| 204 | `Base::j` |
| 208 | `Derived::x` |
| 212 | `Derived::y` |

- The derived object can access **4 characteristics**: `i, j, x, y`.
- The derived object can call **3 methods**: `fun()`, `sun()`, `sun()`.

---

## 2️⃣ Multilevel Inheritance

If we add one more class **below the derived class**, it becomes **multilevel inheritance**.

```
Base → Derived → DerivedX
```

### C++ Syntax

```cpp
class DerivedX : public Derived
{
public:
    int a;
    void run() { }
};
```

### Java Syntax

```java
class DerivedX extends Derived
{
    public int a;
    public void run() { }
}
```

### Object Layout of `DerivedX`: 20 bytes

| Address | Member |
|---------|--------|
| 300 | `Base::i` |
| 304 | `Base::j` |
| 308 | `Derived::x` |
| 312 | `Derived::y` |
| 316 | `DerivedX::a` |

- The object can access: `i, j, x, y, a`.
- The object can call: `fun()`, `sun()`, `sun()`, `run()`.

Create the object:

```cpp
DerivedX obj;                        // C++
```

```java
DerivedX obj = new DerivedX();       // Java
```

---

## 3️⃣ Multiple Inheritance (C++ only ❌ Not in Java)

In multiple inheritance, **one class inherits from more than one class**.

```cpp
class Demo
{
public:
    int i;
    void fun() { }
};

class Hello
{
public:
    int j;
    void sun() { }
};

class PPA : public Hello, public Demo   // inherits both
{
public:
    int x;
    void sun() { }
};

PPA Pobj;
```

### Object Layout of `Pobj`

| Address | Member |
|---------|--------|
| 400 | `Hello::j` |
| 404 | `Demo::i` |
| 408 | `PPA::x` |

> ⚠️ **Note:** This type of syntax is **not applicable in Java** (Java removed multiple inheritance).

---

## 4️⃣ Hierarchical Inheritance

In hierarchical inheritance, **multiple classes inherit from a single parent class**.

```java
class Pune { }

class Mumbai extends Pune { }

class Nashik extends Pune { }
```

```
        [ Pune ]
        ↙      ↘
  [ Mumbai ]  [ Nashik ]
```

---

## ✅ Quick Summary

- Inheritance = **reuse** of existing code (variables + methods).
- C++ uses `:`, Java uses `extends`.
- C++ supports 4 types: single, multilevel, multiple, hierarchical.
- Java supports 3 types: single, multilevel, hierarchical (**no multiple**, due to ambiguity).
- The derived class object contains the **base class members + its own members**.

---

## 🛠️ How to Run (Java)

```bash
javac SingleLevel.java
java SingleLevel
```

---

⭐ Made while learning **Inheritance in C++ and Java**.