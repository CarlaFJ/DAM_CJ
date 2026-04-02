package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio02_sc {

	public static void main(String[] args) {
		
Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		int num1=entrada.nextInt();
		
		System.out.println("Introduce un segundo número");
		
		int num2=entrada.nextInt();
		
		int producto= num1*num2;
		
		if (producto>=10) {
			System.out.println(producto);
		}
		
		else {
			System.out.println("el producto es menor de 10");
		}
		
		
		entrada.close();

	}

}
