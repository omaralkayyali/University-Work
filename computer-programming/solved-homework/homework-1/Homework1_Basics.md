# Homework 1 - Core Theory Solutions

## Question #1: A - Java Identifiers Validation
* `_myList` -> **Valid** (Can start with an underscore)
* `GO-UP` -> **Invalid** (Contains a hyphen `-`)
* `J++Program2` -> **Invalid** (Contains `+` characters)
* `quiz@ 7` -> **Invalid** (Contains a space and `@` symbol)
* `Prg$$Lec` -> **Valid** (Contains `$` characters which are legal)
* `4Levels` -> **Invalid** (Cannot start with a digit)

## Question #1: B - Expressions Evaluation
* `15 - 12 / 4 * 3` -> **6**
* `5 % 9 + 32 / 4` -> **13**
* `32 - 5 / 2.0` -> **29.5**
* `19 + 5 % 2 - 5` -> **15**
* `17.0 + 6.0 * 2.0 / 5.0` -> **19.4**

## Question #2: Java Fundamental Statements
* **a. Declare int variables x and y:**
  ```java
  int x, y;