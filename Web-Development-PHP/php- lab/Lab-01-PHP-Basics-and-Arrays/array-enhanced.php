<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Interactive PHP Arrays Lab</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f4f6f9; }
        .card-header-gradient {
            background: linear-gradient(135deg, #0d6efd, #0b5ed7);
            color: white;
        }
    </style>
</head>
<body class="py-5">
    <div class="container">
        <header class="text-center mb-5">
            <span class="badge bg-primary-subtle text-primary mb-2">Lab 01 Demonstration</span>
            <h1 class="fw-bold">PHP Array Architecture & Operations</h1>
            <p class="text-muted">A structured presentation of numeric, associative, and multidimensional arrays.</p>
        </header>

        <div class="row g-4">
            <!-- 1. Numeric Arrays and Range -->
            <div class="col-md-6">
                <div class="card h-100 shadow-sm border-0">
                    <div class="card-header card-header-gradient py-3">
                        <h5 class="card-title mb-0 fw-bold">Numeric Arrays & Range</h5>
                    </div>
                    <div class="card-body">
                        <p class="text-muted">Creating numeric arrays manually or using the <code>range()</code> function.</p>
                        
                        <?php
                        $names = [2 => 'Ali', 'Ahmad', 'Heba'];
                        $ten = range(10, 1);
                        $alphabet = range('a', 'e');
                        ?>
                        
                        <h6 class="fw-bold">Index Offset Assignment (Ali, Ahmad, Heba):</h6>
                        <pre class="bg-light p-3 rounded"><code><?php print_r($names); ?></code></pre>

                        <h6 class="fw-bold">Range Generated (10 to 1):</h6>
                        <span class="badge bg-secondary me-1"><?php echo implode('</span><span class="badge bg-secondary me-1">', $ten); ?></span>

                        <h6 class="fw-bold mt-3">Alphabet Range (a to e):</h6>
                        <span class="badge bg-success me-1"><?php echo implode('</span><span class="badge bg-success me-1">', $alphabet); ?></span>
                    </div>
                </div>
            </div>

            <!-- 2. Associative Arrays -->
            <div class="col-md-6">
                <div class="card h-100 shadow-sm border-0">
                    <div class="card-header card-header-gradient py-3">
                        <h5 class="card-title mb-0 fw-bold">Associative Arrays</h5>
                    </div>
                    <div class="card-body">
                        <p class="text-muted">Key-value mappings where keys are strings (e.g. state abbreviation to state name).</p>
                        
                        <?php
                        $states_Jo = ["AM" => "Amman", "IR" => "Irbid", "AQ" => "Aqaba"];
                        ?>

                        <h6 class="fw-bold">Jordan Governorate Keys:</h6>
                        <pre class="bg-light p-3 rounded"><code><?php print_r($states_Jo); ?></code></pre>
                        
                        <div class="alert alert-info">
                            <strong>Key Lookup Example:</strong> Value for key <code>AM</code> is: 
                            <span class="fw-bold"><?php echo htmlspecialchars($states_Jo['AM']); ?></span>
                        </div>
                    </div>
                </div>
            </div>

            <!-- 3. Multidimensional Arrays -->
            <div class="col-md-6">
                <div class="card h-100 shadow-sm border-0">
                    <div class="card-header card-header-gradient py-3">
                        <h5 class="card-title mb-0 fw-bold">Multidimensional Arrays & Size</h5>
                    </div>
                    <div class="card-body">
                        <p class="text-muted">Arrays inside arrays to represent nested relational models.</p>
                        
                        <?php
                        $states_KSA = ["Makkah", "Medina", "Riyadh"];
                        $countries = ["Jo" => $states_Jo, "KSA" => $states_KSA];
                        ?>

                        <h6 class="fw-bold">Nested Country Database (Jordan + KSA):</h6>
                        <pre class="bg-light p-3 rounded" style="font-size: 0.85rem;"><code><?php print_r($countries); ?></code></pre>

                        <h6 class="fw-bold">Array Counting:</h6>
                        <ul>
                            <li>Size of Names Array: <strong><?php echo count($names); ?></strong></li>
                            <li>Nested element (KSA, index 2): <strong><?php echo htmlspecialchars($countries['KSA'][2]); ?></strong></li>
                        </ul>
                    </div>
                </div>
            </div>

            <!-- 4. Select Dropdown Generation & Deletion -->
            <div class="col-md-6">
                <div class="card h-100 shadow-sm border-0">
                    <div class="card-header card-header-gradient py-3">
                        <h5 class="card-title mb-0 fw-bold">Dynamic Controls & Cleanup</h5>
                    </div>
                    <div class="card-body">
                        <p class="text-muted">Using loops to generate form controls, and managing memory using <code>unset()</code>.</p>
                        
                        <h6 class="fw-bold mb-2">Dynamic Select Option Generation (Days 1-31):</h6>
                        <div class="mb-4">
                            <select class="form-select w-50">
                                <?php
                                $days = range(1, 31);
                                foreach ($days as $day) {
                                    echo "<option value='$day'>Day $day</option>";
                                }
                                ?>
                            </select>
                        </div>

                        <h6 class="fw-bold">Array Memory Deletion Example:</h6>
                        <?php
                        $temp = [1, 2, 3];
                        unset($temp[1]); // removes element at index 1
                        ?>
                        <p>After unsetting index 1 (originally <code>[1, 2, 3]</code>):</p>
                        <pre class="bg-light p-2 rounded"><code><?php print_r($temp); ?></code></pre>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
