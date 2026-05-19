<?php
// delete-enhanced.php
session_start();

// Access Control check
if (!isset($_SESSION['fname'])) {
    header("Location: login-enhanced.php");
    exit();
}

require_once('./shared/db_connect-enhanced.php');

// Validate and sanitize parameter input
$id = filter_input(INPUT_GET, 'x', FILTER_VALIDATE_INT);

if ($id === false || $id === null) {
    die("Invalid request parameter.");
}

try {
    // Prepared DELETE statement to prevent SQL Injection
    $stmt = $pdo->prepare("DELETE FROM `users` WHERE `user_id` = :id");
    $result = $stmt->execute(['id' => $id]);
    
    if ($result) {
        header("Location: index-enhanced.php");
        exit();
    } else {
        echo "Unable to delete user. The record might not exist.";
    }
} catch (\PDOException $e) {
    error_log("Delete user failure: " . $e->getMessage());
    die("A database error occurred during delete operation.");
}
?>
