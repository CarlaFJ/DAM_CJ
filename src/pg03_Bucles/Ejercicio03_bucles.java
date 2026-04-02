package pg03_Bucles;
import java.util.*;
public class Ejercicio03_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		int positivos=0;
		int negativos=0;
		int nulo=0;
		
		System.out.print("Introduce 10 números, por favor: ");
		
		for (int i=0; i<10; i++) {
			int numeros=entrada.nextInt();
			
			if (numeros>0) {
				positivos++;
			}
				
			else if (numeros<0) {
				negativos++;
			}
				
			else {
				nulo++;
			}
			
		}
		
		System.out.println("De todos los números introducidos hay: " + positivos + " postivos " +  negativos + " negativos " + nulo + " nulos");

		
		entrada.close();
		
		
	}

}
