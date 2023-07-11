package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("C:" + File.separator + "Users" + File.separator + "nando" + File.separator + 
				   		   "Desktop" + File.separator + "Curso java 2022" + File.separator + 
				   		   "Acceso_Ficheros" + File.separator + "src" + File.separator + 
				   		   "ficheros_directorios" + File.separator + "ruta" + File.separator + "nuevo_directorio");

		ruta.mkdir(); //crear directorio
		
		File ruta2=new File("C:" + File.separator + "Users" + File.separator + "nando" + File.separator + 
		   		   "Desktop" + File.separator + "Curso java 2022" + File.separator + 
		   		   "Acceso_Ficheros" + File.separator + "src" + File.separator + 
		   		   "ficheros_directorios" + File.separator + "ruta" + File.separator + 
		   		   "nuevo_directorio" + File.separator + "nuevo_fichero.txt");

		String archivo_destino=ruta2.getAbsolutePath();
		
		try {
			ruta2.createNewFile(); //crear fichero
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede_es=new Escribiendo(); //Escribir en el fichero
		accede_es.escribir(archivo_destino);
	}

}

class Escribiendo {
	public void escribir(String ruta_archivo) {
		
		String frase="Esto es un ejemplo.";
		
		try {
			FileWriter escritura=new FileWriter(ruta_archivo);
			
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}