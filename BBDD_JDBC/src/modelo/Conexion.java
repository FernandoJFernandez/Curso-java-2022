package modelo;

import java.sql.*;

public class Conexion {

	Connection miConexion=null;

	public Conexion(){}

	public Connection dameConexion() {
		try {
	
			//1. Crear conexión con la base de datos
			miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
		
		}catch(Exception e) {
			System.out.println("NO CONECTA!");
			
		}
		return miConexion;
	}
}

	
	