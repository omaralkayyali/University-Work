<?php
include("db_connect.php");
$id=$_REQUEST['mustafa'];
$sql="DELETE FROM `users` WHERE `user_id`=$id";
$result=mysqli_query($conn,$sql);
if($result)
    header("location: index.php");


?>