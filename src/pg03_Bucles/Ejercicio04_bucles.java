package pg03_Bucles;
import java.util.*;
public class Ejercicio04_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int positivo=0;
		int negativo=0;
		
		System.out.print("Introduce un nº por favor (deja de contar al llegar a un 0)");
		int numeros=entrada.nextInt();
		
		while(numeros!=0) {
			if(numeros>0) {
				positivo++;
			}
			else if(numeros<0) {
				negativo++;
			}
			
			System.out.println("Introduce un nº por favor (deja de contar al llegar a un 0)");
			numeros=entrada.nextInt();
		}
		
		System.out.println("Has introducido " + positivo + " números positivos y " + negativo + " números negativos");

		entrada.close();


	}

}
