package pg03_Bucles;
import java.util.*;
public class Ejercicio06_bucles {

	public static void main(String[] args) {
	
		
		Scanner entrada= new Scanner (System.in);
		int mayor=0;
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduce un número por favor");
			int num=entrada.nextInt();
		
			if (num>mayor) {
				mayor=num;
			}
		}	
			
			
		System.out.println("El número mayor es: " + mayor);	
			
		entrada.close();
			
	}

}
