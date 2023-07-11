<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 236: Formulario de Login</title>
</head>
<body>
	<%@ page import = "java.sql.*" %>
	
	<%
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("contra");
		
		//cargamos el driver para conectar
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			//conexion a BBDD
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp?","root","");

			PreparedStatement c_preparada = miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=? AND CONTRASENA=?"); 
			
			c_preparada.setString(1, usuario);
			c_preparada.setString(2, contra);
			ResultSet miResultset = c_preparada.executeQuery();
			
	         if(miResultset.next()) {
	        	 do {
	        		 out.println("Usuario autorizado");
	        	 } while(miResultset.next());
	          } else {
	        	  out.println("No hay usuarios con esos datos");
	          }
			/* 
			// Me devielve el error: ResultSet.TYPE_FORWARD_ONLY... 
			// Esto quiere decir que el ResultSet solo puede "avanzar" de registro en registro, no puede arbitrariamente moverse a un registro puntual
			if(miResultset.absolute(1)) out.println("Usuario autorizado");
			else out.println("No hay usuarios con esos datos");
			*/
		}catch(Exception e){
			out.println("Ha habido un error");
			//out.println(e);
		}
	%>
</body>
</html>