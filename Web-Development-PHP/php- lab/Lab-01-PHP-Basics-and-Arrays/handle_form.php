<?php
// $_GET, $_POST , $_REQUEST
define('TAXRATE',0.16);
$quntity=$_REQUEST['q'];
$price=$_REQUEST['p'];
$total=$quntity*$price;
//$total=$total+($total*TAXRATE);
$total+=($total*TAXRATE);
$total=round($total);
$total=number_format($total,5);
//concatentation operator .
echo "The total price=".$total;




?>