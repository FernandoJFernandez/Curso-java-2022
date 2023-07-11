package excepciones_I;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			division();

		}catch(ArithmeticException e) {
			System.out.println("Estas dividiendo por 0");
		}catch(NumberFormatException e) {
			System.out.println("No has introducidoo un número entero");
			
			//System.out.println(e.getMessage());
			System.out.println("Se ha producido un error de este tipo: " + e.getClass().getName());

		}
		
	}

	static void division() {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));

		System.out.println("El resultado es: " + num1/num2);

	}
}
