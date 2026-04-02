package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio04_sc {

	public static void main(String[] args) {
		
	Scanner entrada= new Scanner (System.in);
	
	System.out.println("Introduce un primero nº");
	int num1=entrada.nextInt();
	
	System.out.println("Introduce un segundo nº");
	int num2=entrada.nextInt();
	
	System.out.println("Introduce un tercer nº");
	int num3=entrada.nextInt();
	
	int num_mayor=num1;
	
	
	if (num2>=num1 && num2>=num3) { 
		num_mayor=num2;
	
	}
	
	else if (num3>=num1 && num3>=num2) {
			 num_mayor=num3;
		
	}
	
	
	System.out.println(num_mayor + " Es el número mayor de los tres");
	
	
	
	entrada.close();
	
	
	
	
	}

}
