<?php
// Central Directory Index Page for PHP Lab Portfolio
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Web Engineering Portfolio</title>
    <!-- CSS and Premium Styling -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #0b0f19;
            color: #f1f5f9;
            font-family: 'Segoe UI', system-ui, sans-serif;
            background-image: radial-gradient(circle at 10% 20%, rgba(99, 102, 241, 0.05) 0%, transparent 40%),
                              radial-gradient(circle at 90% 80%, rgba(16, 185, 129, 0.05) 0%, transparent 40%);
            min-height: 100vh;
        }
        .hero-section {
            background: linear-gradient(135deg, #0f172a, #1e293b);
            border-bottom: 1px solid rgba(255, 255, 255, 0.05);
            border-radius: 0 0 32px 32px;
            padding: 60px 0;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
        }
        .lab-card {
            background: rgba(30, 41, 59, 0.4);
            backdrop-filter: blur(8px);
            border: 1px solid rgba(255, 255, 255, 0.06);
            border-radius: 20px;
            transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
            height: 100%;
        }
        .lab-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 30px rgba(99, 102, 241, 0.15);
            border-color: rgba(99, 102, 241, 0.3);
        }
        .badge-academic {
            background: rgba(99, 102, 241, 0.15);
            color: #818cf8;
            border: 1px solid rgba(99, 102, 241, 0.2);
        }
        .badge-secure {
            background: rgba(16, 185, 129, 0.15);
            color: #34d399;
            border: 1px solid rgba(16, 185, 129, 0.2);
        }
        .btn-play {
            border-radius: 10px;
            font-weight: 600;
            font-size: 0.875rem;
            transition: all 0.2s;
        }
        .btn-original {
            background: rgba(255, 255, 255, 0.05);
            color: #cbd5e1;
            border: 1px solid rgba(255, 255, 255, 0.1);
        }
        .btn-original:hover {
            background: rgba(255, 255, 255, 0.1);
            color: #ffffff;
        }
        .btn-enhanced {
            background: linear-gradient(135deg, #10b981, #059669);
            color: #ffffff;
            border: none;
        }
        .btn-enhanced:hover {
            box-shadow: 0 4px 15px rgba(16, 185, 129, 0.4);
            color: #ffffff;
        }
    </style>
</head>
<body class="pb-5">

    <!-- Hero Welcome Dashboard Banner -->
    <section class="hero-section text-center mb-5">
        <div class="container">
            <div class="d-inline-flex p-3 bg-primary bg-opacity-10 rounded-circle text-primary mb-3">
                <i class="bi bi-code-slash fs-1 text-indigo-400"></i>
            </div>
            <h1 class="fw-bold mb-2">PHP Web Engineering Portfolio</h1>
            <p class="text-secondary max-w-2xl mx-auto">
                A refactored directory of university coursework projects. Demonstrating transition from basic procedural techniques to secure, optimized PHP implementations using PDO, CSRF protections, inputs filtering, and custom session configurations.
            </p>
            <div class="mt-4">
                <span class="badge bg-secondary bg-opacity-20 text-light px-3 py-2 rounded-pill me-2">
                    <i class="bi bi-server me-1"></i> XAMPP/WAMP Compatible
                </span>
                <span class="badge bg-success bg-opacity-20 text-success px-3 py-2 rounded-pill">
                    <i class="bi bi-shield-check me-1"></i> PDO & CSRF Ready
                </span>
            </div>
        </div>
    </section>

    <!-- Main Grid -->
    <div class="container">
        <div class="row g-4">

            <!-- Lab 1 Card -->
            <div class="col-md-6 col-lg-6">
                <div class="card lab-card p-4 d-flex flex-column justify-content-between">
                    <div>
                        <div class="d-flex justify-content-between align-items-start mb-3">
                            <span class="badge badge-academic px-3 py-2 rounded-pill">Lab 01</span>
                            <span class="text-muted small"><i class="bi bi-folder-fill me-1"></i>Lab-01-PHP-Basics-and-Arrays</span>
                        </div>
                        <h4 class="fw-bold text-white mb-2">PHP Basics & Array Operations</h4>
                        <p class="text-secondary small">
                            Covers early script constructs, multidimensional arrays, control flows, and basic file system operations using plain files (`Users.txt`) to process user registrations.
                        </p>
                        <ul class="text-secondary small ps-3 mb-4">
                            <li>Multidimensional array loops</li>
                            <li>Standard HTML form methods</li>
                            <li>Local text-file writing and streams</li>
                        </ul>
                    </div>
                    <div class="d-flex gap-2">
                        <a href="Lab-01-PHP-Basics-and-Arrays/index.php" class="btn btn-play btn-original flex-grow-1 py-2">
                            <i class="bi bi-play-fill me-1"></i>Original Code
                        </a>
                        <a href="Lab-01-PHP-Basics-and-Arrays/first-enhanced.php" class="btn btn-play btn-enhanced flex-grow-1 py-2">
                            <i class="bi bi-shield-fill-check me-1"></i>Playground
                        </a>
                    </div>
                </div>
            </div>

            <!-- Lab 2 Card -->
            <div class="col-md-6 col-lg-6">
                <div class="card lab-card p-4 d-flex flex-column justify-content-between">
                    <div>
                        <div class="d-flex justify-content-between align-items-start mb-3">
                            <span class="badge badge-academic px-3 py-2 rounded-pill">Lab 02</span>
                            <span class="text-muted small"><i class="bi bi-folder-fill me-1"></i>Lab-02-Page-Templating-and-Layouts</span>
                        </div>
                        <h4 class="fw-bold text-white mb-2">Page Templating & Layouts</h4>
                        <p class="text-secondary small">
                            Focuses on structural modular page layouts, template rendering with shared headers/navigation bars, and basic cookie/session stores for user authentications.
                        </p>
                        <ul class="text-secondary small ps-3 mb-4">
                            <li>Shared template headers/footers</li>
                            <li>Simple Session store parameters</li>
                            <li>Dynamic CSS theme styling</li>
                        </ul>
                    </div>
                    <div class="d-flex gap-2">
                        <a href="Lab-02-Page-Templating-and-Layouts/index.php" class="btn btn-play btn-original flex-grow-1 py-2">
                            <i class="bi bi-play-fill me-1"></i>Original Code
                        </a>
                        <a href="Lab-02-Page-Templating-and-Layouts/index-enhanced.php" class="btn btn-play btn-enhanced flex-grow-1 py-2">
                            <i class="bi bi-shield-fill-check me-1"></i>Playground
                        </a>
                    </div>
                </div>
            </div>

            <!-- Lab 3 Card -->
            <div class="col-md-6 col-lg-6">
                <div class="card lab-card p-4 d-flex flex-column justify-content-between">
                    <div>
                        <div class="d-flex justify-content-between align-items-start mb-3">
                            <span class="badge badge-academic px-3 py-2 rounded-pill">Lab 03</span>
                            <span class="text-muted small"><i class="bi bi-folder-fill me-1"></i>Lab-03-Admin-Dashboard-CRUD</span>
                        </div>
                        <h4 class="fw-bold text-white mb-2">Admin Dashboard CRUD Integration</h4>
                        <p class="text-secondary small">
                            Integrates the AdminLTE 4 dashboard library, establishing a local MySQL database connection to perform Create, Read, Update, and Delete operations on user details.
                        </p>
                        <ul class="text-secondary small ps-3 mb-4">
                            <li>Database links using mysqli_connect</li>
                            <li>Dynamic HTML tabular data output</li>
                            <li>MD5 password encryptions</li>
                        </ul>
                    </div>
                    <div class="d-flex gap-2">
                        <a href="Lab-03-Admin-Dashboard-CRUD/login.php" class="btn btn-play btn-original flex-grow-1 py-2">
                            <i class="bi bi-play-fill me-1"></i>Original Code
                        </a>
                        <a href="Lab-03-Admin-Dashboard-CRUD/login-enhanced.php" class="btn btn-play btn-enhanced flex-grow-1 py-2">
                            <i class="bi bi-shield-fill-check me-1"></i>Playground
                        </a>
                    </div>
                </div>
            </div>

            <!-- Lab 4 Card -->
            <div class="col-md-6 col-lg-6">
                <div class="card lab-card p-4 d-flex flex-column justify-content-between">
                    <div>
                        <div class="d-flex justify-content-between align-items-start mb-3">
                            <span class="badge badge-academic px-3 py-2 rounded-pill">Lab 04</span>
                            <span class="text-muted small"><i class="bi bi-folder-fill me-1"></i>Lab-04-Modular-Dashboard-CRUD</span>
                        </div>
                        <h4 class="fw-bold text-white mb-2">Modular Admin Dashboard CRUD</h4>
                        <p class="text-secondary small">
                            Expands upon CRUD operations by cleanly separating layouts into a centralized template hierarchy (`shared/`), optimizing site navigation controls and code reusability.
                        </p>
                        <ul class="text-secondary small ps-3 mb-4">
                            <li>Centralized connectivity parameters</li>
                            <li>Clean layouts with modularized navigation bars</li>
                            <li>Dynamic sub-page routing state preservation</li>
                        </ul>
                    </div>
                    <div class="d-flex gap-2">
                        <a href="Lab-04-Modular-Dashboard-CRUD/login.php" class="btn btn-play btn-original flex-grow-1 py-2">
                            <i class="bi bi-play-fill me-1"></i>Original Code
                        </a>
                        <a href="Lab-04-Modular-Dashboard-CRUD/login-enhanced.php" class="btn btn-play btn-enhanced flex-grow-1 py-2">
                            <i class="bi bi-shield-fill-check me-1"></i>Playground
                        </a>
                    </div>
                </div>
            </div>

        </div>
    </div>
</body>
</html>
