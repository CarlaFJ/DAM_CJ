package pg04_Arrays;

import java.util.*;

public class Ejercicio06_Arrays {

	public static void main(String[] args) {
		/*
		 * Programa que almacene en un array valores enteros (en el rango 1-10) de
		 * manera desordenada. El programa debe pedir al usuario un dato e indicarle si
		 * está en el array o no, y en caso afirmativo indicar su posición.
		 */

		Scanner entrada = new Scanner(System.in);

		int[] numeros = { 1, 4, 7, 10, 3, 2, 8, 5, 9, 6 };

		System.out.println("Introduce un número entero");
		int n1 = entrada.nextInt();

		if (n1 < 1 || n1 > 10) {
			System.out.println("El número " + n1 + " no se encuentra dentro del Array");
		}

		for (int i = 0; i < 10; i++) {
			if (numeros[i] == n1) {
				System.out.println("El número " + n1 + " se encuentra en la posición " + i);
			}
		}
		
		
		entrada.close();
	}

}
