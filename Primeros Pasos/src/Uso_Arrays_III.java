import javax.swing.JOptionPane;

public class Uso_Arrays_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mmatriz_aleatorios = new int[150];
		
		for(int i=0;i<mmatriz_aleatorios.length;i++) {
			mmatriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int numeros:mmatriz_aleatorios) {
			System.out.print(numeros + " ");
		}
	}

}
