package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona [] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("Ana López", "Bilógicas");
		
		for (Persona p:lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
	}
}

// Clase abstracta
abstract class Persona{
	//constructor
	public Persona(String nom) {
		nombre=nom;
	}
	
	//Getter
	public String dameNombre() {
		return nombre;
	}
	
	//Setter
	public abstract String dameDescripcion();
	
	//campo de clase variable
	private String nombre;
}

class Empleado2 extends Persona{
	
	//Método constructor
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	//Sobrescribir método
	public String dameDescripcion() {
		return "Este empleado tiene un Id = " + Id +" con un sueldo = " + sueldo;
	}
	
	public double dameSueldo() { //Getter
		return sueldo;
	}
	public Date dameFechaContrato() { //Getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) { //Setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	//Variables de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
}

class Alumno extends Persona{
	public Alumno(String nom, String car) {
		super(nom);
		carrera=car;
	}
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	private String carrera;
}