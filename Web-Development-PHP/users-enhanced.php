<?php
// 1. تضمين الاتصال الآمن بقاعدة البيانات (يفضل استخدام النسخة المطورة من db_connect)
require_once("db_connect-enhanced.php");

try {
    // 2. استعلام آمن باستخدام PDO لجلب المستخدمين (بدون جلب عمود الباسورد الحساس لحماية البيانات)
    $sql = "SELECT `user_id`, `first_name`, `last_name`, `email`, `registration_date` FROM `users`";
    $stmt = $pdo->prepare($sql);
    $stmt->execute();
    $users = $stmt->fetchAll(PDO::CORES_BEFORE ?? PDO::FETCH_ASSOC);
    
    // حساب عدد الصفوف المسترجعة
    $rowCount = count($users);
    echo "<div class='alert alert-info'>Number of active rows: " . $rowCount . "</div>";

    if ($rowCount > 0) {
        // 3. بناء الجدول بتنسيق Bootstrap 5 فخم متوافق مع واجهة AdminLTE
        echo "<div class='table-responsive'>";
        echo "<table class='table table-bordered table-striped table-hover align-middle'>";
        echo "<thead class='table-dark'>";
        echo "<tr>";
        echo "<th>ID</th>";
        echo "<th>First Name</th>";
        echo "<th>Last Name</th>";
        echo "<th>Email Address</th>";
        echo "<th>Registration Date</th>";
        echo "</tr>";
        echo "</thead>";
        echo "<tbody>";

        // 4. عرض البيانات مع حماية XSS (Cross-Site Scripting) باستخدام htmlspecialchars
        foreach ($users as $row) {
            echo "<tr>";
            echo "<td><strong>" . htmlspecialchars($row['user_id']) . "</strong></td>";
            echo "<td>" . htmlspecialchars($row['first_name']) . "</td>";
            echo "<td>" . htmlspecialchars($row['last_name']) . "</td>";
            echo "<td><a href='mailto:" . htmlspecialchars($row['email']) . "'>" . htmlspecialchars($row['email']) . "</a></td>";
            echo "<td><span class='badge bg-secondary'>" . htmlspecialchars($row['registration_date']) . "</span></td>";
            echo "</tr>";
        }

        echo "</tbody>";
        echo "</table>";
        echo "</div>";
    } else {
        echo "<div class='alert alert-warning'>No record found in the users database.</div>";
    }

} catch (PDOException $e) {
    // إخفاء تفاصيل الخطأ الحساسة عن المستخدم وعرض رسالة آمنة
    echo "<div class='alert alert-danger'>Database Error: Failed to fetch secure user repository.</div>";
}
?>