<form name="new-client" action="new-client" method="POST">
<div style="width: 50%;">
<div class="input-group form-group">
  <input type="text" name="firstname"  class="form-control" placeholder="Nombre" aria-describedby="sizing-addon2" required>
  <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
</div>

<div class="input-group form-group">
  <input type="text" name="lastname"  class="form-control" placeholder="Apellido" aria-describedby="sizing-addon2"required>
  <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
</div>

<div class="input-group form-group">
  <input type="text" name="doc"  class="form-control" placeholder="Documento" aria-describedby="sizing-addon2"required>
  <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
</div>

<div class="input-group form-group">
  <input type="email" name="mail"  class="form-control" placeholder="Casilla de correo" aria-describedby="sizing-addon2"required>
  <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
</div>

<div class="input-group form-group">
  <input type="tel" name="phone"  class="form-control" placeholder="Telefono" aria-describedby="sizing-addon2"required>
  <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
</div>


<select name="genderView" class="btn-group bootstrap-select" title="G&eacute;nero">
	<option value="0">Mujer</option>
	<option value="1">Hombre</option>
</select>


</div>
</br></br>
<input type="submit" value="Aceptar" />

</form>