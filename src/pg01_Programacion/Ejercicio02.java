package pg01_Programacion;
import java.util.*;
public class Ejercicio02 {

	public static void main(String[] args) {
		

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int primer_num= entrada.nextInt();
		
		System.out.println("introduce un segundo número");
		int segundo_num= entrada.nextInt();
		
		int tercer_num= primer_num+segundo_num ;
		
		System.out.println("La suma de los números que has introducido es " + tercer_num);
		
		entrada.close();
	}

}
 