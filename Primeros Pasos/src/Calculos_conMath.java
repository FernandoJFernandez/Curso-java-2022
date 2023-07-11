
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz=Math.sqrt(9);
		System.out.println(raiz);

		float num1=5.85F;
		int resultado=Math.round(num1);
		System.out.println(resultado);
		
		//Refundición (convertir un tipo de dato a otro)
		double num2=5.85;
		int resultado2=(int)Math.round(num2);
		System.out.println(resultado2);
		
		double base=5;
		double exponente=3;
		int resultado3=(int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado3);
	}

}
