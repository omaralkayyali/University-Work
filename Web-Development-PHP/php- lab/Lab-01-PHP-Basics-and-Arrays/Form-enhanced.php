<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enhanced Order Form</title>
    <!-- Modern Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .form-container {
            max-width: 500px;
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.05);
            padding: 30px;
            margin-top: 50px;
        }
        .btn-submit {
            background: linear-gradient(135deg, #dc3545, #b02a37);
            border: none;
            transition: all 0.3s ease;
        }
        .btn-submit:hover {
            transform: translateY(-2px);
            box-shadow: 0 4px 15px rgba(220, 53, 69, 0.4);
        }
    </style>
</head>
<body>
    <div class="container d-flex justify-content-center">
        <div class="form-container w-100">
            <div class="text-center mb-4">
                <span class="badge bg-danger-subtle text-danger mb-2">Lab 01 Showcase</span>
                <h2 class="fw-bold">Calculate Total Price</h2>
                <p class="text-muted">Enter product quantity and unit price below.</p>
            </div>
            
            <form method="POST" action="handle_form-enhanced.php" class="needs-validation" novalidate>
                <!-- CSRF Token Mock -->
                <input type="hidden" name="csrf_token" value="<?php echo bin2hex(random_bytes(32)); ?>">

                <div class="mb-3">
                    <label for="quantity" class="form-label fw-semibold">Quantity</label>
                    <input type="number" name="q" id="quantity" class="form-control form-control-lg" min="1" step="1" required placeholder="e.g., 5">
                    <div class="invalid-feedback">Please enter a valid quantity of 1 or more.</div>
                </div>

                <div class="mb-4">
                    <label for="price" class="form-label fw-semibold">Price ($)</label>
                    <div class="input-group">
                        <span class="input-group-text">$</span>
                        <input type="number" name="p" id="price" class="form-control form-control-lg" min="0.01" step="0.01" required placeholder="0.00">
                        <div class="invalid-feedback">Please enter a valid price greater than 0.</div>
                    </div>
                </div>

                <button type="submit" class="btn btn-danger btn-lg w-100 btn-submit">Calculate Total</button>
            </form>
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
