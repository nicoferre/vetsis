<!DOCTYPE html>
<html lang="en">
<head>
	<title>Vet-SIS | Sistema Integral de Gesti&oacute;n</title>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="resources/images/icons/favicon.ico">
    <link rel="apple-touch-icon" href="resources/images/icons/favicon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="resources/images/icons/favicon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="resources/images/icons/favicon-114x114.png">
    <!--Loading bootstrap css-->
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
    <link type="text/css" rel="stylesheet" href="resources/css/jquery-ui-1.10.4.custom.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/font-awesome.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/animate.css">
    <link type="text/css" rel="stylesheet" href="resources/css/all.css">
    <link type="text/css" rel="stylesheet" href="resources/css/main.css">
    <link type="text/css" rel="stylesheet" href="resources/css/style-responsive.css">
    <link type="text/css" rel="stylesheet" href="resources/css/zabuto_calendar.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/pace.css">
    <link type="text/css" rel="stylesheet" href="resources/css/jquery.news-ticker.css">
    <link type="text/css" rel="stylesheet" href="resources/css/tabdrop.css">
    <link type="text/css" rel="stylesheet" href="resources/css/tabdrop.less">
</head>
<body>
<div>
        <!--BEGIN BACK TO TOP-->
        <a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
        <!--END BACK TO TOP-->
        <!--BEGIN TOPBAR-->
        <div id="header-topbar-option-demo" class="page-header-topbar">
            <nav id="topbar" role="navigation" style="margin-bottom: 0;" data-step="3" class="navbar navbar-default navbar-static-top">
            <div class="navbar-header">
                <button type="button" data-toggle="collapse" data-target=".sidebar-collapse" class="navbar-toggle"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                <a id="logo" href="index.html" class="navbar-brand"><span class="fa fa-rocket"></span><span class="logo-text">KAdmin</span><span style="display: none" class="logo-text-icon">µ</span></a></div>
            <div class="topbar-main"><a id="menu-toggle" href="#" class="hidden-xs"><i class="fa fa-bars"></i></a>
                
                <form id="topbar-search" action="" method="" class="hidden-sm hidden-xs">
                    <div class="input-icon right text-white"><a href="#"><i class="fa fa-search"></i></a><input type="text" placeholder="Search here..." class="form-control text-white"/></div>
                </form>
                <div>
                </div>
                <ul class="nav navbar navbar-top-links navbar-right mbn">
                    <li class="dropdown topbar-user"><a data-hover="dropdown" href="#" class="dropdown-toggle"><img src="resources/images/avatar/48.jpg" alt="" class="img-responsive img-circle"/>&nbsp;<span class="hidden-xs">${user.username}</span>&nbsp;<span class="caret"></span></a>
                        <ul class="dropdown-menu dropdown-user pull-right">
                            <li><a href="#"><i class="fa fa-tasks"></i>Mis tareas<span class="badge badge-success">7</span></a></li>
                            <li class="divider"></li>
                            <li><a href="logout"><i class="fa fa-key"></i>Cerrar sesi&oacute;n</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
            <!--BEGIN MODAL CONFIG PORTLET-->
            <div id="modal-config" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" data-dismiss="modal" aria-hidden="true" class="close">
                                &times;</button>
                            <h4 class="modal-title">
                                Modal title</h4>
                        </div>
                        <div class="modal-body">
                        </div>
                        <div class="modal-footer">
                            <button type="button" data-dismiss="modal" class="btn btn-default">
                                Close</button>
                            <button type="button" class="btn btn-primary">
                                Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--END MODAL CONFIG PORTLET-->
        </div>
        <!--END TOPBAR-->
        <div id="wrapper">
            <!--BEGIN SIDEBAR MENU-->
            <nav id="sidebar" role="navigation" data-step="2" data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;"
                data-position="right" class="navbar-default navbar-static-side">
            <div class="sidebar-collapse menu-scroll">
                <ul id="side-menu" class="nav">
                    
                     <div class="clearfix"></div>
                    <li class="active"><a href="home"><i class="fa fa-tachometer fa-fw">
                        <div class="icon-bg bg-orange"></div>
                    </i><span class="menu-title">Inicio</span></a></li>
                    <li><a href="clients"><i class="fa fa-desktop fa-fw">
                        <div class="icon-bg bg-pink"></div>
                    </i><span class="menu-title">Clientes</span></a>
                       
                    </li>
                    <li><a href="UIElements.html"><i class="fa fa-send-o fa-fw">
                        <div class="icon-bg bg-green"></div>
                    </i><span class="menu-title">UI Elements</span></a>
                       
                    </li>
                    <li><a href="Forms.html"><i class="fa fa-edit fa-fw">
                        <div class="icon-bg bg-violet"></div>
                    </i><span class="menu-title">Forms</span></a>
                      
                    </li>
                    <li><a href="Tables.html"><i class="fa fa-th-list fa-fw">
                        <div class="icon-bg bg-blue"></div>
                    </i><span class="menu-title">Tables</span></a>
                          
                    </li>
                    <li><a href="DataGrid.html"><i class="fa fa-database fa-fw">
                        <div class="icon-bg bg-red"></div>
                    </i><span class="menu-title">Data Grids</span></a>
                      
                    </li>
                    <li><a href="Pages.html"><i class="fa fa-file-o fa-fw">
                        <div class="icon-bg bg-yellow"></div>
                    </i><span class="menu-title">Pages</span></a>
                       
                    </li>
                    <li><a href="Extras.html"><i class="fa fa-gift fa-fw">
                        <div class="icon-bg bg-grey"></div>
                    </i><span class="menu-title">Extras</span></a>
                      
                    </li>
                    <li><a href="Dropdown.html"><i class="fa fa-sitemap fa-fw">
                        <div class="icon-bg bg-dark"></div>
                    </i><span class="menu-title">Multi-Level Dropdown</span></a>
                      
                    </li>
                    <li><a href="Email.html"><i class="fa fa-envelope-o">
                        <div class="icon-bg bg-primary"></div>
                    </i><span class="menu-title">Email</span></a>
                      
                    </li>
                    <li><a href="Charts.html"><i class="fa fa-bar-chart-o fa-fw">
                        <div class="icon-bg bg-orange"></div>
                    </i><span class="menu-title">Charts</span></a>
                       
                    </li>
                    <li><a href="Animation.html"><i class="fa fa-slack fa-fw">
                        <div class="icon-bg bg-green"></div>
                    </i><span class="menu-title">Animations</span></a></li>
                </ul>
            </div>
        </nav>
            <!--END SIDEBAR MENU-->
            <!--BEGIN PAGE WRAPPER-->
            <div id="page-wrapper">
                <!--BEGIN CONTENT-->
                <div class="page-shader">
					<#include "${vista}">
				</div>
                <!--END CONTENT-->
                <!--BEGIN FOOTER-->
                <div id="footer">
                    <div class="copyright">
                        <a href="https://github.com/nicoferre/vetsis">2015 © Vetsis</a></div>
                </div>
                <!--END FOOTER-->
            </div>
            <!--END PAGE WRAPPER-->
        </div>
    </div>
    <script src="resources/js/jquery-1.10.2.min.js"></script>
    <script src="resources/js/jquery-migrate-1.2.1.min.js"></script>
    <script src="resources/js/jquery-ui.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/bootstrap-hover-dropdown.js"></script>
    <script src="resources/js/html5shiv.js"></script>
    <script src="resources/js/respond.min.js"></script>
    <script src="resources/js/jquery.metisMenu.js"></script>
    <script src="resources/js/jquery.slimscroll.js"></script>
    <script src="resources/js/jquery.cookie.js"></script>
    <script src="resources/js/icheck.min.js"></script>
    <script src="resources/js/custom.min.js"></script>
    <script src="resources/js/jquery.news-ticker.js"></script>
    <script src="resources/js/jquery.menu.js"></script>
    <script src="resources/js/pace.min.js"></script>
    <script src="resources/js/holder.js"></script>
    <script src="resources/js/responsive-tabs.js"></script>
    <script src="resources/js/jquery.flot.js"></script>
    <script src="resources/js/jquery.flot.categories.js"></script>
    <script src="resources/js/jquery.flot.pie.js"></script>
    <script src="resources/js/jquery.flot.tooltip.js"></script>
    <script src="resources/js/jquery.flot.resize.js"></script>
    <script src="resources/js/jquery.flot.fillbetween.js"></script>
    <script src="resources/js/jquery.flot.stack.js"></script>
    <script src="resources/js/jquery.flot.spline.js"></script>
    <script src="resources/js/zabuto_calendar.min.js"></script>
    <script src="resources/js/index.js"></script>
    <!--LOADING SCRIPTS FOR CHARTS-->
    <script src="resources/js/highcharts.js"></script>
    <script src="resources/js/data.js"></script>
    <script src="resources/js/drilldown.js"></script>
    <script src="resources/js/exporting.js"></script>
    <script src="resources/js/highcharts-more.js"></script>
    <script src="resources/js/charts-highchart-pie.js"></script>
    <script src="resources/js/charts-highchart-more.js"></script>
    <script src="resources/js/bootstrap-tabdrop.js"></script>
    <!--CORE JAVASCRIPT-->
    <script src="resources/js/main.js"></script>
    <script>        (function (i, s, o, g, r, a, m) {
            i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function () {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
            a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');
        ga('create', 'UA-145464-12', 'auto');
        ga('send', 'pageview');


</script>
</body>
</html>