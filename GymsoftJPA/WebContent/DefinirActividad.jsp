<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.daos.SedeDAOImpl"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.model.Sede"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creacion de Actividades</title>
</head>
<body>
	<%
		SedeDAOImpl sede = new SedeDAOImpl();
		List<Sede> sedes = new ArrayList<Sede>();
		sedes = sede.findAll();
	%>

	<form name="formCreacionActividades" method="post"
		action="CreacionActividades">
		<table border="1">
			<thead>
				<tr>
					<th colspan="5">CREACION DE ACTIVIDADES</th>
				</tr>
				<tr>
					<th>Tipo de Actividad:</th>
					<th>Hora programada:</th>
					<th>Fecha:</th>
					<th>Sede:</th>
					<th>Grupo de Asistentes</th>
				</tr>
			</thead>
			<tr>
				<td><select name="actividadSelect">
						<option value="CHARLA">CHARLAS</option>
						<option value="FORO">FORO</option>
						<option value="PROYECCION DE PELICULA">PROYECCION DE
							PELICULA</option>
						<option value="CAPACITACION">CAPACITACION</option>
						<option value="INTEGRACION">INTEGRACION</option>
				</select></td>
				<td><input type="time" name="hora"></td>
				<td><input type="date" name="fecha"></td>
				<td><select name="maquinaSelect">
						<%
							for (Sede sd : sedes) {
						%>
						<option value="<%out.print(sd.getIdSedes());%>">
							<%
								out.print(sd.getNombre()+ " ------- " + sd.getDireccion());
							%>
						</option>
						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<td colspan="5" align="center"><input type="submit"
					value="REGISTRAR"></td>
			</tr>
		</table>
	</form>
</body>
</html>


</body>
</html>