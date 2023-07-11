package conectaBD;
import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
        	
    	//1. Crear conexión
        	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        	
        //2. Crear objeto Statement
        	Statement miStatement=miConexion.createStatement();
        	
        //3. Ejecutar SQL
        	ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PRODUCTOS");
        	
        //4. Recorrer el Resultset
        	while(miResultset.next()) {
        		System.out.println(miResultset.getString("NOMBREARTÍCULO") + " " + miResultset.getString("CÓDIGOARTÍCULO") + " " + miResultset.getString("PRECIO"));
        	}
        	
        } catch (Exception e) {
    		System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
		
	}

}
