import java.util.*;

public class PruebaListaEnlazada {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> paises=new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Perú");

		LinkedList<String> capitales=new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");
		
		//System.out.println(paises);
		//System.out.println(capitales);

		//Añadir elementos de una LinkedList a otra, con un iterador
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();

		while(iterB.hasNext()) {
			if(iterA.hasNext()) {
				iterA.next();
			}
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);

		//Reiniciar el iterador para que vuelva al principio y eliminar las posiciones pares
		iterB=capitales.listIterator(); // Sube el iterador arriba
		
		while(iterB.hasNext()) { 	//Pregunta si a continuación del iterador hay un elemento
			iterB.next();			//El iterador salta un elemento, se pone en 2ª posición
			if(iterB.hasNext()) {	//Pregunta si hay otra posición
				iterB.next();		//Si la hay, salta otra posición, y se elimina la 2ª
				iterB.remove();
			}						// Y se vuelve el flujo del programa a comprobar la condición del while...
		}
		
		System.out.println(capitales);
		
		//Cargarnos las capitales
		paises.removeAll(capitales);
		System.out.println(paises);

	}
}
