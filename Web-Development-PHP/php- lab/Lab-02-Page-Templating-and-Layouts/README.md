# Lab 02: Page Templating and Layouts

## Overview
This laboratory illustrates the implementation of modular layouts in PHP. Instead of copy-pasting HTML structure, navigation components, and header resources across multiple files, this lab utilizes PHP file inclusion statements to build pages from shared files. This minimizes code redundancy, ensures visual design consistency, and makes modifications extremely straightforward.

## Key Concepts
Inside this lab, the following core PHP layout properties are introduced and demonstrated:
* **File Inclusion Directives**:
  * `include('path')`: Imports and evaluates the target file content. If the file is missing, a warning (`E_WARNING`) is triggered but the execution of the main script continues.
  * `require_once('path')`: Mandates that the specified file is loaded, throwing a fatal error (`E_COMPILE_ERROR`) and stopping execution if the file is missing. The `_once` suffix guarantees the file is included exactly once, preventing class re-declarations or duplicate markup output.
* **Component Extraction**: Extracting structural HTML wrappers (`shared/links.php` for styles, `shared/nav.php` for menus, and `shared/footer.php` for bottom sections) so they are written in one place but rendered globally.

---

## Enhanced Playground Feature
The following original templates have been duplicated and enhanced in their `-enhanced.php` counterparts:
* [index-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/index-enhanced.php): Features a modern hero section, clean details, and templating explanations.
* [login-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/login-enhanced.php): A styled mock login panel demonstrating form component inclusion.
* [About_us-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/About_us-enhanced.php): An informational template highlighting codebase details.
* [contact_us-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/contact_us-enhanced.php): Features a bootstrap contact form card layout.
* Shared layout files: [links-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/shared/links-enhanced.php), [nav-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/shared/nav-enhanced.php), and [footer-enhanced.php](file:///c:/Users/omara/Downloads/php-%20lab/Lab-02-Page-Templating-and-Layouts/shared/footer-enhanced.php) which use Outfit typography, Bootstrap icons, and modern styles.

---
> [!NOTE]
> Reference codebase from university lectures, managed and refactored for portfolio presentation.
