<?php
include "db_connect.php";
$sql = "SELECT * FROM students";
$result = mysqli_query($conn, $sql);
if (mysqli_num_rows($result) > 0) {
 echo "<h2>Student List</h2>";
 echo "<table border='1' cellpadding='10'>";
 echo "<tr>
 <th>ID</th>
 <th>Name</th>
 <th>Email</th>
 <th>Age</th>
 </tr>";
 while ($row = mysqli_fetch_assoc($result)) {
 echo "<tr>
 <td>".$row['id']."</td>
 <td>".$row['name']."</td>
 <td>".$row['email']."</td>
 <td>".$row['age']."</td>
 </tr>";
 }
 echo "</table>";
} else {
 echo "No records found.";
}
mysqli_close($conn);
?>
