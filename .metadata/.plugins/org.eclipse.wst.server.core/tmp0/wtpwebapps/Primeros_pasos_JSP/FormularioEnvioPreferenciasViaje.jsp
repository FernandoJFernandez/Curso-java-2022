<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 239-240: Agencia de Viajes</title>
</head>
<body>
	<form action="recibe_peticion.jsp">
		Selecciona tu ciudad de destino
		<select name="ciudad_favorita">
			<option>Madrid</option>
			<option>París</option>	
			<option>Nueva_York</option>	
			<option>Sidney</option>
		</select>
		<br/><br/><br/>
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>