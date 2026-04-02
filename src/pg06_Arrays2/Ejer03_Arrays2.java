package pg06_Arrays2;

import java.util.*; //Este ya incluye la calse Arrays

public class Ejer03_Arrays2 {

	public static void main(String[] args) {
		/*
		 * A partir de un array de enteros con valores desordenados, realice un programa
		 * que intercambie valores de manera que en la posición de índice 0 del array
		 * quede el menor valor.
		 */

		Scanner entrada = new Scanner(System.in);

		int[] aleatorios = { 6, 9, 2, 1, 5, 10, 3, 8, 4, 7 };

		int menor = 10;
		int aux = 0;

		System.out.println("El orden inicial es el siguiente: " + Arrays.toString(aleatorios)); // Esto imprime los
																								// numeros almacenados
																								// en el array

		for (int i = 0; i < 10; i++) {
			if (aleatorios[i] < menor) {
				menor = aleatorios[i];
				aux = aleatorios[0];
				aleatorios[0] = aleatorios[i];
				aleatorios[i] = aux;

			}
		}

		System.out.println("El nuevo orden es:" + Arrays.toString(aleatorios));

	}

}
