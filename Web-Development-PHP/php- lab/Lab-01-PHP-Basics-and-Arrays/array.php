<?php
// numeric array because index/key is numeric
$names=array(2=>'ali','ahmad','heba');
echo $names[3];

//===========================
$days[]='Sunday';
$days[]='Monday';
echo $days[1]."<br>";
//===================
$ten=range(10,1);// return array from 1 to 10
for($i=0;$i<=9;$i++)
    echo $ten[$i]."<br>";
$range=range('a','z');
for($i=0;$i<=25;$i++)
    echo $range[$i]."<br>";

//=======================
// associative Array =>   key = characters

$states_Jo=array("AM"=>"Amman","IR"=>"IRbid","AQ"=>"Aqaba");
echo $states['AM'];

echo print_r($states_Jo);// print array as human readable 

echo print_r($ten);

//===================
// Multi-dimensional array
$states_KSA=array("Makaa","المدنية","Riyad");
echo print_r($states_KSA);

$country =array("Jo"=>$states_Jo,"KSA"=>$states_KSA);
echo $country['KSA'][2];
echo "<br>";
echo "<br>".print_r($country);
//===============
echo "the size of names array is".sizeof($names);
echo "the size of names array is".count($names);
unset($names[2]); // remove sepecific element
echo print_r($names);
unset($names); // destroy array
echo print_r($names);
//==========================

$days1=range(1,31);
echo "<select>";
for($x=0;$x<=30;$x++)
    echo "<option>". $days1[$x]. "</option>";
echo "</select>";









?>