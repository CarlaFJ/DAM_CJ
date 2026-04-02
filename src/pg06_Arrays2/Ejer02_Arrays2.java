package pg06_Arrays2;
import java.util.*;
public class Ejer02_Arrays2 {

	public static void main(String[] args) {
		/*A  partir de un array de enteros con valores ordenados de menor a mayor, 
		desarolle un programa que le pida un dato al usuario y le indique si el 
		valor está o no en el array. */ 

		Scanner entrada= new Scanner (System.in);
		
		int [] edades_menor_mayor= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Introduce una edad");
		int edad=entrada.nextInt();
		
		for(int i=0; i<10; i++) {
			if(edades_menor_mayor[i]==edad) {
				System.out.println("La edad introducida está en la lista");
			}
			
		}
		
		if(edad<1 || edad>10) {
			System.out.println("Esta edad se encuentra fuera de la lista");
		}
		
		
		
	}

}
