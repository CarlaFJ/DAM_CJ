package pg03_Bucles;

import java.util.Scanner;

public class Ejercicio08_bucles {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce tu nombre completo separado por espacios");
		String nombre=entrada.nextLine();
		System.out.println("Introduce tu sueldo por favor");
		int sueldo=entrada.nextInt();
		entrada.nextLine(); // limpiar salto de línea pendiente
		
		int num_mayor=sueldo;
		int num_2mayor=sueldo;
		String nombre_mayor=nombre;
		String nombre_2mayor=nombre;

		for (int i=0;i<4;i++) {
			System.out.println("Introduce tu nombre completo separado por espacios");
			 nombre=entrada.nextLine();
			System.out.println("Introduce tu sueldo por favor");
			 sueldo=entrada.nextInt();
			 
			
			if (sueldo>num_mayor) {
				num_2mayor=num_mayor;
				nombre_2mayor=nombre_mayor;
				
				num_mayor=sueldo;
				nombre_mayor=nombre;
				
			}
			else if (sueldo>num_2mayor) {
				num_2mayor=sueldo;
				nombre_2mayor=nombre;
			}
		}
			
		System.out.println(nombre_mayor + " con el sueldo de " + num_mayor + " es el que más cobra, " + 
		nombre_2mayor + " con el sueldo de " + num_2mayor + " es el segundo que más cobra");
			
			
		
			
		entrada.close();	

	}

}
