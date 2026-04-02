package pg07_Metodos;
import java.util.*;
public class Ejer01_metodos {

	public static void main(String[] args) {
	/*Desarrolle y utilice un método que reciba tres números enteros y devuelva 
	el mayor.  */ 
	
	Scanner entrada= new Scanner (System.in);
	
	int mayor=0;
	
	System.out.println("Introduce un nº");
	int num1=entrada.nextInt();
	
	System.out.println("Introduce un nº");
	int num2=entrada.nextInt();
	
	System.out.println("Introduce un nº");
	int num3=entrada.nextInt();
	
	mayor=calculaMayor(num1, num2, num3);
	
	System.out.println("El número mayor es: " + mayor );
	
	}

	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return Mayor entre num1, num2, num3
	 */
	private static int calculaMayor(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
 }
