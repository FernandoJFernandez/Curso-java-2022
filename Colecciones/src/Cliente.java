import java.util.Objects;

public class Cliente {

	//Constructor
	public Cliente(String nombre, String n_cuenta, double saldo) {
		this.nombre=nombre;
		this.n_cuenta=n_cuenta;
		this.saldo=saldo;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Sobreescribir el método equals para que detecte que el Cliente no es el mismo por n_cuenta
	//--> Source > Generate hashCode() and equals()
	@Override
	public int hashCode() {
		return Objects.hash(n_cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(n_cuenta, other.n_cuenta);
	}
	
	//Campos de clase
	private String nombre;
	private String n_cuenta;
	private double saldo;
	
}
