<?php 
session_start();

if(!isset($_SESSION['fname']))
  header("location: login.php");

$fname=$_SESSION['fname'];
$lname=$_SESSION['lname'];





?>


<!doctype html>
<html lang="en">
<!--begin::Head-->

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>AdminLTE | Dashboard v3</title>

  <!--begin::Accessibility Meta Tags-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes" />
  <meta name="color-scheme" content="light dark" />
  <meta name="theme-color" content="#007bff" media="(prefers-color-scheme: light)" />
  <meta name="theme-color" content="#1a1a1a" media="(prefers-color-scheme: dark)" />
  <!--end::Accessibility Meta Tags-->

  <!--begin::Primary Meta Tags-->
  <meta name="title" content="AdminLTE | Dashboard v3" />
  <meta name="author" content="ColorlibHQ" />
  <meta
    name="description"
    content="AdminLTE is a Free Bootstrap 5 Admin Dashboard, 30 example pages using Vanilla JS. Fully accessible with WCAG 2.1 AA compliance." />
  <meta
    name="keywords"
    content="bootstrap 5, bootstrap, bootstrap 5 admin dashboard, bootstrap 5 dashboard, bootstrap 5 charts, bootstrap 5 calendar, bootstrap 5 datepicker, bootstrap 5 tables, bootstrap 5 datatable, vanilla js datatable, colorlibhq, colorlibhq dashboard, colorlibhq admin dashboard, accessible admin panel, WCAG compliant" />
  <!--end::Primary Meta Tags-->

  <!--begin::Accessibility Features-->
  <!-- Skip links will be dynamically added by accessibility.js -->
  <meta name="supported-color-schemes" content="light dark" />
  <?php include("./shared/links.php"); ?>

</head>

<body class="layout-fixed sidebar-expand-lg bg-body-tertiary">
  <!--begin::App Wrapper-->
  <div class="app-wrapper">
    <!--begin::Header-->
    <?php include("./shared/nav.php"); ?>
    <!--end::Sidebar-->
    <!--begin::App Main-->
    <main class="app-main">
      <!--begin::App Content Header-->
      <div class="app-content-header">
        <!--begin::Container-->
        <div class="container-fluid">
          <!--begin::Row-->
          <div class="row">
            <div class="col-sm-6">
              <h3 class="mb-0">
<?php
echo "Welcome $fname $lname";
?>



              </h3>
            </div>
            <div class="col-sm-6">
              <ol class="breadcrumb float-sm-end">
                <li class="breadcrumb-item"><a href="#">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">Dashboard v3</li>
              </ol>
            </div>
          </div>
          <!--end::Row-->
        </div>
        <!--end::Container-->
      </div>
      <div class="app-content">
        <!--begin::Container-->
        <div class="container-fluid">
          <!--begin::Row-->
          <?php
          require_once("./shared/db_connect.php");
          $sql = "SELECT * FROM `users`";
          $results = mysqli_query($conn, $sql);
          if (mysqli_num_rows($results) > 0) {
            echo "<table border=2 class='table'>";
            echo "<tr>
     <th> ID</th>
     <th>Fname</th>
     <th>Lname</th>
    <th>email</th>
    <th>password</th>
    <th>date</th>
    <th> Delete </th>
    <th> update </th>
    </tr>";
            while ($row = mysqli_fetch_assoc($results)) {
              $id = $row['user_id'];
              echo "<tr>";
              echo "<td>" . $row['user_id'] . "</td>";
              echo "<td>" . $row['first_name'] . "</td>";
              echo "<td>" . $row['last_name'] . "</td>";
              echo "<td>" . $row['email'] . "</td>";
              echo "<td>" . $row['password'] . "</td>";
              echo "<td>" . $row['registration_date'] . "</td>";
              echo "<td><a href='delete.php?x=$id' class='btn btn-danger'>Delete</a></td>";
              echo "<td> <a href='update.php?ahmad=$id' class='btn btn-success'> Update </a>   </td>";
              echo "</tr>";
            }
            echo "</table>";
          }
          ?>
          <!--end::Row-->
        </div>
        <!--end::Container-->
      </div>
      <!--end::App Content-->
    </main>
    <!--end::App Main-->
    <!--begin::Footer-->
    <?php include("./shared/footer.php"); ?>
    <!--end::Footer-->
  </div>
  <!--end::App Wrapper-->
  <?php include("./shared/script.php"); ?>
</body>
<!--end::Body-->

</html>