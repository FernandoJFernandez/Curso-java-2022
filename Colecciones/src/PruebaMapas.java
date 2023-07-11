import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Empleado> personal=new HashMap<String, Empleado>();
		
		//Añadir elemento al mapa
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);	
		
		//Elimina elemento del mapa
		personal.remove("147");
		System.out.println(personal);	
		
		//Sustituir un elemento
		personal.put("148", new Empleado("Natalia"));
		System.out.println(personal);	

		//Que devuelva una colección de tipo Set y que la imprima
		//System.out.println(personal.entrySet());	
		
		//Recorrer elemento a elemento y que los devuelva en forma de Set
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave=" + clave + ", Valor=" + valor);		
		}

	}

}
class Empleado {
	public Empleado(String n) {
		nombre=n;
		sueldo=2000;
	}
	
	public String toString() {
		return "[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	private String nombre;
	private double sueldo;

}
