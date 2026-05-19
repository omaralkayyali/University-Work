# 💊 Drug & Painkiller Management System (Java)

This repository contains the solution for **Homework #3** in the **Applied Programming** course. The project demonstrates the core concepts of object inheritance and method reuse in Java.

---

## 🚀 Project Overview
The system tracks pharmaceutical entries. It defines a generic base class for a `Drug` and extends it into a specialized `Painkiller` class. A driver class manages an array of these objects, handling dynamic console inputs and conditional data filtering.

The codebase is divided logically across three files:
1. **`Drug.java`**: The superclass (parent) that holds basic attributes like price and type, along with dynamic discount calculations.
2. **`Painkiller.java`**: The subclass (child) that inherits from `Drug` using the `extends` keyword and adds identity parameters (`id`, `name`).
3. **`TestPainKiller.java`**: The execution harness that populates object arrays and prints records satisfying explicit logical constraints.

---

## 🛠️ Core OOP Concepts Demonstrated

### 1. Classical Inheritance (`extends`)
* `Painkiller` inherits attributes and functional blocks directly from `Drug`, preventing redundant code replication for properties like `price` and `type`.

### 2. Constructor Chaining (`super`)
* The parameterized constructor inside `Painkiller.java` delegates memory allocation of inherited assets back to the parent class via the `super(price, type);` keyword block.

### 3. Method Overriding (`@Override`)
* The subclass explicitly overrides the `getTotalPrice()` routine to tap directly into the underlying parent business logic using `super.getTotalPrice()`.

### 4. Array Processing & Logical Filtering
* The execution class tests complex business conditions inside a loop, isolating rows where:
  $$\text{Type} == \text{'p'} \quad \text{AND} \quad \text{TotalPrice} > 20$$

---

## 📂 Codebase Architecture

```text
Homework-3-Inheritance/
│
├── Drug.java             # Superclass mapping basic pharmaceutical metrics
├── Painkiller.java       # Subclass inheriting drug parameters
├── TestPainKiller.java   # Driver app for data populating and array querying
└── README.md             # Homework documentation and OOP specifications