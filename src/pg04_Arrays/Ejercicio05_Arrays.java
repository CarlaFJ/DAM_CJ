package pg04_Arrays;
import java.util.*;
public class Ejercicio05_Arrays {

	public static void main(String[] args) {
		/*Programa que almacene en un array los valores enteros 1-10 de manera 
		desordenada. El programa debe pedir al usuario un dato (valor numérico 
		entre 1 y 10) e indicarle en qué posición del array se encuentra el valor. 
		Desarrolle un algoritmo eficiente. */
		
		
	Scanner entrada= new Scanner (System.in);	
		
	int[] numeros= {1, 4, 7, 10, 3, 2, 8, 5, 9, 6};
	int n1=0;
	
		
	System.out.println("Introduce un número entre 1-10");	
	n1=entrada.nextInt();
	
	for (int i=0; i<10; i++) {
		if (numeros[i]== n1) {
			System.out.println("El número introducido se encuentra en la posición " + i);
		}
	}
		
	entrada.close();	
		
			

	}

}
