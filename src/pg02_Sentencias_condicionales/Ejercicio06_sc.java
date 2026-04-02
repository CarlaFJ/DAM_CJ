package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio06_sc {

	public static void main(String[] args) {
		

		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un primero nº");
		int num1=entrada.nextInt();
		
		System.out.println("Introduce un segundo nº");
		int num2=entrada.nextInt();
		
		System.out.println("Introduce un tercer nº");
		int num3=entrada.nextInt();
			
		int num_mayor=0 , num_intermedio=0, num_menor=0; //los inicializamos por si da problemas
		
		
		//Lo dividimos por casos para que se tengan en cuenta todas las combinaciones posibles
		//Num1 es el mayor y los demás rotan
		
		if(num1>=num2 && num1>=num3) {
		num_mayor=num1;
		
			if(num2>= num3) {
			num_intermedio= num2;
			num_menor= num3;
			}
			
			else {
			num_intermedio=num3;
			num_menor=num2;
			}
		
		}
		
		//Caso 2: Num2 es el mayor 
		
		else if (num2>=num1 && num2>=num3) { //Importante el else if para que no sean 3 bloques independientes
		num_mayor=num2;
		
			if(num1>=num3) {
			num_intermedio=num1;
			num_menor=num3;
			}
			
			else {
			num_intermedio=num3;
			num_menor=num1;
			}
		}
		
		
		//Caso 3: Num3 es el mayor
		
		else if(num3>=num1 && num3>=num2) {
		num_mayor=num3;
		
			if(num1>=num2) {
			num_intermedio=num1;
			num_menor=num2;
			}
			
			else {
			num_intermedio=num2;
			num_menor=num1;
			}
		}
		
		
		
		System.out.println(num_mayor + " Es el mayor,  " + num_intermedio + " el número intermedio y " + num_menor + " el número menor");
		
		entrada.close();
	}

}
