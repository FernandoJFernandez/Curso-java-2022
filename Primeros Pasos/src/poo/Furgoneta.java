package poo;

//Herencia, extender de la clase coche
public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	//constructor de furgoneta para inicializar
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super(); //llamar al constructor de la clase padre
		
		//estado inicial de las plazas extra y capacidad de carga
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;;
	}
	
	//Getter
	public String dimeDatosFurgoneta() {
		return " La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
	}
}
