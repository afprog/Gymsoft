<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
<script>
$(function () {
	$.datepicker.setDefaults($.datepicker.regional["es"]);
		$("#datepicker").datepicker({
		firstDay: 1
		});
});
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario GymSoft</title>
</head>
<body>
<form action="RegistroUsuario" method="post">

	Nombre :<input type="text" name="nombre" /><br>
	Fecha de Nacimiento :<input type="text" id="datepicker" name="fecha"/><br>
	Estatura :<input type="text" name="estatura" /><br>
	Genero :<input type="text" name="genero" /><br>
	
	<input type="submit" value="Registrar"/>

</form>

</body>
</html>