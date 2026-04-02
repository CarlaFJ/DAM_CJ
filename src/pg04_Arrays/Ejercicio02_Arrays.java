package pg04_Arrays;
import javax.swing.*;
public class Ejercicio02_Arrays {

	public static void main(String[] args) {
		/* Programa que lea una secuencia de 10 números enteros e indique cuáles 
		son el mayor y el menor, y cuántas veces se repiten ambos. */

		int[] numeros=new int[10];
		
		for (int i=0; i<10; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 números" + 
		"\nNúmero " + (i+1) ));
		}
		
		int mayor= numeros[0];
		int menor= numeros[0];
		
		for (int i=0; i<10; i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
				
			}
			else if(numeros[i]<menor) {
				menor=numeros[i];
				
			}
		}
		
		int mayor_rep=0;
		int menor_rep=0;
		
		for(int i=0; i<10; i++) {
			if(numeros[i]==mayor) {
				mayor_rep++;
			}
			else if(numeros[i]==menor) {
				menor_rep++;
			}
		}
		
		
		JOptionPane.showMessageDialog(null,"El número mayor es: " + mayor +  " y se repite " + mayor_rep + 
				"\nEl número menor es: " + menor + " y se repite " + menor_rep);
		
		
	}

}
