<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 234-235: Registro</title>
</head>
<body>
	<%@ page import = "java.sql.*" %>
	
	<%
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("contra");
		String pais = request.getParameter("pais");
		String tecno = request.getParameter("tecnologias");
		
		//cargamos el driver para conectar
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			//conexion a BBDD
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp?","root","");
			//creamos un statement
			Statement miStatement = miConexion.createStatement();
			//creamos instruccion sql
			String instruccionSql = "INSERT INTO USUARIOS (Nombre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES ('" + nombre + "','" + apellido + "','" + usuario + "','" + contra + "','" + pais + "','" + tecno + "')";
			//Ejecutamos la sentencia
			miStatement.executeUpdate(instruccionSql);
			
			out.println("Registrado con éxito");
		
		}catch(Exception e){
			out.println("Ha habido un error");
		}
	%>
</body>
</html>