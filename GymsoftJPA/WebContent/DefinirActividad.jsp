<%@page
	import="co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.daos.SedeDAOImpl"%>
<%@page
	import="co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.model.Sede"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.model.Usuario"%>
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

		UsuarioDAOImpl usrDaoImpl = new UsuarioDAOImpl();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = usrDaoImpl.findAll();
	%>

	<form name="formCreacionActividades" method="post"
		action="CreacionActividades">
		<table border="1">
			<thead>
				<tr>
					<th colspan="6">CREACION DE ACTIVIDADES</th>
				</tr>
				<tr>
					<th>Tipo de Actividad</th>
					<th>¿ Cuando ? (Fecha y Hora)</th>
					<th>Donde ?</th>
					<th>Lugar Encuentro</th>
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
				<td><input type="datetime-local" name="fecha"></td>
				<td><select name="sedeSelect">
						<%
							for (Sede sd : sedes) {
						%>
						<option value="<%out.print(sd.getIdSedes());%>">
							<%
								out.print(sd.getNombre() + " ------- " + sd.getDireccion());
							%>
						</option>
						<%
							}
						%>
				</select></td>
				<td><select name="lugarFisicoSelect">
						<option value="SALA DE BAILE">SALA DE BAILE</option>
						<option value="SALA DE AEROBICOS">SALA DE AEROBICOS</option>
						<option value="ESPACIO DE PILATES">ESPACIO DE PILATES</option>
						<option value="CAFETERIA">CAFETERIA</option>
				</select></td>
				<td>
					<fieldset>
						<legend>Quienes asistiran ?</legend>
						<%
							int limit = 1;
							for (Usuario usr : usuarios) {
								if (limit > 2) {
									limit = 1;
						%><br />
						<%
							}
						%>
						<input type="checkbox" name="usuarios"
							value="<%out.print(usr.getIdUsuario());%>" />
						<%
							out.print(usr.getNombre());
								limit++;
							}
						%>

					</fieldset>
				</td>
			</tr>
			<tr>
				<td colspan="6" align="center"><input type="submit"
					value="REGISTRAR"></td>
			</tr>
		</table>
	</form>
</body>
</html>


</body>
</html>