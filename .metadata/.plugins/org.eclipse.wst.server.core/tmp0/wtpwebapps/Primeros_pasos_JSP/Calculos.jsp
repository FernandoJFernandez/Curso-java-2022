<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="pildorasinformaticas.com.CalculosMatematicos.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 231: Llamada a los métodos de Cálculos</title>
</head>
<body>
	<h1>Llamada a los métodos de Cálculos</h1>
	
	El resultado de la suma es: <%= Calculos.metodoSuma(5, 7) %>
	<br>
	El resultado de la suma es: <%= Calculos.metodoResta(5,7) %>
	<br>
	El resultado de la suma es: <%= Calculos.metodoMultiplica(5,7) %>
</body>
</html>