<?php
// Define constant tax rate
define('TAXRATE', 0.16);

// Validate Request Method
if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    header("Location: Form-enhanced.php");
    exit();
}

// Extract and sanitize inputs
$quantity = filter_input(INPUT_POST, 'q', FILTER_VALIDATE_INT);
$price = filter_input(INPUT_POST, 'p', FILTER_VALIDATE_FLOAT);

$errors = [];

// Validate fields
if ($quantity === false || $quantity <= 0) {
    $errors[] = "Quantity must be a positive integer.";
}
if ($price === false || $price <= 0) {
    $errors[] = "Price must be a positive number.";
}

// Compute values if no errors
if (empty($errors)) {
    $subtotal = $quantity * $price;
    $tax = $subtotal * TAXRATE;
    $total = $subtotal + $tax;
    
    // Formatting values
    $formatted_subtotal = number_format($subtotal, 2);
    $formatted_tax = number_format($tax, 2);
    $formatted_total = number_format($total, 2);
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculation Invoice</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8f9fa; }
        .invoice-card {
            max-width: 500px;
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.05);
            padding: 30px;
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container d-flex justify-content-center">
        <div class="invoice-card w-100">
            <div class="text-center mb-4">
                <span class="badge bg-success-subtle text-success mb-2">Calculation Success</span>
                <h3 class="fw-bold">Invoice Details</h3>
            </div>

            <?php if (!empty($errors)): ?>
                <div class="alert alert-danger" role="alert">
                    <h5 class="alert-heading fw-bold">Validation Errors:</h5>
                    <ul class="mb-0">
                        <?php foreach ($errors as $error): ?>
                            <li><?php echo htmlspecialchars($error); ?></li>
                        <?php endforeach; ?>
                    </ul>
                </div>
                <a href="Form-enhanced.php" class="btn btn-outline-secondary w-100 mt-3">Go Back</a>
            <?php else: ?>
                <div class="table-responsive">
                    <table class="table table-borderless">
                        <tbody>
                            <tr>
                                <td class="text-muted">Quantity:</td>
                                <td class="text-end fw-bold"><?php echo htmlspecialchars($quantity); ?></td>
                            </tr>
                            <tr>
                                <td class="text-muted">Unit Price:</td>
                                <td class="text-end fw-bold">$<?php echo htmlspecialchars(number_format($price, 2)); ?></td>
                            </tr>
                            <hr>
                            <tr>
                                <td class="text-muted">Subtotal:</td>
                                <td class="text-end fw-bold">$<?php echo htmlspecialchars($formatted_subtotal); ?></td>
                            </tr>
                            <tr>
                                <td class="text-muted">Sales Tax (<?php echo (TAXRATE * 100); ?>%):</td>
                                <td class="text-end fw-bold">$<?php echo htmlspecialchars($formatted_tax); ?></td>
                            </tr>
                            <tr class="table-group-divider">
                                <td class="fw-bold text-dark fs-5">Total Cost:</td>
                                <td class="text-end fw-bold text-danger fs-5">$<?php echo htmlspecialchars($formatted_total); ?></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <a href="Form-enhanced.php" class="btn btn-danger w-100 mt-4">New Calculation</a>
            <?php endif; ?>
        </div>
    </div>
</body>
</html>
