<!DOCTYPE html>
<html lang="en" class="h-100">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lab-02: Page Templating (Contact Us)</title>
    <?php include('shared/links-enhanced.php'); ?>
</head>
<body class="d-flex flex-column h-100">
    <?php include('shared/nav-enhanced.php'); ?>

    <main class="flex-shrink-0 my-auto py-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6 text-center">
                    <span class="badge bg-primary-subtle text-primary mb-3 px-3 py-2 fw-semibold">Contact Us</span>
                    <h1 class="fw-bold mb-4">Get In Touch</h1>
                    <div class="card card-premium p-4 text-start">
                        <form action="#" method="POST">
                            <div class="mb-3">
                                <label for="name" class="form-label">Full Name</label>
                                <input type="text" class="form-control" id="name" placeholder="John Doe">
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Email Address</label>
                                <input type="email" class="form-control" id="email" placeholder="john@example.com">
                            </div>
                            <div class="mb-3">
                                <label for="message" class="form-label">Message</label>
                                <textarea class="form-control" id="message" rows="4" placeholder="Your message here..."></textarea>
                            </div>
                            <button type="submit" class="btn btn-premium w-100">Submit Message</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <?php include('shared/footer-enhanced.php'); ?>
</body>
</html>
