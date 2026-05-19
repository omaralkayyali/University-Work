<?php
// login-enhanced.php
session_start();

// Regenerate session ID to prevent Session Fixation attacks
if (!isset($_SESSION['initiated'])) {
    session_regenerate_id(true);
    $_SESSION['initiated'] = true;
}

require_once('./shared/db_connect-enhanced.php');

// Generate CSRF token if not exists
if (empty($_SESSION['csrf_token'])) {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
}

$error = null;

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // 1. Validate CSRF Token
    $user_csrf = filter_input(INPUT_POST, 'csrf_token', FILTER_DEFAULT);
    if (!$user_csrf || !hash_equals($_SESSION['csrf_token'], $user_csrf)) {
        die("CSRF Token verification failed.");
    }

    // 2. Extract and sanitize inputs
    $email = filter_input(INPUT_POST, 'email', FILTER_VALIDATE_EMAIL);
    $password = filter_input(INPUT_POST, 'pass', FILTER_DEFAULT);

    if (!$email) {
        $error = "Please enter a valid email address.";
    } elseif (empty($password)) {
        $error = "Please enter your password.";
    } else {
        try {
            // 3. Prepared PDO Select statement
            $stmt = $pdo->prepare("SELECT * FROM `users` WHERE `email` = :email");
            $stmt->execute(['email' => $email]);
            $user = $stmt->fetch();

            if ($user) {
                // 4. Verify password: check secure bcrypt, fallback to legacy md5 for initial seed records
                $is_password_valid = false;
                if (password_verify($password, $user['password'])) {
                    $is_password_valid = true;
                } elseif (md5($password) === $user['password']) {
                    $is_password_valid = true;
                    // Proactive upgrade: convert legacy MD5 to Bcrypt on login
                    $new_hash = password_hash($password, PASSWORD_BCRYPT);
                    $update_stmt = $pdo->prepare("UPDATE `users` SET `password` = :pwd WHERE `user_id` = :id");
                    $update_stmt->execute(['pwd' => $new_hash, 'id' => $user['user_id']]);
                }

                if ($is_password_valid) {
                    // Populate session securely
                    $_SESSION['user_id'] = $user['user_id'];
                    $_SESSION['fname'] = $user['first_name'];
                    $_SESSION['lname'] = $user['last_name'];
                    $_SESSION['email'] = $user['email'];
                    
                    // Redirect to secure dashboard
                    header("Location: index-enhanced.php");
                    exit();
                } else {
                    $error = "Invalid email or password.";
                }
            } else {
                $error = "Invalid email or password.";
            }
        } catch (\PDOException $e) {
            error_log("Login query failure: " . $e->getMessage());
            $error = "An unexpected error occurred. Please try again.";
        }
    }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secure Portal Login</title>
    <!-- Premium Google Fonts and Tailwind/Bootstrap style UI elements using native CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #0f172a, #1e293b);
            color: #f1f5f9;
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: 'Segoe UI', system-ui, sans-serif;
        }
        .login-card {
            background: rgba(30, 41, 59, 0.7);
            backdrop-filter: blur(16px);
            border: 1px solid rgba(255, 255, 255, 0.1);
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.4);
            padding: 40px;
            width: 100%;
            max-width: 440px;
        }
        .form-control {
            background: rgba(15, 23, 42, 0.6);
            border: 1px solid rgba(255, 255, 255, 0.15);
            color: #f1f5f9;
            border-radius: 10px;
        }
        .form-control:focus {
            background: rgba(15, 23, 42, 0.8);
            border-color: #3b82f6;
            box-shadow: 0 0 0 3px rgba(59, 130, 246, 0.25);
            color: #f1f5f9;
        }
        .btn-primary {
            background: linear-gradient(135deg, #2563eb, #1d4ed8);
            border: none;
            border-radius: 10px;
            padding: 12px;
            font-weight: 600;
            transition: all 0.3s ease;
        }
        .btn-primary:hover {
            transform: translateY(-2px);
            box-shadow: 0 4px 15px rgba(37, 99, 235, 0.4);
        }
    </style>
</head>
<body>
    <div class="login-card">
        <div class="text-center mb-4">
            <div class="d-inline-flex p-3 bg-primary bg-opacity-10 rounded-circle text-primary mb-3">
                <i class="bi bi-shield-lock fs-1"></i>
            </div>
            <h3 class="fw-bold">Secure CRUD System</h3>
            <p class="text-muted small">Sign in to manage database records</p>
        </div>

        <?php if ($error): ?>
            <div class="alert alert-danger border-0 bg-danger bg-opacity-10 text-danger" role="alert">
                <i class="bi bi-exclamation-triangle-fill me-2"></i> <?php echo htmlspecialchars($error); ?>
            </div>
        <?php endif; ?>

        <form method="POST" action="">
            <!-- CSRF Token inclusion -->
            <input type="hidden" name="csrf_token" value="<?php echo htmlspecialchars($_SESSION['csrf_token']); ?>">

            <div class="mb-3">
                <label for="email" class="form-label text-secondary small fw-semibold">Email Address</label>
                <div class="input-group">
                    <span class="input-group-text bg-transparent border-end-0 text-secondary"><i class="bi bi-envelope"></i></span>
                    <input type="email" name="email" id="email" class="form-control border-start-0 text-start" required placeholder="e.g., name@example.com" value="<?php echo isset($_POST['email']) ? htmlspecialchars($_POST['email']) : ''; ?>">
                </div>
            </div>

            <div class="mb-4">
                <label for="pass" class="form-label text-secondary small fw-semibold">Password</label>
                <div class="input-group">
                    <span class="input-group-text bg-transparent border-end-0 text-secondary"><i class="bi bi-key"></i></span>
                    <input type="password" name="pass" id="pass" class="form-control border-start-0 text-start" required placeholder="••••••••">
                </div>
            </div>

            <button type="submit" class="btn btn-primary w-100">Sign In Securely</button>
        </form>

        <div class="text-center mt-4">
            <span class="text-muted small">Bcrypt hashing & CSRF protection enabled</span>
        </div>
    </div>
</body>
</html>
