package pg04_Arrays;

import java.util.*;

public class Ejercicio08_Arrays {

	public static void main(String[] args) {
		/*
		 * Programa que a partir de una matriz de enteros de 4 filas y 5 columnas que
		 * almacene los números 1-20 de manera desordenada, le pida al usuario un dato
		 * (valor numérico entero entre 1 y 20) y le indique en qué posición (fila y
		 * columna) de la matriz se encuentra el valor. Desarrolle un algoritmo
		 * eficiente.
		 */

		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[4][5];

		matriz[0][0] = 4;
		matriz[0][1] = 5;
		matriz[0][2] = 3;
		matriz[0][3] = 1;
		matriz[0][4] = 2;

		matriz[1][0] = 9;
		matriz[1][1] = 10;
		matriz[1][2] = 6;
		matriz[1][3] = 8;
		matriz[1][4] = 7;

		matriz[2][0] = 13;
		matriz[2][1] = 14;
		matriz[2][2] = 11;
		matriz[2][3] = 15;
		matriz[2][4] = 12;

		matriz[3][0] = 19;
		matriz[3][1] = 20;
		matriz[3][2] = 18;
		matriz[3][3] = 17;
		matriz[3][4] = 16;

		System.out.println("Introduce un número entre 1-20, por favor");
		int num = entrada.nextInt();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				int PosFila = i;
				int PosCola = j;
				if (matriz[i][j] == num) {
					System.out.println("El número introducido se encuentra en la posicion: " + PosFila + "," + PosCola);
				}

			}
		}

		System.out.println("Ese número no se encuentra en el Array");

		entrada.close();

	}

}
