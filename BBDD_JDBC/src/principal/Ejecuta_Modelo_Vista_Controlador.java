package principal;

import javax.swing.JFrame;

import vista.Marco_Aplicacion2;

public class Ejecuta_Modelo_Vista_Controlador {
	
	public static void main(String[]args) {
	
		Marco_Aplicacion2 mimarco = new Marco_Aplicacion2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);	
	
	}

}
