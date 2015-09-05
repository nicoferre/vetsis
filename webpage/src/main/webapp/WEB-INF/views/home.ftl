<!DOCTYPE html>
<html>
<head>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="resources/css/fixes.css">
	<link rel="stylesheet" href="resources/css/dropownVerticalMenuStyle.css">
	<link rel="stylesheet" href="resources/css/dropdownStyle.css">
	<link rel="stylesheet" href="resources/css/animate.min.css">
	<link rel="stylesheet" href="resources/css/buttonMenuStyle.css">
	<link rel="stylesheet" href="resources/css/temaClaroStyle.css">
	<link rel="stylesheet" href="resources/css/inputSearchDesignStyle3.css">
	<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>
</head>
<body>
<body>
    <nav class="containerMenu">
        <div class="container">
            <row>
<!--            <div class="row">-->
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 navbar-left">
                    <div class="menu-icon" id="menu-icon"><div class="center-line"></div></div>
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
<div class="page-shader"></div>
<a href="logout">Cerrar</a>
</body>
<script src="resources/js/jquery.js"></script>
<script src="resources/js/dropownVerticalMenu.js"></script>
<script src="resources/js/temaClaro.js"></script>

<script type="text/javascript">
        <!-- Animacion DropDown User-->
            function DropDown(el) {
                this.dd = el;
                this.initEvents();
            }
        DropDown.prototype = {
            initEvents : function() {
                var obj = this;
                obj.dd.on('click', function(event){
                    $(this).toggleClass('active');
                    event.stopPropagation();
                });	
            }
        }
        <!-- /Animacion DropDown User-->

        <!-- Animacion DropDown Notificaciones-->
            function DropDown(el) {
                this.dropdownNotifications = el;
                this.initEvents();
            }
        DropDown.prototype = {
            initEvents : function() {
                var obj = this;
                obj.dropdownNotifications.on('click', function(event){
                    $(this).toggleClass('active');
                    event.stopPropagation();
                });	
            }
        }
        <!-- /Animacion DropDown Notificaciones-->

        <!-- DropDown User-->
            $(function() {
                var dd = new DropDown( $('#dd') );
                $(document).click(function() {
                    // all dropdowns
                    $('.wrapper-dropdown-5').removeClass('active');
                });
            });
        <!-- /DropDown User-->

        <!-- DropDown Notificaciones-->
            $(function() {
                var dropdownNotifications = new DropDown( $('#dropdownNotifications') );
                $(document).click(function() {
                    // all dropdowns
                    $('.wrapper-dropdown-notifications').removeClass('active');
                });
            });
        <!-- /DropDown Notificaciones -->

    </script>

<html>