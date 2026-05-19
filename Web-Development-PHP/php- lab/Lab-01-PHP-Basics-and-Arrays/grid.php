<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</head>
<body class="container">

<nav class="navbar  navbar-expand-lg  ">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Image</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#">Contact US</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
            <li><a class="dropdown-item" href="facebook.com">facebook</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>







<div class="row">
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">1</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">2</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">3</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">4</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">5</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">6</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">7</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">8</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">9</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">10</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">11</div>
    <div class="col border col-xl-2 col-xxl-1 col-lg-4 col-sm-6 col-xs-12 border-success">12</div>
</div>

<div class="row">
    <div class="col border col-lg-4  border-success"><div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div></div>
    <div class="col border  col-lg-4  border-success"><div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div></div>
    <div class="col border  col-lg-4  border-success"><div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div></div>
   
</div>
    


<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>