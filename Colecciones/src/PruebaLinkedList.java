import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> personas=new LinkedList<String>();
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");

		System.out.println(personas.size());

		//Añadir un elemento en una posición determinada, con un iterador
		ListIterator<String> it=personas.listIterator();
		it.next();
		it.add("Juan");
		
		//Bucle for-each para mostar la información
		for (String persona : personas) {
			System.out.println(persona);		
		}
	}

}
