package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio10sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.print("Introduce un día");
		int dia= entrada.nextInt();
		
		System.out.print("Introduce un mes");
		int mes= entrada.nextInt();
		
		System.out.print("Introduce un año");
		int anyo= entrada.nextInt();
		
		dia= dia+1;
		if(dia>30) {
		dia=1;
		mes= mes+1;
			if (mes>12) {mes= 1;
				anyo++;}
		}
		
		System.out.println("Mañana será " + dia + "/" + mes + "/" + anyo );
		
		entrada.close();
		

	}

}
