package pg04_Arrays;

public class Ejercicio07_Arrays {

	public static void main(String[] args) {
		/*
		 * Programa que lea una matriz de 2 filas y 3 columnas con números enteros,
		 * imprimiendo los valores máximo y mínimo y sus posiciones dentro de la tabla.
		 */

		int[][] matriz = new int[2][3];

		matriz[0][0] = 15;
		matriz[0][1] = 56;
		matriz[0][2] = 69;

		matriz[1][0] = 78;
		matriz[1][1] = 27;
		matriz[1][2] = 19;

		for (int[] fila : matriz) {
			System.out.println();

			for (int z : fila) {
				System.out.print(z + " ");
			}
		}

		System.out.println(" ");

		int maximo = matriz[0][0];
		int minimo = matriz[0][0];
		int PosMaxFila = 0, PosMaxCola = 0;
		int PosMinFila = 0, PosMinCola = 0;

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] > maximo) {
					maximo = matriz[i][j];
					PosMaxFila = i;
					PosMaxCola = j;

				} else if (matriz[i][j] < minimo) {
					minimo = matriz[i][j];
					PosMinFila = i;
					PosMinCola = j;
				}
			}
		}

		System.out.println("\nEl máximo se encuentra en (" + PosMaxFila + "," + PosMaxCola + ") = " + maximo);
		System.out.println("\nEl mínimo se encuentra en (" + PosMinFila + "," + PosMinCola + ") = " + minimo);
		System.out.println("\nEl valor máximo es " + maximo + " y el valor minimo es " + minimo);

	}

}
