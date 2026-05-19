<!DOCTYPE html>
<html lang="en" class="h-100">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lab-02: Page Templating (About Us)</title>
    <?php include('shared/links-enhanced.php'); ?>
</head>
<body class="d-flex flex-column h-100">
    <?php include('shared/nav-enhanced.php'); ?>

    <main class="flex-shrink-0 my-auto py-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-8 text-center">
                    <span class="badge bg-primary-subtle text-primary mb-3 px-3 py-2 fw-semibold">About Us</span>
                    <h1 class="fw-bold mb-4">University Reference Codebase</h1>
                    <div class="card card-premium p-4 text-start">
                        <p class="lead text-muted">
                            This website serves as a refactored presentation of standard university lab exercises. It highlights fundamental PHP coding structures, database CRUD operations, user login systems, and clean templating.
                        </p>
                        <p class="text-muted">
                            By utilizing PHP <code>include</code>, this page reuses the styling headers and navigation links defined in <code>shared/links-enhanced.php</code> and <code>shared/nav-enhanced.php</code> respectively, reducing duplication.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <?php include('shared/footer-enhanced.php'); ?>
</body>
</html>
