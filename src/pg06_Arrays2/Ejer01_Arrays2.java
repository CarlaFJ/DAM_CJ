package pg06_Arrays2;
import java.util.*;
public class Ejer01_Arrays2 {

	public static void main(String[] args) {
		/*A semejanza del ejercicio Pg04Ejercicio06, a partir de un array de enteros 
		con valores desordenados, desarrolle un programa que le pida un dato al 
		usuario y le indique si el valor está o no en el array.*/ 

		Scanner entrada= new Scanner (System.in);
		
		int [] aleatorios= {6,12,9,2,15,1,5,10,3,8,11,4,13,7,14};
		
		System.out.println("Introduce un puesto en la lista, por favor");
		int num=entrada.nextInt();
		
		for(int i=0; i<15; i++) {
			if(aleatorios[i]==num) {
				System.out.println("El valor introducido se encuentra en la lista");
			}
			
		}
		
		if(num<1 || num>15) {
			System.out.println("Ese valor se encuentra fuera de la lista");
		}
	}

}
