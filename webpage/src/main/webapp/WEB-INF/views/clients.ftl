<!--BEGIN TITLE & BREADCRUMB PAGE-->
	<div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
    	<div class="page-header pull-left">
        	<div class="page-title">
            	Clientes
            </div>
        </div>
        <ol class="breadcrumb page-breadcrumb pull-right">
        	<li><i class="fa fa-home"></i>&nbsp;<a href="home">Inicio</a>&nbsp;&nbsp;<i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
            <li class="hidden"><a href="#">Clientes</a>&nbsp;&nbsp;<i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
            <li class="active">Clientes</li>
		</ol>
        <div class="clearfix">
        </div>
	</div>
<!--END TITLE & BREADCRUMB PAGE-->
<div class="well">
	<div class="tabbable">
		<ul class="nav nav-tabs">
			<li class="active"><a href="#tab1" data-toggle="tab">Alta</a></li>
			<li><a href="#tab2" data-toggle="tab">Listado de Clientes</a></li>
			<li><a href="#tab3" data-toggle="tab">Modificaci&oacute;n</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane active" id="tab1">
				<#include "*/new-client.ftl">
			</div>
			<div class="tab-pane" id="tab2">
			</div>
			<div class="tab-pane" id="tab3">
			</div>
		</div>
	</div>
</div>