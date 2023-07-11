package leyendo_escribiendo_bytes;
import java.io.*;


public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contador para saber el número de bytes del fichero
		int contador=0;
		
		//Array para almacenar los bytes
		int datos_entrada[]=new int[12549];

		try {
			FileInputStream archivo_lectura=new FileInputStream("C:\\Users\\nando\\Desktop\\Curso java 2022\\Acceso_Ficheros\\src\\leyendo_escribiendo_bytes\\imagen.jpg");
			
			boolean final_ar=false;
			
			while(!final_ar) {
				int byte_entrada=archivo_lectura.read();
				
				if(byte_entrada!=-1)
					//Almacenar datos en array
					datos_entrada[contador]=byte_entrada;
				
				else
					final_ar=true;
					//System.out.println(byte_entrada);
					System.out.println(datos_entrada[contador]);
					
					contador++;
			}
			
			archivo_lectura.close();
			
		} catch (IOException e) {
			System.out.println("Error al acceder a la imagen");
		}
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	}
	
	
	static void crea_fichero(int datos_nuevo_fichero[]) {
		try {
			FileOutputStream fichero_nuevo=new FileOutputStream("C:\\Users\\nando\\Desktop\\Curso java 2022\\Acceso_Ficheros\\src\\leyendo_escribiendo_bytes\\imagen_copia.jpg");
			
			for(int i=0;i<datos_nuevo_fichero.length;i++) {
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			
			fichero_nuevo.close();
			
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
		}
	}

}
