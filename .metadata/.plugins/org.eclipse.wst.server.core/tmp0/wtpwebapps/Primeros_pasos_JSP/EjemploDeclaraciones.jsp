<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 230: Ejemplo declaraciones</title>
</head>
<body>
	<h1 style="text-align:center">Ejemplo Declaraciones</h1>
	
	<%!
		private int resultado;
		public int metodoSuma(int num1,int num2){
			resultado = num1 + num2;
			return resultado;
		}
		public int metodoResta(int num1,int num2){
			resultado = num1 - num2;
			return resultado;
		}
		public int metodoMultiplica(int num1,int num2){
			resultado = num1 * num2;
			return resultado;
		}
	%>
	
	El resultado de la suma es: <%= metodoSuma(7,5) %>
	<br>
	El resultado de la resta es: <%= metodoResta(7,5) %>
	<br>
	El resultado de la multiplicación es: <%= metodoMultiplica(7,5) %>
</body>
</html>