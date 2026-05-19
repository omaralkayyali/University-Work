# Lab 01: PHP Basics and Arrays

## Overview
This laboratory covers the absolute fundamentals of PHP programming. It demonstrates baseline server-side scripting features including PHP's case-sensitive variable definitions, output mechanisms using `echo` and `print`, variable interpolation differences between single and double-quoted strings, array declarations (numeric, associative, and multidimensional), control generation (dynamic HTML selects), and form data calculations.

## Key Concepts
Inside this lab, the following core PHP capabilities are introduced and demonstrated:
* **String Interpolation & Quotation**: Double quotes `""` evaluate variables inline, whereas single quotes `''` treat content as literal string characters.
* **Server Superglobals (`$_SERVER`)**: Accessing environment variables like `$_SERVER['SCRIPT_NAME']` (the path of the current script) and `$_SERVER['SERVER_ADDR']` (the server's IP address).
* **Array Generations (`range()`)**: The `range(start, end)` function generates an array of elements from start to end (e.g., generating arrays of numbers or characters).
* **Array Information & Mutators (`count()`, `sizeof()`, `unset()`)**:
  * `count()` and its alias `sizeof()` compute the total elements in an array.
  * `unset($array[key])` removes specific elements from an array or destroys the array entirely.
* **Form Superglobals (`$_REQUEST`, `$_GET`, `$_POST`)**: Catching form parameters securely. The calculation scripts demonstrate retrieving user parameters (`q` for quantity and `p` for price), performing calculations, and formatting with `number_format()` and `round()`.

---

## Enhanced Playground Feature
The following original files have been duplicated and enhanced in their `-enhanced.php` counterparts:
* [first-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-01-PHP-Basics-and-Arrays/first-enhanced.php): A modernized, structured panel summarizing basic PHP variables and server information.
* [array-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-01-PHP-Basics-and-Arrays/array-enhanced.php): An interactive array dashboard explaining operations visually.
* [Form-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-01-PHP-Basics-and-Arrays/Form-enhanced.php): A user form styled with Bootstrap 5 featuring validation checks.
* [handle_form-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-01-PHP-Basics-and-Arrays/handle_form-enhanced.php): A secure calculations handler applying proper sanitization filters and validation before executing mathematical functions.

---
> [!NOTE]
> Reference codebase from university lectures, managed and refactored for portfolio presentation.
