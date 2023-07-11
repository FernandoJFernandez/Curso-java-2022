package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		// Constructor
		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("María Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
			+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
	
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " + empleado3.dameFechaContrato());
		*/
		
		//Instancia jefatura
		Jefatura jefe_RRHH=new Jefatura("Fernando", 55000, 2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
	
		// Usando un array
		Empleado [] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 03, 15);
		misEmpleados[3]=new Empleado("Antonio Fernández");
		misEmpleados[4]=jefe_RRHH; //Polimorfismo en acción. Principio de sustitución.
		misEmpleados[5]=new Jefatura("María",95000, 1999,5,26);

		//Casting (refundición de objetos)
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		/*			
		Empleado director_comercial=new Jefatura("Sandra",85000, 2012, 05, 05);
		Comparable ejemplo=new Empleado("Elisabeth", 9500, 2011, 06, 07);
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jafaura");
		}
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interface comparable");
		}
		*/
		/*
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		// For mejorado
		for (Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		/*
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		
		//Ordenar array
		Arrays.sort(misEmpleados);
		
		// For mejorado
		for (Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre()
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
		
	}

}

class Empleado implements Comparable, Trabajadores {
	//Método constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
	//Sobrecarga constructores
	public Empleado(String nom) {
		this(nom, 30000, 200,01,01); //de esta manera llama al otro constructor pasánsole los parámetros que faltan
	}
	
	//Getter & Setter
	public String dameNombre() { //Getter
		return nombre + " Id: " + Id;
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
	
	//Método de la interfaz comparable
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.Id<otroEmpleado.Id) {
			return -1;
		}
		if(this.Id>otroEmpleado.Id) {
			return 1;
		}
		return 0;
	}
	
	//Variables de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
}

class Jefatura extends Empleado implements Jefes{
	//Constructor que llame a la clase padre
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	//Método heredado de tomar decisiones
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	//Setter
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	//Getter (sobrescribe método de la clase padre (por eso el triangulito de la izq))
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	//Campo de clase
	private double incentivo;
}