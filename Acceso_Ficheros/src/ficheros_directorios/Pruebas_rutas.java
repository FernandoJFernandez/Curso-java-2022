package ficheros_directorios;
import java.io.*;

public class Pruebas_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo=new File("ejemplo_archivo");
		
		System.out.println(archivo.getAbsolutePath());	//Comprobar la ruta
		System.out.println(archivo.exists());	//Comprobar si existe el archivo



	}

}
