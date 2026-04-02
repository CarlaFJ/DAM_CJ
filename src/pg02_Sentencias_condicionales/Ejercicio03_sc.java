package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio03_sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un número, por favor");
		
		int num=entrada.nextInt();
		
		if (num<0) {
			System.out.println("Es un nº negativo");
		}
		
		else if (num==0) {
			System.out.println("Es un nº nulo");
		}
		
		else {
			System.out.println("Es un nº positivo");
		}
		
		
		entrada.close();
		
	}

}
