package pg07_Metodos;

import java.util.Arrays;

public class Ejer07_metodos {
{}
	public static void main(String[] args) {
		/*Desarrolle el método private static void ordenar(int[] datos)  que ordena el 
		array recibido como parámetro de menor a mayor. Desarrolle un 
		programa que lo utilice. */ 

		int[] datos ={6, 9, 2, 1, 5, 10, 3, 8, 4, 7};
		
		System.out.println("El orden antes de usar el método: " + Arrays.toString(datos));
		
		ordenar(datos);
		
		System.out.println(Arrays.toString(datos));
		
	}
	private static void ordenar(int[] datos) {
		for (int i = 0; i < datos.length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[posMenor]) {
                    posMenor = j;
                }
            }
            // intercambio usando temp
            int temp = datos[i];
            datos[i] = datos[posMenor];
            datos[posMenor] = temp;
        }
	}
}
