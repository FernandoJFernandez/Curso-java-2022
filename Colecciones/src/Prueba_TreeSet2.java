import java.util.*;

public class Prueba_TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ordena por número
		Articulo2 primero=new Articulo2(1, "Primer artículo");
		Articulo2 segundo=new Articulo2(200, "Segundo artículo");
		Articulo2 tercer=new Articulo2(3, "Tercer artículo");
		
		TreeSet<Articulo2> ordenaArticulos=new TreeSet<Articulo2>();
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);

		//Bucle for-each para mostar la información
		for (Articulo2 art : ordenaArticulos) {
			System.out.println(art.getDescripcion());		
		}
		
		//Ordena alfabéticamente
		Articulo2 comparadorArticulos=new Articulo2();
		
		TreeSet <Articulo2> ordenaArticulos2=new TreeSet<Articulo2>(comparadorArticulos);
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercer);
		
		//Bucle for-each para mostar la información
		for (Articulo2 art : ordenaArticulos2) {
			System.out.println(art.getDescripcion());		
		}
	}

}

class Articulo2 implements Comparable<Articulo2>, Comparator<Articulo2>{
	
	public Articulo2() {
		
	}

	public Articulo2(int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
	}
	
	@Override
	public int compareTo(Articulo2 o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	private int numero_articulo;
	private String descripcion;
	
	@Override
	public int compare(Articulo2 arg0, Articulo2 arg1) {
		// TODO Auto-generated method stub
		String descripcionA=arg0.getDescripcion();
		String descripcionB=arg1.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);

	}
}