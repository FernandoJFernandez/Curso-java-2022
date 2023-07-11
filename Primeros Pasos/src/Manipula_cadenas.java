
public class Manipula_cadenas {

	public static void main(String[] args) {
		
		// Manipula cadenas I
		String nombre = "Fernando";
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("La última letra es la " + nombre.charAt(ultima_letra-1));
		
		// Manipula cadenas II
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		String frase_resumen = frase.substring(1,3); //1= primera posición para extraer empezando en 0, 3=aúltima posición no incluida en extracción
		String frase_resumen1 = frase.substring(0,29) + "irnos a la playa y olvidarnos de todo...." + " y " +
		 frase.substring(29, 57);
		System.out.println(frase_resumen1);
		
		// Manipula cadenas III
		String alumno1, alumno2;
		alumno1="David";
		alumno2="david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
