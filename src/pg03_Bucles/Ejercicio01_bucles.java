package pg03_Bucles;

import java.util.*;

public class Ejercicio01_bucles {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entre 1 y 10");
		int num1 = entrada.nextInt();

		while (num1 < 1 || num1 > 10) {
			System.out.println("Introduce un número entre 1 y 10");
			num1 = entrada.nextInt();

		}

		System.out.println("Número admitido :)");

		entrada.close();
		

	}

}
