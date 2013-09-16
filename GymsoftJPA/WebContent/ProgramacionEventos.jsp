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
<title>Consulta Programacion de Eventos</title>
</head>
<body>
	<%
		SedeDAOImpl sede = new SedeDAOImpl();
		List<Sede> sedes = new ArrayList<Sede>();
		sedes = sede.findAll();
	%>

	<form name="formProgramacionEventos" method="post"
		action="ProgramacionEventos">
		<table border="1">
			<thead>
				<tr>
					<th colspan="2">CONSULTA DE ACTIVIDADES POR SEDE</th>
				</tr>
				<tr>
					<th>SEDE DE ACTIVIDAD</th>
				</tr>
			</thead>
			<tr>
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
			</tr>
			<tr>
				<td colspan="5" align="center"><input type="submit"
					value="CONSULTAR"></td>
			</tr>
		</table>
	</form>
</body>
</html>
