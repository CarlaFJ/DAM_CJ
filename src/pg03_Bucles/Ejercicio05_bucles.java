package pg03_Bucles;
import java.util.*;
public class Ejercicio05_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int entre_uno_diez=0;
		int mayor_diez=0;
		
		
		
		for (int i=0;i<10;i++) {
			System.out.println("Introduce un número por favor");
			int num=entrada.nextInt();
			
			
			if (num<=10) {entre_uno_diez++;}
	 
			else {
				mayor_diez++;
			}
		} 		
		
		
		System.out.println("De los 10 nº hay " + entre_uno_diez + " números entre 1-10 y " + mayor_diez + 
		" números mayores de 10");
		
		entrada.close();
		
	}

}
