<?php
// insert-enhanced.php
session_start();

// Access Control
if (!isset($_SESSION['fname'])) {
    header("Location: login-enhanced.php");
    exit();
}

require_once('db_connect-enhanced.php');

// Generate CSRF token if not exists
if (empty($_SESSION['csrf_token'])) {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
}

$errors = [];
$success = false;

// Form values sticky parameters
$fname_val = '';
$lname_val = '';
$email_val = '';

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

    $fname_val = $fname;
    $lname_val = $lname;
    $email_val = $_POST['email'] ?? '';

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
    if (empty($password) || strlen($password) < 6) {
        $errors[] = "Password must be at least 6 characters long.";
    }

    // 4. Duplicate Email Check
    if (empty($errors)) {
        try {
            $check_stmt = $pdo->prepare("SELECT COUNT(*) FROM `users` WHERE `email` = :email");
            $check_stmt->execute(['email' => $email]);
            if ($check_stmt->fetchColumn() > 0) {
                $errors[] = "The email address is already registered.";
            }
        } catch (\PDOException $e) {
            error_log("Email check error: " . $e->getMessage());
            $errors[] = "A database check error occurred.";
        }
    }

    // 5. Insert Record if validation passes
    if (empty($errors)) {
        try {
            // Hash password using BCRYPT
            $hashed_pass = password_hash($password, PASSWORD_BCRYPT);

            $insert_stmt = $pdo->prepare("INSERT INTO `users` (`first_name`, `last_name`, `email`, `password`) VALUES (:fname, :lname, :email, :password)");
            $result = $insert_stmt->execute([
                'fname'    => $fname,
                'lname'    => $lname,
                'email'    => $email,
                'password' => $hashed_pass
            ]);

            if ($result) {
                $success = true;
                // Clear sticky values
                $fname_val = '';
                $lname_val = '';
                $email_val = '';
                header("Refresh: 2; URL=index-enhanced.php");
            } else {
                $errors[] = "Unable to register user record.";
            }
        } catch (\PDOException $e) {
            error_log("Insert failure: " . $e->getMessage());
            $errors[] = "Database insertion failed: " . $e->getMessage();
        }
    }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New User</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8fafc; font-family: 'Segoe UI', sans-serif; }
        .card-form { border: none; border-radius: 16px; box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05); }
        .btn-submit { background: linear-gradient(135deg, #10b981, #059669); border: none; border-radius: 10px; font-weight: 600; }
        .btn-submit:hover { transform: translateY(-1px); box-shadow: 0 4px 12px rgba(16, 185, 129, 0.3); }
    </style>
</head>
<body class="py-5">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <!-- Navigation back -->
                <div class="mb-4">
                    <a href="index-enhanced.php" class="btn btn-outline-secondary rounded-pill px-3"><i class="bi bi-arrow-left me-2"></i>Dashboard</a>
                </div>

                <div class="card card-form p-4">
                    <div class="text-center mb-4">
                        <span class="badge bg-success bg-opacity-10 text-success mb-2">Secure CRUD Entry</span>
                        <h3 class="fw-bold">Register New User</h3>
                        <p class="text-muted small">Creates a profile record using secure Bcrypt hashing.</p>
                    </div>

                    <?php if ($success): ?>
                        <div class="alert alert-success border-0 bg-success bg-opacity-10 text-success" role="alert">
                            <i class="bi bi-check-circle-fill me-2"></i> User registered successfully! Redirecting...
                        </div>
                    <?php endif; ?>

                    <?php if (!empty($errors)): ?>
                        <div class="alert alert-danger border-0 bg-danger bg-opacity-10 text-danger" role="alert">
                            <h6 class="alert-heading fw-bold"><i class="bi bi-x-circle-fill me-2"></i>Registration errors:</h6>
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
                                <input type="text" name="fname" id="fname" class="form-control" required value="<?php echo htmlspecialchars($fname_val); ?>">
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="lname" class="form-label small fw-semibold text-secondary">Last Name *</label>
                                <input type="text" name="lname" id="lname" class="form-control" required value="<?php echo htmlspecialchars($lname_val); ?>">
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="email" class="form-label small fw-semibold text-secondary">Email Address *</label>
                            <input type="email" name="email" id="email" class="form-control text-start" required placeholder="name@example.com" value="<?php echo htmlspecialchars($email_val); ?>">
                        </div>

                        <div class="mb-4">
                            <label for="pass" class="form-label small fw-semibold text-secondary">Password *</label>
                            <input type="password" name="pass" id="pass" class="form-control text-start" required placeholder="Minimum 6 characters">
                        </div>

                        <button type="submit" class="btn btn-success btn-submit w-100 py-2">Add Member</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

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
