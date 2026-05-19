<?php
// index-enhanced.php
session_start();

// Access Control
if (!isset($_SESSION['fname'])) {
    header("Location: login-enhanced.php");
    exit();
}

$fname = $_SESSION['fname'];
$lname = $_SESSION['lname'];

require_once('db_connect-enhanced.php');

// Fetch all users securely using PDO
try {
    $stmt = $pdo->query("SELECT * FROM `users` ORDER BY `user_id` DESC");
    $users = $stmt->fetchAll();
} catch (\PDOException $e) {
    error_log("Fetch users failed: " . $e->getMessage());
    $users = [];
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secure CRUD Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8fafc;
            color: #1e293b;
            font-family: 'Segoe UI', system-ui, sans-serif;
        }
        .header-panel {
            background: linear-gradient(135deg, #1e293b, #0f172a);
            color: #ffffff;
            border-radius: 0 0 24px 24px;
            padding: 30px 0;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.08);
        }
        .card-premium {
            border: none;
            border-radius: 16px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.03);
            background: #ffffff;
        }
        .table th {
            background-color: #f1f5f9;
            color: #475569;
            font-weight: 600;
        }
        .btn-action {
            padding: 6px 12px;
            border-radius: 8px;
            font-size: 0.875rem;
            font-weight: 500;
        }
    </style>
</head>
<body>
    <!-- Top Header -->
    <header class="header-panel mb-5">
        <div class="container d-flex justify-content-between align-items-center">
            <div>
                <span class="badge bg-primary bg-opacity-20 text-info mb-2">Secure CRUD Lab</span>
                <h2 class="fw-bold mb-0">Welcome, <?php echo htmlspecialchars($fname . ' ' . $lname); ?>!</h2>
            </div>
            <div class="d-flex gap-2">
                <a href="insert-enhanced.php" class="btn btn-info text-dark fw-bold rounded-pill px-4"><i class="bi bi-person-plus-fill me-2"></i>Add User</a>
                <a href="logout.php" class="btn btn-outline-light rounded-pill px-3"><i class="bi bi-box-arrow-right"></i></a>
            </div>
        </div>
    </header>

    <div class="container">
        <!-- Main Stats / Grid -->
        <div class="card card-premium p-4">
            <div class="d-flex justify-content-between align-items-center mb-4">
                <h4 class="fw-bold text-slate-800 mb-0">Registered Members</h4>
                <span class="badge bg-secondary text-secondary-subtle"><?php echo count($users); ?> Total Users</span>
            </div>

            <?php if (empty($users)): ?>
                <div class="text-center py-5">
                    <i class="bi bi-people text-muted fs-1 mb-3 d-block"></i>
                    <p class="text-muted">No users found in database.</p>
                </div>
            <?php else: ?>
                <div class="table-responsive">
                    <table class="table table-hover align-middle">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Email</th>
                                <th>Password (Hash)</th>
                                <th>Registration Date</th>
                                <th class="text-center">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <?php foreach ($users as $user): ?>
                                <tr>
                                    <td class="fw-semibold">#<?php echo htmlspecialchars($user['user_id']); ?></td>
                                    <td><?php echo htmlspecialchars($user['first_name']); ?></td>
                                    <td><?php echo htmlspecialchars($user['last_name']); ?></td>
                                    <td>
                                        <a href="mailto:<?php echo htmlspecialchars($user['email']); ?>" class="text-decoration-none">
                                            <?php echo htmlspecialchars($user['email']); ?>
                                        </a>
                                    </td>
                                    <td>
                                        <code class="text-truncate d-inline-block" style="max-width: 150px;" title="<?php echo htmlspecialchars($user['password']); ?>">
                                            <?php echo htmlspecialchars($user['password']); ?>
                                        </code>
                                    </td>
                                    <td class="text-muted small"><?php echo htmlspecialchars($user['registration_date']); ?></td>
                                    <td class="text-center">
                                        <div class="d-flex gap-2 justify-content-center">
                                            <a href="update-enhanced.php?ahmad=<?php echo $user['user_id']; ?>" class="btn btn-warning btn-action text-dark">
                                                <i class="bi bi-pencil-square me-1"></i>Edit
                                            </a>
                                            <button onclick="confirmDelete(<?php echo $user['user_id']; ?>)" class="btn btn-danger btn-action">
                                                <i class="bi bi-trash-fill me-1"></i>Delete
                                            </button>
                                        </div>
                                    </td>
                                </tr>
                            <?php endforeach; ?>
                        </tbody>
                    </table>
                </div>
            <?php endif; ?>
        </div>
    </div>

    <!-- Confirm Delete JavaScript -->
    <script>
        function confirmDelete(id) {
            if (confirm("Are you absolutely sure you want to delete user #" + id + "? This action is permanent!")) {
                window.location.href = "delete-enhanced.php?x=" + id;
            }
        }
    </script>
</body>
</html>
