import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Objetos de tipo Cliente
		Cliente cl1=new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2=new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3=new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4=new Cliente("Julio Iglesias", "00004", 500000);
		Cliente cl5=new Cliente("Antonio Banderas", "00001", 200000);

		// Crear colección
		Set <Cliente> clientesBanco=new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);

		//Bucle for-each
/*
		for (Cliente cliente : clientesBanco) {

			System.out.println(cliente.getNombre() + " "
							 + cliente.getN_cuenta() + " "
							 + cliente.getSaldo());

			//Eliminar un cliente... da error por modificar una colección a la vez que la recorremos, 
			//por lo tanto es mejor usar un iterador para eliminar un objeto
			if(cliente.getNombre().equals("Julio Iglesias")) {
				clientesBanco.remove(cliente);
			}
		
		}
*/		

		Iterator <Cliente> it=clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente=it.next().getNombre();
			if(nombre_cliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		
		//Bucle for-each para mostar la información
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " "
							 + cliente.getN_cuenta() + " "
							 + cliente.getSaldo());		
		}

		
		// Recorrer colección de Clientes con un iterador - Opción 2
/*		Iterator <Cliente> it=clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente=it.next().getNombre();
			System.out.println(nombre_cliente);
		}
*/		
		
	}

}
