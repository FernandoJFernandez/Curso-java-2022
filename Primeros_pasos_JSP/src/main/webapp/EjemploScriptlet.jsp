<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 230: Ejemplo de Scriptlet</title>
</head>
<body>
	<h1>Ejemplo de Scriptlet</h1>
	<%
		for(int i=0; i<10;i++){

			out.println("<br>Este es el mensaje " + i);
		}
	%>
</body>
</html>