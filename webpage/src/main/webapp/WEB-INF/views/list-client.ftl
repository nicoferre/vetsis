<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,400italic,300' rel='stylesheet' type='text/css'>


<link rel="stylesheet" href="resources/css/jquery.dataTables.min.css">

<h3>Listado de clientes</h3>

<table id="list-client" class="display" cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
		</tr>
	</thead>
	<tbody>
		<#list clients as client>
			<tr>
				<th>${client.firstname}</th>
				<th>${client.lastname}</th>
			</tr>
		</#list>
	</tbody>
</table>


<form name="inicio" method="POST" action="home">
<input type="submit" value="Inicio">
</form>

<script src="resources/js/jquery.js"></script>
<script src="resources/js/jquery.dataTables.min.js"></script>


<script type="text/javascript">

$(document).ready(function() {
    $('#list-client').DataTable( {
        "language": {
            "lengthMenu": "Mostrar _MENU_ por p&aacute;gina",
            "zeroRecords": "No recupera registros.",
            "info": "_PAGE_ de _PAGES_",
            "infoEmpty": "",
            "infoFiltered": "",
            "sSearch": "Buscar",
            "paginate": {
	     		"sFirst": "Primero",
	            "sLast": "&Uacute;ltimo",
	            "sNext": "Pr&oacute;ximo",
	            "sPrevious": "Previo"
    		}
        }
    } );
} );
</script>