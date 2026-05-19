<?php
// update-enhanced.php
session_start();

// Access Control
if (!isset($_SESSION['fname'])) {
    header("Location: login-enhanced.php");
    exit();
}

require_once('./shared/db_connect-enhanced.php');

// Validate GET input
$id = filter_input(INPUT_GET, 'ahmad', FILTER_VALIDATE_INT);
if ($id === false || $id === null) {
    die("Invalid request parameter.");
}

// Generate CSRF token if not exists
if (empty($_SESSION['csrf_token'])) {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
}

$errors = [];
$success = false;
$user = null;

// Fetch current user details
try {
    $fetch_stmt = $pdo->prepare("SELECT * FROM `users` WHERE `user_id` = :id");
    $fetch_stmt->execute(['id' => $id]);
    $user = $fetch_stmt->fetch();
    
    if (!$user) {
        die("User record not found.");
    }
} catch (\PDOException $e) {
    error_log("Fetch user fail: " . $e->getMessage());
    die("A database error occurred.");
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // 1. Verify CSRF Token
    $user_csrf = filter_input(INPUT_POST, 'csrf_token', FILTER_DEFAULT);
    if (!$user_csrf || !hash_equals($_SESSION['csrf_token'], $user_csrf)) {
        die("CSRF Token verification failed.");
    }

    // 2. Extract and sanitize inputs
    $fname = trim(filter_input(INPUT_POST, 'fname', FILTER_DEFAULT));
    $lname = trim(filter_input(INPUT_POST, 'lname', FILTER_DEFAULT));
    $email = filter_input(INPUT_POST, 'email', FILTER_VALIDATE_EMAIL);
    $password = filter_input(INPUT_POST, 'pass', FILTER_DEFAULT);

    // 3. Validation
    if (empty($fname)) {
        $errors[] = "First Name is required.";
    }
    if (empty($lname)) {
        $errors[] = "Last Name is required.";
    }
    if (!$email) {
        $errors[] = "A valid Email Address is required.";
    }

    // 4. Duplicate Email check (excluding self)
    if (empty($errors)) {
        try {
            $check_stmt = $pdo->prepare("SELECT COUNT(*) FROM `users` WHERE `email` = :email AND `user_id` != :id");
            $check_stmt->execute(['email' => $email, 'id' => $id]);
            if ($check_stmt->fetchColumn() > 0) {
                $errors[] = "The email address is already taken by another user.";
            }
        } catch (\PDOException $e) {
            error_log("Email update check error: " . $e->getMessage());
            $errors[] = "Database validation check error.";
        }
    }

    // 5. Update user
    if (empty($errors)) {
        try {
            $sql = "UPDATE `users` SET `first_name` = :fname, `last_name` = :lname, `email` = :email";
            $params = [
                'fname' => $fname,
                'lname' => $lname,
                'email' => $email,
                'id'    => $id
            ];

            // If a new password is typed, update the hash, otherwise leave original password untouched
            if (!empty($password)) {
                if (strlen($password) < 6) {
                    $errors[] = "New password must be at least 6 characters long.";
                } else {
                    $sql .= ", `password` = :password";
                    $params['password'] = password_hash($password, PASSWORD_BCRYPT);
                }
            }

            $sql .= " WHERE `user_id` = :id";

            if (empty($errors)) {
                $update_stmt = $pdo->prepare($sql);
                $result = $update_stmt->execute($params);

                if ($result) {
                    $success = true;
                    // Refresh current details representation
                    $user['first_name'] = $fname;
                    $user['last_name'] = $lname;
                    $user['email'] = $email;
                    header("Refresh: 2; URL=index-enhanced.php");
                } else {
                    $errors[] = "Unable to update user profile.";
                }
            }
        } catch (\PDOException $e) {
            error_log("Update failure: " . $e->getMessage());
            $errors[] = "Database update error: " . $e->getMessage();
        }
    }
}
?>
<!doctype html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>AdminLTE | Edit User</title>

  <!--begin::Accessibility Meta Tags-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes" />
  <meta name="color-scheme" content="light dark" />
  <meta name="theme-color" content="#007bff" media="(prefers-color-scheme: light)" />
  <meta name="theme-color" content="#1a1a1a" media="(prefers-color-scheme: dark)" />
  <!--end::Accessibility Meta Tags-->

  <!-- Include modular link definitions -->
  <?php include("./shared/links.php"); ?>
  
  <style>
      .card-premium {
          border: none;
          border-radius: 16px;
          box-shadow: 0 10px 30px rgba(0, 0, 0, 0.03);
          background: #ffffff;
      }
      .btn-submit {
          background: linear-gradient(135deg, #eab308, #ca8a04);
          border: none;
          border-radius: 10px;
          font-weight: 600;
          color: white;
      }
      .btn-submit:hover {
          transform: translateY(-1px);
          box-shadow: 0 4px 12px rgba(234, 179, 8, 0.3);
          color: white;
      }
  </style>
</head>

<body class="layout-fixed sidebar-expand-lg bg-body-tertiary">
  <!--begin::App Wrapper-->
  <div class="app-wrapper">
    <!--begin::Header & Sidebar-->
    <?php include("./shared/nav-enhanced.php"); ?>
    
    <!--begin::App Main-->
    <main class="app-main">
      <!--begin::App Content Header-->
      <div class="app-content-header">
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6">
              <h3 class="mb-0 fw-bold">Update User Profile</h3>
              <small class="text-muted">Modular Secure CRUD Edit</small>
            </div>
            <div class="col-sm-6">
              <ol class="breadcrumb float-sm-end">
                <li class="breadcrumb-item"><a href="index-enhanced.php">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">Edit User</li>
              </ol>
            </div>
          </div>
        </div>
      </div>
      
      <!--begin::App Content-->
      <div class="app-content">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-lg-8">
              <div class="card card-premium p-4">
                <div class="text-center mb-4">
                    <span class="badge bg-warning bg-opacity-10 text-warning mb-2">Secure CRUD Edit</span>
                    <h5 class="fw-bold">Modify User #<?php echo htmlspecialchars($user['user_id']); ?></h5>
                </div>

                <?php if ($success): ?>
                    <div class="alert alert-success border-0 bg-success bg-opacity-10 text-success mb-4" role="alert">
                        <i class="bi bi-check-circle-fill me-2"></i> User updated successfully! Redirecting...
                    </div>
                <?php endif; ?>

                <?php if (!empty($errors)): ?>
                    <div class="alert alert-danger border-0 bg-danger bg-opacity-10 text-danger" role="alert">
                        <h6 class="alert-heading fw-bold"><i class="bi bi-x-circle-fill me-2"></i>Update errors:</h6>
                        <ul class="mb-0 small">
                            <?php foreach ($errors as $error): ?>
                                <li><?php echo htmlspecialchars($error); ?></li>
                            <?php endforeach; ?>
                        </ul>
                    </div>
                <?php endif; ?>

                <form method="POST" action="" class="needs-validation" novalidate>
                    <!-- CSRF Token -->
                    <input type="hidden" name="csrf_token" value="<?php echo htmlspecialchars($_SESSION['csrf_token']); ?>">

                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="fname" class="form-label small fw-semibold text-secondary">First Name *</label>
                            <input type="text" name="fname" id="fname" class="form-control" required value="<?php echo htmlspecialchars($user['first_name']); ?>">
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="lname" class="form-label small fw-semibold text-secondary">Last Name *</label>
                            <input type="text" name="lname" id="lname" class="form-control" required value="<?php echo htmlspecialchars($user['last_name']); ?>">
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label small fw-semibold text-secondary">Email Address *</label>
                        <input type="email" name="email" id="email" class="form-control text-start" required placeholder="name@example.com" value="<?php echo htmlspecialchars($user['email']); ?>">
                    </div>

                    <div class="mb-4">
                        <label for="pass" class="form-label small fw-semibold text-secondary">New Password (leave empty to keep current password)</label>
                        <input type="password" name="pass" id="pass" class="form-control text-start" placeholder="••••••••">
                    </div>

                    <button type="submit" class="btn btn-warning btn-submit w-100 py-2">Save Profile Updates</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!--end::App Content-->
    </main>
    <!--end::App Main-->
    
    <!--begin::Footer-->
    <?php include("./shared/footer.php"); ?>
    <!--end::Footer-->
  </div>
  <!--end::App Wrapper-->

  <!-- Include modular JavaScript configurations -->
  <?php include("./shared/script.php"); ?>

  <script>
      // Form Validation Bootstrap Init
      (() => {
          'use strict'
          const forms = document.querySelectorAll('.needs-validation')
          Array.from(forms).forEach(form => {
              form.addEventListener('submit', event => {
                  if (!form.checkValidity()) {
                      event.preventDefault()
                      event.stopPropagation()
                  }
                  form.classList.add('was-validated')
              }, false)
          })
      })()
  </script>
</body>
</html>
