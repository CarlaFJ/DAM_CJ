package pg01_Programacion;
import java.util.*;
public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner entrada= new Scanner (System.in);
		
	
		System.out.println("Introduce un número");
		int primer_num= entrada.nextInt();
		
		System.out.println("introduce un segundo número");
		int segundo_num= entrada.nextInt();
		
		int producto= primer_num*segundo_num ;
		
		System.out.println("El producto de los números que has introducido es " + producto);
		
		entrada.close();

	}

}
