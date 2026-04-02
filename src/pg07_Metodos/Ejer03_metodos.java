package pg07_Metodos;

import java.util.*;

public class Ejer03_metodos {

	public static void main(String[] args) {
		/* Desarrolle y utilice el método private static boolean esPrimo(int x). */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un nº");
		int n1 = entrada.nextInt();
		
		if (esPrimo(n1)) System.out.println("Es primo");
		else System.out.println("No es Primo");

	}

	private static boolean esPrimo(int x) {
		if (x <= 1) return false;         // Los menores o iguales a 1 no son primos
		if (x == 2) return true;          // El 2 es primo
		if (x % 2 == 0) return false;     // Los pares > 2 no son primos

		int limite = (int) Math.sqrt(x);  // Raíz cuadrada del número

		for (int i = 3; i <= limite; i += 2) {      // Solo impares
			if (x % i == 0) {
				return false;             // Tiene un divisor
			}
		}
		return true;                      // Si no encontró divisores, es primo
	}

}
