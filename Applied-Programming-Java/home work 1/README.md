# 🎓 Student Grade Management System (Java)

This is a clean, structural project built in Java to demonstrate core concepts of **Object-Oriented Programming (OOP)** and data manipulation. It was developed as a practical implementation for the **Applied Programming** course.

---

## 🚀 Project Overview
The system models individual student profiles, manages an array of multiple academic grades, and executes utility operations such as computing averages, formatting console outputs, and finding the top-performing student dynamically.

The project is structured into two main components:
1. **`Student.java`**: The blueprint class defining attributes, encapsulation rules, and localized behavior.
2. **`GradeManager.java`**: The orchestrator class handling datasets, processing arrays, and running the main execution thread.

---

## 🛠️ Core Programming Concepts Covered

### 1. Data Encapsulation
* All structural attributes (`name`, `studentId`, `grades`, `average`) are marked as `private` to safeguard memory states from unauthorized external mutations.
* Explicit `public` getter methods are declared to provide safe, read-only entry points to individual objects.

### 2. Array & Loop Manipulations
* Employs Java's enhanced `for-each` loop architecture to seamlessly iterate over numeric grade arrays during sum calculations.
* Utilizes a linear index traversal loop when evaluating multi-object arrays.

### 3. Algorithm Implementation (Linear Search)
* The `findBestStudent()` method evaluates an entire collection of objects by caching a baseline and running conditional evaluations (`>`) across remaining indices to locate the highest average.
* Features defensive programming checkpoints by safely verifying `null` pointers and zero-length bounds (`students.length == 0`) before array traversal to prevent runtime crashes.

---

## 📂 Codebase Architecture

```text
Applied-Programming-Java/
│
├── Student.java          # Handles Student blueprints, getters, and calculations
├── GradeManager.java     # Manages execution flow and searching logic
└── README.md             # Project documentation and specifications