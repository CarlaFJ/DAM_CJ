package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio06_sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("introduce un número");
		int num1= entrada.nextInt();
		
		System.out.println("Introduce otro número");
		int num2= entrada.nextInt();
		
		System.out.println("Introduce un tercer número");
		int num3= entrada.nextInt();
		
		int mayor = num1;
		if (num2>mayor) mayor = num2;
		if (num3>mayor) mayor = num3;
		
		int menor = num1;
		if (num2<menor) menor = num2;
		if (num3<menor) menor = num3;
		
		int intermedio = num1+num2+num3-mayor-menor;
		
		System.out.println("Los números son " + mayor + " " + intermedio + " " + menor);

		entrada.close();
			
	
		
		

	}

}
