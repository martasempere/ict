<!DOCTYPE html>

<html lang="es">

<head>

    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Marta Sempere - JavaScript</title>
    <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">





   
</head>

<body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="index.html"><h1 style="color:#aaeaaa">Mis prácticas</h1> </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav">
                    <li class="nav-item active">
                      <a class="nav-link" href="2.html">Práctica 2<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                            <a class="nav-link" href="3.html">Práctica 3<span class="sr-only">(current)</span></a>
                    </li>
                  
                    
                  </ul>
                </div>
              </nav>
      <h1 ><span class="badge badge-light text-success align-items-center">MI PRIMERA PRÁCTICA</span></h1>
      <div class="container" style="color:#99dd99">
       <form action="ejemplo.php" method="get">
                <p>What's your name?: <input type="text" name="name" size="40"></p>
                <p>In which year had you born?: <input type="number" name="year" min="1900"></p>
                <p>What are you?:
                  <input type="radio" name="hm" value="h"> Man
                  <input type="radio" name="hm" value="m"> woman
                </p>
                <p>
                  <button onlclick="MyFuntion(" value="Send">
                  <input type="reset" value="Delete">
                </p>
              </form>

      </div>
      <script>
      var name;
      var age;
      </script>
    
</body>
