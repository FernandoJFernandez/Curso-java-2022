import java.util.Objects;

public class Libro {
	
	//Constructor
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	//Getter
	private String getDatos() {
		return "El título es:" + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN; 
	}
	
	//Sobreescribir el método equals para que detecte que el ISBN es igual al de otro objeto
	//Opcion 1
/*	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otro=(Libro)obj;
			
			if(this.ISBN==otro.ISBN) {
				return true;
			}else {
				return false;
			}

		}else {
			return false;
		}
	}
*/	
	//Opcion 2: Source > Generate hashCode() and equals()
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}
	
	
	//Campos de clase
	private String titulo;
	private String autor;
	private int ISBN;
}
