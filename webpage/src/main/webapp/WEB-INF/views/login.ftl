<!DOCTYPE html>
<html>

<head>



<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/fixes.css">

<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>

</head>

<body>

<div class="box">
	<form class="form-horizontal" role="form" action="login" method="POST">
			<h1 id="logintoregister">El Coyote</h1>
    		<div class="group">      
    			<input type="text" class="inputMaterial" id="userName" name="userName" required>
    			<span class="highlight"></span>
    			<span class="bar"></span>
    			<label>Usuario</label>
    		</div>
			<div class="group">      
    			<input class="inputMaterial" type="password" id="password" name="password"  required>
 				<span class="highlight"></span>
   				<span class="bar"></span>
   				<label>Clave</label>
      		</div>
  			<button id="buttonlogintoregister">Ingresar</button>
	</form>
</div>

<script src="resources/bootstrap/js/bootstrap.min.js"></script>

</body>

</html>