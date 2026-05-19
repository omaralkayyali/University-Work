<?php
header("Refresh:2");
date_default_timezone_set('Asia/Amman');
$date=getdate();
//echo $date['mday'].$date['month'].$date['year'];
//print_r($date);
$today=date('d-m-Y g:i:s A');
echo $today;
echo checkdate(22,22,2000) ? 'true':'false';

?>