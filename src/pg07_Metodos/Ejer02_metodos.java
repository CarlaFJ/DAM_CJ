package pg07_Metodos;
import java.util.*;
public class Ejer02_metodos {

	public static void main(String[] args) {
	/*Desarrolle un método que reciba dos enteros y devuelva un boolean que 
	indique si el segundo parámetro es múltiplo del primero.*/ 

	Scanner entrada= new Scanner (System.in);
	
	System.out.println("Introduce un nº");
	int n1=entrada.nextInt();
	
	System.out.println("Introduce un segundo nº");
	int n2=entrada.nextInt();

	if (calculaMultiplo(n1, n2)) {
		System.out.println("Es multiplo");
	}
	else {
		System.out.println("No es multiplo");
	}
		
	}

	private static boolean calculaMultiplo (int a, int b){
		return b % a == 0;
	}
	
}
