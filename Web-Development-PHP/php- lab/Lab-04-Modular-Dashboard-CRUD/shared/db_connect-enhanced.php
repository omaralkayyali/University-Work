<?php
// shared/db_connect-enhanced.php
// Secure Database Connection utilizing PDO with error masking and exceptions

$host = 'localhost';
$db   = 'db_sec1';
$user = 'root';
$pass = ''; // Default XAMPP empty password
$charset = 'utf8mb4';

$dsn = "mysql:host=$host;dbname=$db;charset=$charset";
$options = [
    PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES   => false,
];

try {
     $pdo = new PDO($dsn, $user, $pass, $options);
} catch (\PDOException $e) {
     // Log the detailed error message internally, never display database credentials to end-users
     error_log("Database Connection Error: " . $e->getMessage());
     die("A secure database connection error occurred. Please configure your MySQL parameters.");
}
?>
