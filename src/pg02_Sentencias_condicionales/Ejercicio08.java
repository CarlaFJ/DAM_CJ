package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.print("Introduce un día ");
		int dia= entrada.nextInt();
		System.out.print("Introduce un mes ");
		int mes= entrada.nextInt();
		System.out.print("Introduce un año ");
		int anyo= entrada.nextInt();
		
		int aux= 0;
		
		if (dia<1) { aux=1;}
		if (dia>30) { aux=1;}
		if (mes<1) {aux=1;}
		if (mes>12) {aux=1;}
		if(anyo<1) {aux=1;}
		
		if (aux==0) {
			System.out.println("La fecha es correcta");
		}
		else {
			System.out.println("Fecha incorrecta");
		}

	}

}
