package pg04_Arrays;
import javax.swing.*;
public class Ejercicio01_Arrays {

	public static void main(String[] args) {
		
/* Programa que lea 5 números enteros e indique cuántos de ellos son 
superiores a la media*/
		
		
		int[] numeros=new int[5];
		int suma=0;
		
		for (int i=0;i<5; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero " + (i+1)));
			suma= suma + numeros[i];
			
		}
		
		int media= suma/ 5;
		
		int mayor_a_la_media=0;
		
		for(int i=0; i<5;i++) {
			if (numeros[i]> media) {
				mayor_a_la_media++;
			}
		}
		
		
		JOptionPane.showMessageDialog(null,"La media de esos números es: " + media +
				"\nHay " + mayor_a_la_media + "números por encima de la media");
		
		
	}

}
