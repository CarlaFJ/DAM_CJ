package pg03_Bucles;
import java.util.*;
public class Ejercicio02_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		int positivos=0;
		
		System.out.println("Introduce 5 números separados por espacios: ");
		
		for (int i=0; i<5; i++) {
			int numeros=entrada.nextInt();
			
			if (numeros>0) {
				positivos++;
			}
		}
		
		
		System.out.println("Hay " + positivos + " números positivos");
		 
		entrada.close();

	}

}
