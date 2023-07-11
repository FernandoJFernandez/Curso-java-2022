package controlador;

import java.awt.event.*;
import java.sql.*;

import modelo.EjecutaConsultas;
import vista.Marco_Aplicacion2;

public class ControladorBotonEjecuta implements ActionListener  {

	public ControladorBotonEjecuta(Marco_Aplicacion2 elmarco) {
		this.elmarco=elmarco;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String seleccionSeccion = (String)elmarco.secciones.getSelectedItem();
		String seleccionPais= (String)elmarco.paises.getSelectedItem();
		
		resultadoConsulta=obj.filtraBBDD(seleccionSeccion, seleccionPais);
		
		try {
			elmarco.resultado.setText("");
			while(resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				elmarco.resultado.append("\n");
				
				elmarco.resultado.append(resultadoConsulta.getString(2));
				elmarco.resultado.append("\n");
				
				elmarco.resultado.append(resultadoConsulta.getString(3));
				elmarco.resultado.append("\n");
				
				elmarco.resultado.append(resultadoConsulta.getString(4));
				elmarco.resultado.append("\n");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private Marco_Aplicacion2 elmarco;
	EjecutaConsultas obj = new EjecutaConsultas();
	private ResultSet resultadoConsulta;
}
