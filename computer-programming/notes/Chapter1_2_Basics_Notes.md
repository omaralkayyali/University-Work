# Chapters 1 & 2: Introduction and Elementary Programming Notes

This document contains summarized reference notes for Java fundamentals, variable rules, expressions evaluation, data type ranges, and core syntax rules based on the lectures.

---

## 1. Chapter 1: Introduction to Computers and Java Syntax

### Basic Structure of a Java Program
Every Java program must contain at least one class and a `main` method which acts as the entry point for execution.
```java
// Class names start with an uppercase letter by convention
public class Welcome { 
    public static void main(String[] args) {
        // Statement terminator is always a semicolon (;)
        System.out.println("Welcome to Java!"); 
    }
}