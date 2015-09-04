<!DOCTYPE html>
<html>

<head>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="resources/css/fixes.css">
	<link rel="stylesheet" href="resources/css/dropownVerticalMenuStyle.css">
	<link rel="stylesheet" href="resources/css/dropdownStyle.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/buttonMenuStyle.css">
	<link rel="stylesheet" href="css/temaClaroStyle.css">
	<link rel="stylesheet" href="css/temaClaroStyle.css">
	<link rel="stylesheet" href="css/inputSearchDesignStyle3.css">

	<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>

</head>

<body>

<p>Hola ${user.username}</p>
<body>
    <nav class="containerMenu">
        <div class="container">
            <row>
<!--            <div class="row">-->
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 navbar-left">
                    <div class="menu-icon" id="menu-icon"><div class="center-line"></div></div>
                </div>
                <div class="col-lg-10 col-md-10 col-sm-10 col-xs-10 navbar-right">
                
                    <ul class="nav navbar-nav navbar-right off-right">
                        <li class="hidden-xs">				
                            <div class="search">
                                <input type="text" name="Search" class="input transition colorPlaceHolder" placeholder="Ingresá el texto...">
                                <input type="submit" name="Submit" class="submit" value="Search">
                            </div>
                        </li>

                        <li class="hidden-xs">
                            <a href="javascript:;" class="marginTopUserAndNotification marginLeftAndRightUser">
                                ( 3517025293 )
                            </a>
                        </li>

                        <li class="notifications dropdown hidden-xs notificaciones">
                            <div id="dropdownNotifications" class="wrapper-dropdown-notifications campana marginTopUserAndNotification marginTopNotification" tabindex="1">

                                <i class="fa fa-bell"></i>
                                <div class="badge badge-top bg-danger animated flash notificacion-numero">3</div>

                                <ul class="dropdown">
                                    <div class="panel-heading no-radius">
                                        <small>
                                            <b>Notificaciones</b>
                                        </small>
                                        <small class="pull-right">
                                            <a href="#" class="mg-r-xs">marcar como leídas</a>&#8226;
                                            <a href="#" class="fa fa-cog mg-l-xs"></a>
                                        </small>
                                    </div>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-info-circle margin-icon"></i>
                                            <span>Su factura N° 3426 ya se encuentra disponible.</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-info-circle margin-icon"></i>
                                            <span>Tenes 250 puntos disponibles.</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-info-circle margin-icon"></i>
                                            <span>Recargando $50 ó más duplicas tu saldo.</span>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#" class="textAlignCenter">
                                            Ver todas las Notificaciones
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="quickmenu">
                            <div id="dd" class="wrapper-dropdown-5" tabindex="1">
                                <object data="img/avatar00.svg" type="image/svg+xml" class="avatar pull-left img-circle avatarStyle" title="user"></object>
                                <i class="caret mg-l-xs hidden-xs no-margin"></i>
                                <ul class="dropdown">
                                    <li>
                                        <a href="#">
                                            alguien@gmail.com
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            Configuración
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            Notificaciones
                                            <div class="badge bg-danger animated pull-right numero-notif-int">3</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            Ayuda
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">
                                            Cerrar Sesión
                                        </a>
                                    </li>
                                </ul>
                            </div>

                        </li>
                    </ul>
                    
                </div>
<!--            </div>-->
            </row>
        </div>
    <div class="main-menu-container">
        <section id="vert-nav">
            <nav role='navigation'>
                <ul class="topmenu">
                    <li><a href="#"><i class="fa fa-home"></i>Inicio</a></li>
                    <li><a href="#"><i class="fa fa-comment-o"></i>Consultas</a>
                        <ul class="submenu">
                            <li> <a href="new-client-form">Nuevo cliente<a></br></br></li>
                            <li> <a href="update-client-form">Modificar cliente<a></br></br></li>
                            <li> <a href="list-client">Listado de clientes<a></br></br></li>
                        </ul>
                    </li>
                </ul>
            </nav>  
        </section>
    </div>
  </nav>

<a href="logout">Cerrar</a>
<script src="resources/js/dropownVerticalMenu.js"></script>
<script src="resources/js/inputSearchDesignIndex.js"></script>
<script src="resources/js/dropownVerticalMenu.js"></script>
</body>