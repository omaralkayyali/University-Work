<?php
require_once('./shared/db_connect.php');

$id=$_REQUEST['x'];

$sql="DELETE FROM `users` WHERE `user_id`=$id";
$result=mysqli_query($conn,$sql);
if($result)
    header("Location: index.php");

?>