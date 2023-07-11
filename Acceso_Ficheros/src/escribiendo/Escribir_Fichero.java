package escribiendo;

import java.io.*;

import javax.swing.JOptionPane;


public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir();
	}

}

class Escribiendo {
	public void escribir() {
		
		String frase="Esto es una prueba de escritura";
		
		try {
			// añadiendo true en caso de que exista se modifica el fichero, sino se sobreescribe
			FileWriter escritura=new FileWriter("C:\\Users\\nando\\Desktop\\Curso java 2022\\Acceso_Ficheros\\src\\escribiendo\\texto_nuevo.txt", true);
			
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}