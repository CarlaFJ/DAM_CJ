package pg07_Metodos;
import java.util.*;
public class Ejer06_metodos {

	public static void main(String[] args) {
		/*Desarrolle el método aleatorio() que recibe dos enteros (mínimo y 
		máximo) y devuelva un valor aleatorio entero comprendido entre los 
		valores recibidos como parámetro*/ 
		
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un nº, por favor");
		int n1=entrada.nextInt();
		
		System.out.println("Introduce un segundo nº mayor que el anterior porfi :)");
		int n2=entrada.nextInt();
		
		int miNum= aleatorio(n1, n2);
		
		System.out.println("Nº aleatorio entre " + n1 + " y " + n2 + ": \n" + miNum);
		
		
		
	}
	private static int aleatorio(int a, int b) {
		return (int)(Math.random() * (b - a + 1)) + a;

	}
}
