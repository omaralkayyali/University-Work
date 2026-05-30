<?php

// =========================================================================
// 1. Numeric Arrays
// =========================================================================

// Numeric array because the index/key is numeric
// We start the explicit indexing at 2, so 'ali' is at index 2, 'ahmad' at 3, and 'heba' at 4
$names = array(2 => 'ali', 'ahmad', 'heba');
echo $names[3] . "<br>"; 

// =========================================================================
// 2. Dynamic Array Assignment
// =========================================================================

$days[] = 'Sunday'; // Assigned to index 0
$days[] = 'Monday'; // Assigned to index 1
echo $days[1] . "<br>";

// =========================================================================
// 3. Range Function & Loops
// =========================================================================

// Note: range(10, 1) returns a descending array from 10 down to 1
$ten = range(10, 1); 
for ($i = 0; $i <= 9; $i++) {
    echo $ten[$i] . "<br>";
}

// Generating an array of characters from 'a' to 'z'
$range = range('a', 'z');
for ($i = 0; $i <= 25; $i++) {
    echo $range[$i] . "<br>";
}

// =========================================================================
// 4. Associative Arrays
// =========================================================================

// Associative Array => key = characters
$states_Jo = array("AM" => "Amman", "IR" => "IRbid", "AQ" => "Aqaba");

// Notice: Fixed a typo from the original screenshot ($states -> $states_Jo)
echo $states_Jo['AM'] . "<br>"; 

// Print array in a human-readable format
// Note: print_r() outputs directly; wrapping it in echo is optional but kept per original logic
print_r($states_Jo); 
echo "<br>";

print_r($ten);
echo "<br>";

// =========================================================================
// 5. Multi-dimensional Arrays
// =========================================================================

$states_KSA = array("Makaa", "المدينة", "Riyad");
print_r($states_KSA);
echo "<br>";

// Combining arrays into a multi-dimensional structure
$country = array("Jo" => $states_Jo, "KSA" => $states_KSA);

// Accessing elements in a nested array
echo $country['KSA'][2] . "<br>"; 
echo "<br><br>";

// Outputting the structure of the multi-dimensional array
print_r($country);
echo "<br>";

// =========================================================================
// 6. Array Utility Functions (Size & Unset)
// =========================================================================

// Getting the size of the array using sizeof() and count()
echo "the size of names array is: " . sizeof($names) . "<br>";
echo "the size of names array is: " . count($names) . "<br>";

// Remove a specific element (removes key 2 and its value 'ali')
unset($names[2]); 
print_r($names);
echo "<br>";

// Destroy the entire array variable
unset($names); 
// print_r($names); // This would now trigger an undefined variable notice

// =========================================================================
// 7. Dynamic HTML Generation (Dropdown Select)
// =========================================================================

$days1 = range(1, 31);
echo "<select>";
for ($x = 0; $x <= 30; $x++) {
    echo "<option>" . $days1[$x] . "</option>";
}
echo "</select>";

?>