<!DOCTYPE html>
<html lang="en" class="h-100">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lab-02: Page Templating (Login)</title>
    <?php include('shared/links-enhanced.php'); ?>
</head>
<body class="d-flex flex-column h-100">
    <?php include('shared/nav-enhanced.php'); ?>

    <main class="flex-shrink-0 my-auto py-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-5">
                    <div class="card card-premium p-4 shadow">
                        <div class="text-center mb-4">
                            <span class="badge bg-primary-subtle text-primary mb-2">Templated Form</span>
                            <h3 class="fw-bold">Sign In</h3>
                            <p class="text-muted small">Access dashboard mock portal</p>
                        </div>
                        <form action="#" method="POST">
                            <div class="mb-3">
                                <label for="email" class="form-label">Email Address</label>
                                <div class="input-group">
                                    <span class="input-group-text"><i class="bi bi-envelope"></i></span>
                                    <input type="email" class="form-control text-start" id="email" required placeholder="name@example.com">
                                </div>
                            </div>
                            <div class="mb-4">
                                <label for="password" class="form-label">Password</label>
                                <div class="input-group">
                                    <span class="input-group-text"><i class="bi bi-lock"></i></span>
                                    <input type="password" class="form-control text-start" id="password" required placeholder="••••••••">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-premium w-100">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <?php include('shared/footer-enhanced.php'); ?>
</body>
</html>
