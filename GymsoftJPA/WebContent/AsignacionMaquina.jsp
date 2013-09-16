<%@page import="co.edu.uniminuto.gymsoft.persistence.model.Usuario"%>
<%@page
	import="co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl"%>
<%@page
	import="co.edu.uniminuto.gymsoft.persistence.daos.MaquinaDAOImpl"%>
<%@page import="co.edu.uniminuto.gymsoft.persistence.model.Maquina"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asignacion de Maquinaria</title>
</head>
<body>
	<%
		MaquinaDAOImpl maquina = new MaquinaDAOImpl();
		List<Maquina> maquinas = new ArrayList<Maquina>();
		maquinas = maquina.findAll();

		UsuarioDAOImpl usuario = new UsuarioDAOImpl();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = usuario.findAll();
	%>
	<form name="formAsignacionMaquinaria" method="post"
		action="MaquinaUsuario">
		<table border="1">
			<thead>
				<tr>
					<th colspan="4">ASIGNACION DE MAQUINA A DEPORTISTA</th>
				</tr>
				<tr>
					<th>Deportista:</th>
					<th>Maquina a Asignar:</th>
					<th>Fecha Inicial</th>
					<th>Fecha Final</th>
				</tr>
			</thead>
			<tr>
				<td><select name="usuarioSelect">
						<%
							for (Usuario usr : usuarios) {
						%>
						<option value="<%out.print(usr.getIdUsuario());%>">
							<%
								out.print(usr.getNombre());
							%>
						</option>
						<%
							}
						%>
				</select></td>
				<td><select name="maquinaSelect">
						<%
							for (Maquina mq : maquinas) {
						%>
						<option value="<%out.print(mq.getIdMaquina());%>">
							<%
								out.print(mq.getNombre());
							%>
						</option>
						<%
							}
						%>
				</select></td>
				<td><input type="datetime-local" name="fecha"></td>
				<td><input type="datetime-local" name="horaInicio"></td>
			</tr>
			<tr>
			<td colspan="4" align="center">
			<input type="submit" value="REGISTRAR">
			</td>
			</tr>
		</table>
	</form>
</body>
</html>