package leyendo;
import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_fichero accediendo=new Leer_fichero();
		accediendo.lee();
	}

}

class Leer_fichero {
	public void lee() {
		try {
			FileReader entrada=new FileReader("C:\\Users\\nando\\Desktop\\Curso java 2022\\Acceso_Ficheros\\src\\leyendo\\ejemplo.txt");
			
			BufferedReader mibuffer=new BufferedReader(entrada);
			/*
			int c=0;
			
			while(c!=-1) {
				c=entrada.read();
				
				char letra=(char)c;
				System.out.print(letra);
			}
			*/
			
			String linea="";
			
			while(linea!=null) {
				linea=mibuffer.readLine();
				
				if(linea!=null)
				System.out.println(linea);
			}
			
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
	}
}