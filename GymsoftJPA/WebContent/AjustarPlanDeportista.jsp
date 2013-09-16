<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="co.edu.uniminuto.gymsoft.utilitario.Utilitarios" %>
    <%@ page import="co.edu.uniminuto.gymsoft.persistence.model.*" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AjustarPlanDeportista" method="post">
	<h1> Deportistas </h1>
	<select name="deportistas">
		<% List<Usuario> deportistas = Utilitarios.obtenerDeportistas();
		for(int i = 0 ; i < deportistas.size() ; i++){
			int id = deportistas.get(i).getIdUsuario();
		%>
		        <option value="<%= id %>">
		           <%=deportistas.get(i).getNombre()%>
		        </option>
		<% } %>
	</select>
	<h1> Rutinas </h1>
	<select name="rutinas">
		<% List<Rutina> rutinas = Utilitarios.obtenerRutinas();
		for(int i = 0 ; i < rutinas.size() ; i++){
			int id = rutinas.get(i).getIdRutina();
		%>
		        <option value="<%= id %>">
		           <%=rutinas.get(i).getNombre()%>
		        </option>
		<% } %>
	</select>
	<input type="submit" value="Asignar	"/>
</form>
</body>
</html>