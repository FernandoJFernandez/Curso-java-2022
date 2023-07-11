package conectaBD;

import java.sql.*;

public class ModificaBBDD {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
        	
    	//1. Crear conexión
        	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        	
        //2. Crear objeto Statement
        	Statement miStatement=miConexion.createStatement();
        	
        //3. Insert	
        //	String instruccionSql="INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, NOMBREARTÍCULO, PRECIO) VALUES ('AR77', 'PANTALÓN', 25.35)";
        	
        //3. Update	
        //	String instruccionSql="UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE CÓDIGOARTÍCULO='AR77'";
            
        //3. Delete	
            String instruccionSql="DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO='AR77'";
            
        	miStatement.executeUpdate(instruccionSql);
        	
    		System.out.println("Datos MODIFICADOS correctamente");

        	
        } catch (Exception e) {
    		System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
		
	}

}
