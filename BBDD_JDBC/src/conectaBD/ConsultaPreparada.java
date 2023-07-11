package conectaBD;

import java.sql.*;

public class ConsultaPreparada {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
        	
    	//1. Crear conexión
        	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        	
        //2. Preparar consulta
        	PreparedStatement miSentencia=miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS"
        			+ " WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");
        	
        //3. Establecer parámetros de consulta
        	miSentencia.setString(1, "deportes");
        	miSentencia.setString(2, "USA");
            
        //4. Ejecutar y recorrer la consulta	
        	ResultSet rs=miSentencia.executeQuery();

        //5. Recorrer el Resultset
        	while(rs.next()) {
        		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        	}
        	
        //6. Liberar la memoria
        	rs.close();
        	
        // REUTILIZACIÓN DE CONSULTA SQL
    		System.out.println("EJECUCIÓN SEGUNDA CONSULTA");
    		System.out.println("");

        	miSentencia.setString(1, "cerámica");
        	miSentencia.setString(2, "China");
        	
        	rs=miSentencia.executeQuery();
        	
        	while(rs.next()) {
        		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        	}
        	rs.close();

        } catch (Exception e) {
    		System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
		
	}

}
