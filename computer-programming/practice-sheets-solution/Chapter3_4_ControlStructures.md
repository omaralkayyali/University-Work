# Chapter 3 & 4: Control Structures Study Guide

This document covers essential exam concepts, logical rules, and tricky code tracing outputs for Selections (`if`, `if-else`, `switch`) and Loops (`for`, `while`, `do-while`) based on the course materials.

---

## 1. Key Selections & Logical Concepts

### Char Comparison Rules
In Java, characters (`char`) are compared based on their numerical **ASCII / Unicode** values.
* Uppercase letters `A-Z` range from **65 to 90**.
* Lowercase letters `a-z` range from **97 to 122**.
* Therefore, evaluating `'a' > 'A'` results in `true` because `97 > 65`.

### Short-Circuit Evaluation
Java uses short-circuit execution for logical operators:
* `&&` (Logical AND): If the first operand evaluates to `false`, the overall expression is automatically `false`, and the second operand is **not** evaluated.
* `||` (Logical OR): If the first operand evaluates to `true`, the overall expression is automatically `true`, and the second operand is **not** evaluated.

### Switch Statement Fall-Through
If a `break` statement is omitted from a `case` block inside a `switch` control layout, execution will continuously fall through into the subsequent cases until either a `break` is reached or the statement block ends.

---

## 2. Code Tracing Exam Questions

### Question #1: Simple Selection Outputs
**Code:**
```java
double num = 46; 
if (num < 45) 
    System.out.println(num); 
System.out.println(num + 1); 
System.out.println(num);