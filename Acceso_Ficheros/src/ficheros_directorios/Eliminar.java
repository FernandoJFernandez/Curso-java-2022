package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("C:" + File.separator + "Users" + File.separator + "nando" + File.separator + 
		   		   "Desktop" + File.separator + "Curso java 2022" + File.separator + 
		   		   "Acceso_Ficheros" + File.separator + "src" + File.separator + 
		   		   "ficheros_directorios" + File.separator + "ruta" + File.separator + 
		   		   "nuevo_directorio");
		
		ruta.delete();
	}

}
