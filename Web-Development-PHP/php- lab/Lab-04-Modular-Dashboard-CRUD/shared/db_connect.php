<?php
$conn=mysqli_connect("localhost:3307","root","");
if(!$conn)
    {
        die("Error").mysqli_connect_error();
    }
    else
        echo "Connected";

    if(mysqli_select_db($conn,"db_sec2"))
        echo "<br>database selected";





?>