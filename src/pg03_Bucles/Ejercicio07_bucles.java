package pg03_Bucles;
import java.util.*;
public class Ejercicio07_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce tu nombre completo separado por espacios");
		String nombre=entrada.nextLine();
		System.out.println("Introduce tu sueldo por favor");
		int sueldo=entrada.nextInt();
		
		int num_mayor=sueldo;
		int num_menor=sueldo;
		String nombre_mayor=nombre;
		String nombre_menor=nombre;

		for (int i=0;i<4;i++) {
			System.out.println("Introduce tu nombre completo separado por espacios");
			 nombre=entrada.nextLine();
			System.out.println("Introduce tu sueldo por favor");
			 sueldo=entrada.nextInt();
			 

			
			if (sueldo>num_mayor) {
				num_mayor=sueldo;
				nombre_mayor=nombre;
			}
			else if (sueldo<num_menor) {
				num_menor=sueldo;
				nombre_menor=nombre;
			}
		}
			
		System.out.println(nombre_mayor + " con el sueldo de " + num_mayor + " es el que más cobra, " + 
		nombre_menor + " con el sueldo de " + num_menor + " es el que menos cobra");
			
			
		//En eclipse da problemas y tendría que pasar sueldo a String y luego a int otra vez con integer	
			
		entrada.close();	
			
	}

}
