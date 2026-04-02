package pg04_Arrays;

import javax.swing.JOptionPane;

public class Ejercicio03_Arrays {

	public static void main(String[] args) {
		/* Programa que lea una secuencia de 10 números y los muestre en orden 
		inverso al de entrada.*/

		int[] numeros=new int[10];
		
		for (int i=0; i<10; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 números" + 
		"\nNúmero " + (i+1) ));
		}
		
		//El bucle empieza en 9, que es la última posición del array.

		//La condición i >= 0 hace que siga hasta el índice 0.

		//En cada vuelta, i-- resta 1 (va hacia atrás).
		
		for (int i=9; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}
