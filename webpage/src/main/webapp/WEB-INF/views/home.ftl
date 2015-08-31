<p>Hola ${user.username}</p>

<#if user.isAdmin()>
<a href="new-client-form">Nuevo cliente<a></br></br>
<a href="update-client-form">Modificar cliente<a></br></br>
<a href="list-client">Listado de clientes<a></br></br>
</#if>


<a href="logout">Cerrar</a>