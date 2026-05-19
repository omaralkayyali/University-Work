# Lab 04: Modular Dashboard CRUD

## Overview
This laboratory covers application modularization and template decoupling in PHP. By pulling recurring layout elements (such as stylesheet links, navigation headers, sidebars, footers, and scripts) into a dedicated `shared/` directory, it demonstrates how to keep codebase structures clean, readable, and DRY (Don't Repeat Yourself). It runs CRUD logic on database entries within a cohesive AdminLTE 4 modular interface.

## Key Concepts
Inside this lab, the following modular development and PHP concepts are introduced and demonstrated:
* **Layout Decoupling & DRY Principle**: Splitting raw monolithic HTML documents into modular sub-templates (`links.php`, `nav.php`, `footer.php`, `script.php`) and including them on-demand via `include()` and `require_once()`.
* **Centralized Configuration**: Storing the database connectivity parameters inside a single script (`shared/db_connect.php`) which is referenced across all operational scripts (`index.php`, `insert.php`, `update.php`, `delete.php`).
* **Route State Synchronization**: Keeping relative paths uniform across modular files.
* **Basic Session Authorization**: Restricting modular files behind `session_start()` checks.

---

## Enhanced Playground Feature
The modular layout scripts have been duplicated and secure PDO equivalents have been created to provide a complete secure modular CRUD implementation:
* [shared/db_connect-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/shared/db_connect-enhanced.php): Connects via PDO with error masking.
* [shared/nav-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/shared/nav-enhanced.php): Adjusts sidebar links to point to the secure CRUD handlers.
* [login-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/login-enhanced.php): Handles user logins securely with CSRF checks and Bcrypt upgrades.
* [index-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/index-enhanced.php): Modular dashboard showing current registered users with dynamic actions.
* [insert-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/insert-enhanced.php): Registers users securely using prepared statements and validations.
* [update-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/update-enhanced.php): Modular update screen with password verification controls.
* [delete-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-04-Modular-Dashboard-CRUD/delete-enhanced.php): Removes users securely after parameter verification checks.

---
> [!NOTE]
> Reference codebase from university lectures, managed and refactored for portfolio presentation.
