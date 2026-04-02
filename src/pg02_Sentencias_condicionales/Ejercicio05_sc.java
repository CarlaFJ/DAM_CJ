package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio05_sc {
	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un primero nº");
		int num1=entrada.nextInt();
		int num_menor=num1;
		
		System.out.println("Introduce un segundo nº");
		int num2=entrada.nextInt();
		
		System.out.println("Introduce un tercer nº");
		int num3=entrada.nextInt();
	
		
		
		
		if (num2<=num1 && num2<=num3) { 
			num_menor=num2;
		
		}
		
		else if (num3<=num1 && num3<=num2) {
				 num_menor=num3;
			
		}
		
		System.out.println("Introduciste: " + " " + num1 + " " + num2 + " " + num3 );
		System.out.println(num_menor + " Es el número menor de los tres");
		
		entrada.close();
		
	}

}
