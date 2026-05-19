<?php
// Start the session
session_start();

// Set session variables
$_SESSION["favcolor"] = "green";
$_SESSION["favanimal"] = "cat";
echo "Session variables are set.<br>";

// طباعة القيم للتأكد
echo "Favorite color is " . $_SESSION["favcolor"] . ".<br>";
echo "Favorite animal is " . $_SESSION["favanimal"] . ".";

// لعرض كل بيانات الجلسة:
// print_r($_SESSION);
?>