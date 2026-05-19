<?php
// $_GET , $_POST, $_REQUEST
define('TXTRATE',0.16); //constant variable
$quantity=$_REQUEST['q'];
$price=$_REQUEST['p'];
$total=$quantity*$price;
//$total=$total+($total*.16);
$total+=$total*TXTRATE;
$total=number_format($total,4);
// concatenation operator .
echo "The $quantity * $price=".$total;

$num=3.6;
$num=round($num);
echo "<br>".$num;




?>