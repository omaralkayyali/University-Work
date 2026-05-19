# Lab 03: Admin Dashboard CRUD

## Overview
This laboratory covers database connectivity and CRUD (Create, Read, Update, Delete) operations using PHP and MySQL. It integrates the AdminLTE 4 dashboard template. Using procedural PHP script modules, it demonstrates user authentication via sessions, rendering users in dynamic data tables, deleting records, inserting new database entries, and updating existing credentials.

## Key Concepts
Inside this lab, the following core PHP & database operations are introduced and demonstrated:
* **Session Verification & Control**: Utilizing `session_start()` to track authenticated users, pre-verifying session variables before rendering protected screens, and clearing values with `session_destroy()`.
* **Procedural Database Connections (`mysqli_connect()`)**: Initializing connections to the MySQL database engine, handling link failures using `mysqli_connect_error()`, and executing standard query strings.
* **SQL Query Execution**:
  * **Read (Select)**: Loading all entries using `SELECT * FROM users` and iterating through output rows using `mysqli_fetch_assoc()`.
  * **Create (Insert)**: Appending entries using `INSERT INTO users (...) VALUES (...)`.
  * **Update**: Overwriting records using `UPDATE users SET ... WHERE user_id = ...`.
  * **Delete**: Eliminating database rows via `DELETE FROM users WHERE user_id = ...`.
* **Basic MD5 Password Encryption**: Hashing input parameters via `md5()` before verification or storage checks.

---

## Enhanced Playground Feature
The original procedural files have been duplicated and refactored into the following enhanced editions using standard PHP security conventions:
* [db_connect-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/db_connect-enhanced.php): Uses PDO instead of procedural mysqli. Includes credential masking and exception handling.
* [login-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/login-enhanced.php): Integrates CSRF tokens, session regeneration, input validation, and password checking supporting both MD5 fallback and secure Bcrypt hashes.
* [index-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/index-enhanced.php): Renders users dynamically inside a premium Bootstrap grid featuring JavaScript delete modals.
* [insert-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/insert-enhanced.php): Implements email uniqueness validation and secure prepared statement entries.
* [update-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/update-enhanced.php): Conditionally applies password modifications and updates fields safely.
* [delete-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-03-Admin-Dashboard-CRUD/delete-enhanced.php): Validates parameters as integers before executing prepared PDO deletion queries.

---
> [!NOTE]
> Reference codebase from university lectures, managed and refactored for portfolio presentation.
