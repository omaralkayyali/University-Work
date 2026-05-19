<?php
$host = "localhost:3307";
$user = "root";
$password = "";
$dbname = "studentdb";
$conn = mysqli_connect($host, $user, $password, $dbname);
if (!$conn) {
 die("Connection failed: " . mysqli_connect_error());
}
echo "Connected successfully";
?>
