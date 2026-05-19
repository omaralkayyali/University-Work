<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <?php
    include('shared/links.php');
    ?>

</head>

<body>
    <div class="container text-center">
        <div class="row">
            <div class="col border border-success" style="height:75px">
                <?php 
                include('shared/nav.php');
                ?>
            </div>
        </div>
        <div class="row">
            <div class="col border border-success" style="height:450px">
               <h2>About US</h2>
            </div>
        </div>
        <div class="row">
            <div class="col border border-success" style="height:75px">
            <?php    
            require_once('shared/footer.php');
            ?>
            </div>
        </div>
    </div>
    </div>
</body>

</html>