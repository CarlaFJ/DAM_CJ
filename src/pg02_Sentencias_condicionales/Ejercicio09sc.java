package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio09sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		boolean fechaCorrecta= true;
		
		System.out.print("Introduce un día");
		int dia= entrada.nextInt();
		
		System.out.print("Introduce un mes");
		int mes= entrada.nextInt();
		
		System.out.print("Introduce un año");
		int anyo= entrada.nextInt();
		
		int ultimoDia= 31;
		
		if (mes==2) {ultimoDia=28;}
		if (mes==4 || mes==6 || mes==9 || mes==11) {ultimoDia=30;}
		

		if(dia<1 || dia>ultimoDia) {fechaCorrecta= false;}
		if(mes<1 || mes>12) {fechaCorrecta= false;}
		if (anyo<0) {fechaCorrecta=false;}
		
		if(fechaCorrecta) {
			System.out.println("La fecha es correcta");
		}
		
		else {
			System.out.println("La fecha es incorrecta");
		}
		
		entrada.close();
		
	}

}
