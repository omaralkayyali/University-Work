<?php
// numeric array  (index/key)=>0 1 2 3 
$names=array('Khalid','Zaid','Heba','awad');
$number=array(1,2,3,4,5);
echo $names[1];
echo "<br>";
echo print_r($names); // human readable
echo print_r($number);
$days[]='Sunday';
$days[]='Monday';
echo $days[0];
$m=range(13,1);
echo print_r($m);
$characters=range('a','z');
//echo print_r($characters);
for($x=0;$x<26;$x++)
    echo $characters[$x]."<br>";

$y=array(10=>100,200,300,400);
print_r($y);


// Assocative Array index=> string

$country=array('AM'=>"Amman",'IR'=>"IRbid",'AQ'=>"Aqaba");
echo print_r($country);
echo $country['AQ'];

// Multidimensional array
$k=array([1,2,3],[4,5,6],[7,8,9]);
echo "<h3>".$k[1][2]; //6

$students=array(0=>$names,$country);
echo $students[1]['IR'];
echo $students[0][2];
echo sizeof($country);
echo count($names);

unset($names[1]); // remove specific element
print_r($names);
unset($names); // destroy array
print_r($names);


$days1=range(1,31);
echo "<select>";
for($i=0;$i<31;$i++)
    echo "<option>".$days1[$i]."</option>";

echo "</select>";


?>