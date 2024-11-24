package pg02_Sentencias_condicionales;

import java.util.*;

public class Ejercicio07sc {

	public static void main(String[] args) {
		
        Scanner entrada= new Scanner (System.in);
        
        int aux;
		
		System.out.println("introduce un número");
		int num1= entrada.nextInt();
		
		System.out.println("Introduce un segundo número");
		int num2= entrada.nextInt();
		
		System.out.println("Introduce un tercer número");
		int num3= entrada.nextInt();
		
			/*En lugar de calcular mayor, intermedio y menor directamente, haremos intercambios
		  para ordenar los números */
		
		//Primero aseguramos que num1 sea el mayor usando intercambio
		
		if (num2>num1) {
			aux= num1; //Guardamos num1 en aux
			num1= num2; //Asignamos el valor de num2 a num1
			num2= aux; // asignamos el valor de aux (originalmente num1) a num2
			
		}
		
		//Paso 2; Aseguramos que num1 sea mayor que num3
		
		if (num3>num1) {
			aux = num1;
			num1=num3;
			num3=aux;
		
		}
		
		//Tercer intercambio: aseguramos que num2 sea mayor que num3
		if (num3>num2) {
			aux= num3;
			num3= num2;
			num2= aux;
		}
		
		System.out.println("Los números de mayor a menor son: " + num1 + " " +num2 +" " +num3);
		
		entrada.close();
		
	}

}
