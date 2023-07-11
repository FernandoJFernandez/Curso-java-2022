package procAlmacenado;

import java.sql.*;
import javax.swing.JOptionPane;

public class Actualiza_Productos {
	public static void main(String[]args) {
		
		String nPrecio = JOptionPane.showInputDialog("Ingresa el precio: ");
		
		String nArticulo = JOptionPane.showInputDialog("Ingresa el nombre del artículo: ");
		
		try {
			
			Connection miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?, ?)}");

			miSentencia.setString(1, nPrecio);
			miSentencia.setString(2, nArticulo);
			miSentencia.execute();
			
			System.out.println("Actualización OK");
			
		}catch(Exception e) {
			System.out.println("No Conecta");
		}
	}
}
