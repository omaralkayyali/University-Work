# Academic PHP Engineering Lab Portfolio

This repository contains a structured, refactored, and security-hardened collection of academic laboratory exercises for PHP web engineering. Originally written as procedural education scripts, the codebase has been organized into a professional portfolio format with added security features and high-fidelity playgrounds.

---

## 📂 Laboratory Overview

The workspace is organized into descriptive chapters based on course topics:

1. **[Lab 01: PHP Basics & Array Operations](file:///c:/Users/omara/Downloads/php-%20lab/Lab-01-PHP-Basics-and-Arrays)**
   * **Topics**: Standard syntax, multidimensional arrays, page routing, and text-based file stream operations (`Users.txt`).
   * **Playground**: Integrates clean input sanitization, form CSRF prevention, and file lock structures.

2. **[Lab 02: Page Templating & Layouts](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts)**
   * **Topics**: Decoupled HTML layouts, global state indicators, simple form authentications, and browser cookies.
   * **Playground**: Features strict cookie constraints (HttpOnly, Secure, SameSite) and session timeouts.

3. **[Lab 03: Admin Dashboard CRUD Integration](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD)**
   * **Topics**: Integrating the AdminLTE 4 framework, procedural database connections (`mysqli_connect()`), tabular lists, and MD5 authentication.
   * **Playground**: Hardened with PDO parameterized bindings, CSRF tokens, dynamic entry validation, and secure password verification supporting both MD5 fallback and automatic Bcrypt upgrades.

4. **[Lab 04: Modular Admin Dashboard CRUD](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD)**
   * **Topics**: Decoupled page templating layout blocks, centralized configurations, and sub-page route parameters.
   * **Playground**: Enhances modular dashboard components with secure CRUD interactions and parameter isolation.

5. **[Database Schema](file:///c:/Users/omara/Downloads/php-%20lab/Database-Schema)**
   * Contains the database structures and user mock tables required to initialize and run the CRUD projects locally.

---

## ⚡ Running Locally

To run the labs on your local environment (e.g., using XAMPP, WAMP, or Laravel Valet):

1. **Move Code**: Place this root repository directory inside your web server root (e.g., `C:/xampp/htdocs/php-lab/`).
2. **Database Setup**:
   * Open your database management tool (e.g., phpMyAdmin) and create a new database named `db_sec1`.
   * Import the SQL schema file found at [Database-Schema/schema.sql](file:///c:/Users/omara/Downloads/php-%20lab/Database-Schema/schema.sql) (or similar `.sql` schema files inside the schema directory).
3. **Configure Settings**:
   * If your local MySQL root connection has a custom password, edit the credentials in:
     * `Lab-03-Admin-Dashboard-CRUD/db_connect.php` & `db_connect-enhanced.php`
     * `Lab-04-Modular-Dashboard-CRUD/shared/db_connect.php` & `db_connect-enhanced.php`
4. **Access the Dashboard**:
   * Direct your browser to `http://localhost/php-lab/index.php`.
   * You will see the master directory dashboard mapping out all procedural labs and enhanced playgrounds.

---
> [!NOTE]
> Reference codebase from university lectures, managed and refactored for portfolio presentation.
