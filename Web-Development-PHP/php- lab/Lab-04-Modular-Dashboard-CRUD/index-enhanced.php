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

require_once('./shared/db_connect-enhanced.php');

// Fetch all users securely using PDO
try {
    $stmt = $pdo->query("SELECT * FROM `users` ORDER BY `user_id` DESC");
    $users = $stmt->fetchAll();
} catch (\PDOException $e) {
    error_log("Fetch users failed: " . $e->getMessage());
    $users = [];
}
?>
<!doctype html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>AdminLTE | Secure Dashboard</title>

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
              <h3 class="mb-0 fw-bold text-slate-800">
                Welcome, <?php echo htmlspecialchars($fname . ' ' . $lname); ?>
              </h3>
              <small class="text-muted">Modular Secure Dashboard CRUD</small>
            </div>
            <div class="col-sm-6">
              <ol class="breadcrumb float-sm-end">
                <li class="breadcrumb-item"><a href="#">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">Secure Dashboard</li>
              </ol>
            </div>
          </div>
        </div>
      </div>
      
      <!--begin::App Content-->
      <div class="app-content">
        <div class="container-fluid">
          <div class="card card-premium p-4">
            <div class="d-flex justify-content-between align-items-center mb-4">
                <h4 class="fw-bold mb-0">Registered Users</h4>
                <span class="badge bg-primary bg-opacity-10 text-primary px-3 py-2 rounded-pill"><?php echo count($users); ?> Total</span>
            </div>

            <?php if (empty($users)): ?>
                <div class="text-center py-5">
                    <i class="bi bi-people text-muted fs-1 mb-3 d-block"></i>
                    <p class="text-muted">No users registered.</p>
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
      function confirmDelete(id) {
          if (confirm("Are you absolutely sure you want to delete user #" + id + "? This cannot be undone!")) {
              window.location.href = "delete-enhanced.php?x=" + id;
          }
      }
  </script>
</body>
</html>
