<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 233: Formulario de registro</title>
</head>
<body>
	<h2>Usuarios Registrados</h2>
	Usuario confirmado:<br/><br/>
	Nombre: <%= request.getParameter("nombre") %> &nbsp; 
	Apellido: <%= request.getParameter("apellido") %> 
	<br/><br/>
	<jsp:include page="Fecha.jsp"></jsp:include>
</body>
</html>