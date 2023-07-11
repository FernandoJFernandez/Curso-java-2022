import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		TreeSet<String> ordenaPersonas=new TreeSet<String>(); //TreeSet ordena por defecto por orden alfabético mediante la interfaz comparable
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		//Bucle for-each para mostar la información
		for (String s : ordenaPersonas) {
			System.out.println(s);		
		}
*/
		//TreeSet de tipo artículo... ordena colección por número de artículo
		Articulo primero=new Articulo(1, "Primer artículo");
		Articulo segundo=new Articulo(2, "Segundo artículo");
		Articulo tercer=new Articulo(3, "Tercer artículo");
		
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);

		//Bucle for-each para mostar la información
		for (Articulo art : ordenaArticulos) {
			System.out.println(art.getDescripcion());		
		}
	}

}

class Articulo implements Comparable<Articulo>{

	public Articulo(int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}
	
	private int numero_articulo;
	private String descripcion;
	
}