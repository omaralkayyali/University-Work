<!DOCTYPE html>
<html lang="en" class="h-100">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lab-02: Page Templating (Home)</title>
    <?php include('shared/links-enhanced.php'); ?>
</head>
<body class="d-flex flex-column h-100">
    <!-- Navbar Header inclusion -->
    <?php include('shared/nav-enhanced.php'); ?>

    <main class="flex-shrink-0 my-auto py-5">
        <div class="container">
            <!-- Hero Section -->
            <div class="row align-items-center mb-5">
                <div class="col-lg-6 text-center text-lg-start">
                    <span class="badge bg-primary-subtle text-primary mb-3 px-3 py-2 fw-semibold">Modular Layouts</span>
                    <h1 class="display-4 fw-extrabold mb-3">Refactored <span class="gradient-text">Page Templating</span></h1>
                    <p class="lead text-muted mb-4">This module showcases the reusability of headers, footers, scripts, and links. Avoid duplicate code and maintain site changes globally with a single file edit.</p>
                    <div class="d-flex gap-3 justify-content-center justify-content-lg-start">
                        <a href="login-enhanced.php" class="btn btn-premium btn-lg">Explore Login Page</a>
                        <a href="About_us-enhanced.php" class="btn btn-outline-secondary btn-lg rounded-pill">About Us</a>
                    </div>
                </div>
                <div class="col-lg-6 mt-5 mt-lg-0 text-center">
                    <div class="card card-premium p-5 text-start border-primary border-opacity-10">
                        <div class="d-flex align-items-center mb-3">
                            <div class="bg-primary-subtle text-primary rounded-circle p-3 me-3">
                                <i class="bi bi-code-square fs-3"></i>
                            </div>
                            <h4 class="mb-0 fw-bold">Inclusion Directives</h4>
                        </div>
                        <p class="text-muted">The template utilizes PHP code-block inclusions to dynamically composite pages:</p>
                        <pre class="bg-light p-3 rounded mb-0"><code>&lt;?php
include('shared/links.php');
include('shared/nav.php');
include('shared/footer.php');
?&gt;</code></pre>
                    </div>
                </div>
            </div>

            <!-- Features Grid -->
            <div class="row g-4 mt-4">
                <div class="col-md-4">
                    <div class="card card-premium h-100 p-4">
                        <div class="text-primary mb-3"><i class="bi bi-arrow-repeat fs-2"></i></div>
                        <h5 class="fw-bold">DRY Principle</h5>
                        <p class="text-muted mb-0">"Don't Repeat Yourself." Common features are extracted to central files.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card card-premium h-100 p-4">
                        <div class="text-success mb-3"><i class="bi bi-clock-history fs-2"></i></div>
                        <h5 class="fw-bold">Maintainability</h5>
                        <p class="text-muted mb-0">Easily update navlinks or dependencies globally by updating single static layout files.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card card-premium h-100 p-4">
                        <div class="text-warning mb-3"><i class="bi bi-shield-check fs-2"></i></div>
                        <h5 class="fw-bold">Consistency</h5>
                        <p class="text-muted mb-0">Guarantees that structure, scripting parameters, and UI layouts match perfectly across all files.</p>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <!-- Footer inclusion -->
    <?php include('shared/footer-enhanced.php'); ?>
</body>
</html>
