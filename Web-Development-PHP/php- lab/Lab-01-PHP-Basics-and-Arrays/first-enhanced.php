<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Introduction & Server Globals</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8f9fa; }
        .server-value { font-family: monospace; color: #d63384; }
    </style>
</head>
<body class="py-5">
    <div class="container">
        <header class="text-center mb-5">
            <span class="badge bg-secondary-subtle text-secondary mb-2">Lab 01 Baseline</span>
            <h1 class="fw-bold">PHP Syntax & Server Superglobals</h1>
            <p class="text-muted">Exploring fundamental variable definitions, string interpolation, and Server metadata.</p>
        </header>

        <div class="row g-4 justify-content-center">
            <!-- Basic Syntax & Interpolation -->
            <div class="col-lg-6">
                <div class="card shadow-sm border-0 h-100">
                    <div class="card-header bg-dark text-white py-3">
                        <h5 class="mb-0 fw-bold">Variable Interpolation</h5>
                    </div>
                    <div class="card-body">
                        <?php 
                        $x = 10;
                        $name = "Khalid";
                        $Name = "Ali"; // Case sensitivity demo
                        $x_float = 10.5;
                        ?>

                        <p class="mb-3">Variables in PHP are case-sensitive. Notice the difference below:</p>
                        <ul class="list-group list-group-flush mb-4">
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Variable <code>$name</code> (lowercase 'n')
                                <span class="badge bg-primary rounded-pill"><?php echo $name; ?></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Variable <code>$Name</code> (uppercase 'N')
                                <span class="badge bg-success rounded-pill"><?php echo $Name; ?></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Variable <code>$x</code> (Integer)
                                <span class="badge bg-secondary rounded-pill"><?php echo $x; ?></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Variable <code>$x1</code> (Float)
                                <span class="badge bg-info text-dark rounded-pill"><?php echo $x_float; ?></span>
                            </li>
                        </ul>

                        <div class="p-3 bg-light rounded">
                            <h6 class="fw-bold">String Quotes Difference:</h6>
                            <p class="mb-1"><strong>Double Quotes (parses variable):</strong> "hello $x" -> <span class="text-success"><?php echo "hello $x"; ?></span></p>
                            <p class="mb-0"><strong>Single Quotes (literal string):</strong> 'hello $x' -> <span class="text-danger"><?php echo 'hello $x'; ?></span></p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Server Superglobal Variables -->
            <div class="col-lg-6">
                <div class="card shadow-sm border-0 h-100">
                    <div class="card-header bg-dark text-white py-3">
                        <h5 class="mb-0 fw-bold">Server Superglobal ($_SERVER)</h5>
                    </div>
                    <div class="card-body">
                        <p class="text-muted">The <code>$_SERVER</code> array contains server headers, paths, and script locations info.</p>
                        
                        <div class="table-responsive">
                            <table class="table table-hover align-middle">
                                <thead>
                                    <tr>
                                        <th>Superglobal Key</th>
                                        <th>Value</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><code>SCRIPT_NAME</code></td>
                                        <td><span class="server-value"><?php echo htmlspecialchars($_SERVER['SCRIPT_NAME']); ?></span></td>
                                    </tr>
                                    <tr>
                                        <td><code>SERVER_ADDR</code></td>
                                        <td><span class="server-value"><?php echo htmlspecialchars($_SERVER['SERVER_ADDR'] ?? '127.0.0.1'); ?></span></td>
                                    </tr>
                                    <tr>
                                        <td><code>SERVER_NAME</code></td>
                                        <td><span class="server-value"><?php echo htmlspecialchars($_SERVER['SERVER_NAME'] ?? 'localhost'); ?></span></td>
                                    </tr>
                                    <tr>
                                        <td><code>REQUEST_METHOD</code></td>
                                        <td><span class="badge bg-warning text-dark"><?php echo htmlspecialchars($_SERVER['REQUEST_METHOD']); ?></span></td>
                                    </tr>
                                    <tr>
                                        <td><code>HTTP_USER_AGENT</code></td>
                                        <td class="small text-muted"><?php echo htmlspecialchars($_SERVER['HTTP_USER_AGENT']); ?></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
