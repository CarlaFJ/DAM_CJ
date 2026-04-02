package pg07_Metodos;

import java.util.*;

public class Ejer05_metodos {

	public static void main(String[] args) {
		/*
		 * Desarrolle el método aleatorio() que recibe un entero y devuelva un valor
		 * aleatorio entero entre 1 y el parámetro enviado.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un nº");
		int n1 = entrada.nextInt();
		
		int miNumero= aleatorio(n1); //paso mi nº al método
		
		System.out.println("número aleatorio entre 1 y " + n1 + ": \n" + miNumero);

	}
	private static int aleatorio(int a) {
		
		return (int)(Math.random() * a) + 1;
	}
}
