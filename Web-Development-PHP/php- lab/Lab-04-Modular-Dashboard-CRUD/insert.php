<?php
session_start();
if(!isset($_SESSION['fname']))
{
 //die ("access denied");
 header("location: login.php");
}
 


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
      content="AdminLTE is a Free Bootstrap 5 Admin Dashboard, 30 example pages using Vanilla JS. Fully accessible with WCAG 2.1 AA compliance."
    />
    <meta
      name="keywords"
      content="bootstrap 5, bootstrap, bootstrap 5 admin dashboard, bootstrap 5 dashboard, bootstrap 5 charts, bootstrap 5 calendar, bootstrap 5 datepicker, bootstrap 5 tables, bootstrap 5 datatable, vanilla js datatable, colorlibhq, colorlibhq dashboard, colorlibhq admin dashboard, accessible admin panel, WCAG compliant"
    />
    <!--end::Primary Meta Tags-->

    <!--begin::Accessibility Features-->
    <!-- Skip links will be dynamically added by accessibility.js -->
    <meta name="supported-color-schemes" content="light dark" />
    <?php include("./shared/links.php"); ?>
  </head>
<?php
ob_start();

function test()
{
  header("Location: index.php");
}

?>
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
                <h3 class="mb-0">Dashboard v3</h3>
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
            require_once('./shared/db_connect.php');
            if($_SERVER['REQUEST_METHOD']=='POST')
              {
                if( !empty($_REQUEST['fname']) )
                  $fname=$_REQUEST['fname'];
                else
                  $fname=null;

                if( !empty($_REQUEST['lname']) )
                  $lname=$_REQUEST['lname'];
                else
                  $lname=null;

                if( !empty($_REQUEST['email']) )
                  $email=$_REQUEST['email'];
                else
                  $email=null;

                if( !empty($_REQUEST['pass']) )
                  $pass= md5($_REQUEST['pass']) ;
                else
                  $pass=null;

               // if(is_null($fname) && is_null($lname) && is_null($email) && is_null($pass))
              //    {

                $sql="INSERT INTO `users`( `first_name`, `last_name`, `email`, `password`) VALUES ('$fname','$lname','$email','$pass')";
                $result=mysqli_query($conn,$sql);
                if($result)
                  {
                    test();


                  }
                  else
                    {
                      echo "error".mysqli_error($conn);
                    }
                    




              //    }
              //    else
              //      {
                //      echo "should be fill out all fields";
               //     }




              }
              ob_end_flush();
            ?>
            <form action="#" method="POST">
              <label class="form-label">First Name*</label>
              <input type="text" name="fname" id="" class="form-control" >
              <label class="form-label" for="">Last Name*</label>
              <input type="text" name="lname" id="" class="form-control" required>
              <label class="form-label" for="">Email*</label>
              <input type="email" name="email" id="" class="form-control" required>
              <label class="form-label" for="">password*</label>
              <input type="password" name="pass" id="" class="form-control" required>
              <input type="submit" value="Insert" class="btn btn-success mt-3">
            </form>

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
