package excepciones_I;

import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa elementos a la matriz: "));
		
		int[]numerosAleatorios = new int [elementos];
		
		for(int i=0; i<numerosAleatorios.length;i++) {
			
			numerosAleatorios[i]=(int)(Math.random()*100);
			
		}
		
		for(int elem: numerosAleatorios) {
			System.out.println(elem);
		}
	}

}
