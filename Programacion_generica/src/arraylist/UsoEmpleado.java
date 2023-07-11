package arraylist;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Usando un array
		/*
		Empleado listaEmpleados[]=new Empleado[3];
		
		listaEmpleados[0]=new Empleado("Ana", 45, 2500);
		listaEmpleados[1]=new Empleado("Antonio", 55, 2000);
		listaEmpleados[2]=new Empleado("María", 25, 2600);
		*/
		
		// Usando un arraylist
		ArrayList <Empleado> listaEmpleados=new ArrayList <Empleado>();
		//listaEmpleados.ensureCapacity(11); //Si sabemos el tamaño del arraylist es conveniente definirlo para aprovechar memoria
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("María", 25, 2600));
		
		//listaEmpleados.set(1, new Empleado("Olga", 22, 2200)); // Método set para añadir en una posición determinada del arraylist
		
		//System.out.println(listaEmpleados.get(2).dameDatos());	// Método get para acceder a un elemento en concreto


		//listaEmpleados.trimToSize(); //Corta el exceso de memoria si hemos definido el tamaño del arraylist
		
		//System.out.println(listaEmpleados.size());	//Listad el número de elementos del arraylist
		
		//Bucle for-each (opción 1 para recorrer el arraylist)
/*		for (Empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());

		}
*/		
		//Iterador para trabajar con datos primitivos
		Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
		while(mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().dameDatos());
		}
		
		//Bucle for convencional (opción 2 para recorrer el arraylist)
/*		for(int i=0;i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());

		}
*/		
		//Recorrer el arraylist mediante un array convencional copiandolo (opción 3 para recorrer el arraylist)
/*		Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i=0;i<arrayEmpleados.length;i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}
*/		
	}

}

class Empleado{
	//Método constructor
	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años." + " Y un salario de " + salario;
	}
	
	//Variables de clase
	private String nombre;
	private int edad;
	private double salario;

	
}