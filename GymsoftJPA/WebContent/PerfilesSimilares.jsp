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
<title>Consulta de Perfiles Similares</title>
</head>
<body>
	<%
		SedeDAOImpl sede = new SedeDAOImpl();
		List<Sede> sedes = new ArrayList<Sede>();
		sedes = sede.findAll();
	%>

	<form name="formPerfilesSimilares" method="post"
		action="PerfilesSimilares">
		<table border="1">
			<thead>
				<tr>
					<th colspan="5">CONSULTA DE PERFILES POR PARÁMETRO.</th>
				</tr>
				<tr>
					<th>Parametro de Busqueda</th>
					<th>Patron</th>
				</tr>
			</thead>
			<tr>
				<td><select name="parametroSelect">
						<option value="ALTURA">ALTURA</option>
						<option value="PESO">PESO</option>
						<option value="EDAD">EDAD</option>
				</select></td>
				<td><input type="text" name="parametro"></td>
			</tr>
			<tr>
				<td colspan="5" align="center"><input type="submit"
					value="CONSULTAR"></td>
			</tr>
		</table>
	</form>
</body>
</html>
