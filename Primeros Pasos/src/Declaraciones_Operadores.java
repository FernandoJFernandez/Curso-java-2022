
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		
		//Variables
		int a = 5;
		int b;
		b = 7;
		
		int c=b+a;
		//c++;
		//c+=6;
		//c-=6;
		System.out.println(c);
		
		double d = 5;
		double e;
		e = 7;
		
		double f=e/d;
		System.out.println(f);
		
		
		//Constantes
		final double apulgadas=2.54;
		
		double cm=6;
		double resultado=cm/apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

	}

}
