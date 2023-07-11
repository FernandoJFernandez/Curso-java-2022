package excepciones_I;
import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String el_mail=JOptionPane.showInputDialog("Introduce mail");

		try {
			examina_mail(el_mail);
		}catch(Exception e){
			System.out.println("La dirección de email no es correcta");
			
			e.printStackTrace(); // pista del motivo del error
		}
	}
	
	static void examina_mail(String mail) throws Longitud_mail_erronea{
		int arroba=0;
		boolean punto=false;
		
		//Lanzar una excepcion de forma manual si el correo es menor a 3 caracteres
		if(mail.length()<=3) {
			//ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException();
			//throw mi_excepcion;
			throw new Longitud_mail_erronea("El mail no puede tener menos de tres caracteres");
		}else{
		
			for(int i=0;i<mail.length();i++) {
				if(mail.charAt(i)=='@') {
					arroba++;
				}
				
				if(mail.charAt(i)=='.') {
					punto=true;
				}
			}
			
			if(arroba==1 && punto==true) {
				System.out.println("Es correcto");
			}
			else {
				System.out.println("No es correcto");
			}
		}
	}

}

//Crear nuestra propia excepción
class Longitud_mail_erronea extends Exception{
	public Longitud_mail_erronea() {}
	public Longitud_mail_erronea(String msj_error) {
		super(msj_error);
	}
}
