<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 232: Ejemplo objetos predefinidos JSP</title>
</head>
<body>
	<h1>Objetos predefinidos JSP</h1>
	
	Petición de datos del navegador: <%= request.getHeader("User-Agent") %> 
	<br/><br/>
	Petición de idioma utilizado: <%= request.getLocale() %>
</body>
</html>