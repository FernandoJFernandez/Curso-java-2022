package ficheros_directorios;
import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("C:\\Users\\nando\\Desktop\\Curso java 2022\\Acceso_Ficheros\\src\\ficheros_directorios\\ruta\\");

		System.out.println(ruta.getAbsolutePath());	//Comprobar la ruta
		
		String[] nombres_archivos=ruta.list(); //Almacena en el array todo lo que haya en la ruta
		
		for(int i=0;i<nombres_archivos.length;i++) {
			System.out.println(nombres_archivos[i]);	//Listado de la ruta
			
			//Recorrer directorios de la ruta
			File f=new File(ruta.getAbsolutePath(),nombres_archivos[i]);

			if(f.isDirectory()) {
				String[] archivos_subcarpeta=f.list();
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					System.out.println(archivos_subcarpeta[j]);	//Listado de archivos de la subcarpeta
				}
			}
		}
	}

}