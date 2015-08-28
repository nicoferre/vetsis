<!DOCTYPE html>
<html>

<head>

<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,300' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">

<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>

</head>

<body>

<div class="container">
  <div class="row">
    <h1 class="text-center">Login</h1>
    <div class="login-wrap">
      <form class="form-horizontal" role="form" action="login" method="POST">
        <div class="form-group">
          <label for="inputEmail3" class="col-sm-3 control-label">
            Nombre de usuario</label>
          <div class="col-sm-9">
            <input type="text" class="form-control" id="userName" name="userName" placeholder="UserName">
          </div>
        </div>
        <div class="form-group">
          <label for="inputPassword3" class="col-sm-3 control-label">
            Clave</label>
          <div class="col-sm-9">
            <input type="password" class="form-control" id="password" name="password" placeholder="Password">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-3 col-sm-9">
            <div class="checkbox">
              <label>
                <input type="checkbox" /> Recordarme
              </label>
            </div>
          </div>
        </div>
        <div class="form-group last">
          <div class="col-sm-offset-3 col-sm-9">
            <button type="submit" class="btn btn-success btn-sm">
              Ingresar</button>
            <button type="reset" class="btn btn-default btn-sm">
              Limpiar</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

<script src="resources/bootstrap/js/bootstrap.min.js"></script>

</body>

</html>