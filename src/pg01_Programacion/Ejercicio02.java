package pg01_Programacion;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca dos números");
		
		int x,y;
		int z;
		
		x=sc.nextInt();
		y=sc.nextInt();
		z= x+y;
		
		System.out.println("La suma de esos dos números es "+ z);
		
		sc.close();
		
	}

}
