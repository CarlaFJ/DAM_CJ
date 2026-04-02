package pg07_Metodos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejer09_metodos {

	public static void main(String[] args) {
		/*Desarrolle un método que calcule y retorne la media de un conjunto de 
		valores enteros  contenidos en un array recibido como parámetro. 
		Desarrolle otro método, con el mismo nombre, que calcule y retorne la 
		media de un conjunto de valores de tipo double contenidos en un array 
		recibido como parámetro. Utilice ambos en un mismo programa.  */ 

		
		int[] lista ={6, 9, 2, 1, 5, 10, 3, 8, 4, 7};
		double[] datos = {4.5, 6.7, 12.3, 34.2, 8.2 };
		
		
		int resultado1= media(lista);
		System.out.println("La media del array " + Arrays.toString(lista) + " es: \n" +resultado1);
		
		double resultado2= media(datos);
		System.out.println("La media del array " + Arrays.toString(datos) + " es: \n" +resultado2);
		
		
	}
	private static int media (int[] lista) { 
		int suma=0;
		int med=0;
	
		for (int i=0;i<lista.length; i++) {
			suma= suma + lista[i];
		}
		return med= suma/lista.length;
		
	
	}
	private static double media (double[] datos) {
		double suma=0;
		double med=0;
	
		for (int i=0;i<datos.length; i++) {
			suma= suma + datos[i];
		}
		return med= suma/datos.length;
	}
}
