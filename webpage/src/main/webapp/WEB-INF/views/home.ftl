<!DOCTYPE html>
<html>
	<head>
		<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,300' rel='stylesheet' type='text/css' />
		<link rel="stylesheet" href="resources/css/font-awesome.css" />
		<link rel="stylesheet" href="resources/css/tema-style.css" />
		<link rel="stylesheet" href="resources/css/metisMenu.min.css" />
		<link rel="stylesheet" href="resources/css/metisMenuStyle.css" />
		<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>
	</head>
	<body>
		<nav class="containerMenu">
			<div class="container">
				<row>
					<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 navbar-left">
						<div class="menu-icon" id="menu-icon">
							<div class="center-line"></div>
						</div>
					</div>
				</row>
			</div>
			<div class="main-menu-container">
				<section id="vert-nav">
					<nav class="sidebar-nav menu-color">
						<ul class="metismenu" id="menu">
							<li class="active">
								<a href="#" aria-expanded="true">Inicio</a>
							</li>
							<li class="">
								<a href="#" aria-expanded="false">
								Clientes
								<span class="glyphicon arrow">
								</span>
								</a>
								<ul aria-expanded="false" class="collapse" style="height: 0px;">
									<li><a href="new-client-form">Nuevo cliente</a></li>
									<li><a href="update-client-form">Modificar cliente</a></li>
									<li><a href="list-client">Listado de clientes</a></li>
								</ul>
							</li>
							<li class="active">
								<a href="logout">Salir</a>
							</li>
						</ul>
					</nav>
				</section>
			</div>
		</nav>
		<div class="page-shader">
			VBI-<#include "${vista}">
		</div>
		<script src="resources/js/jquery.min.js"></script>
		<!--			<script src="resources/js/dropownVerticalMenu.js"></script>-->
		<script src="resources/js/tema-style.js"></script>
		<!--			<script src="resources/js/waves.min.js"></script>-->
		<script src="resources/js/metisMenu.min.js"></script>
		<script type="text/javascript">
			$("#menu").metisMenu({
			  toggle: false
			});
		</script>
	</body>
	<html>