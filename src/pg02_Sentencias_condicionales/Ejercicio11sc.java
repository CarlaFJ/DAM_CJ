package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio11sc {

	public static void main(String[] args) {
	
		Scanner entrada= new Scanner (System.in);
		
		boolean fechaCorrecta= true;
		
		System.out.print("Introduce un día");
		int dia= entrada.nextInt();
		
		System.out.print("Introduce un mes");
		int mes= entrada.nextInt();
		
		System.out.print("Introduce un año");
		int anyo= entrada.nextInt();
		
		int ultimodia= 31;
		
		if(mes==2) {ultimodia=28;}
		if (mes==4 || mes==6 || mes==9 || mes==11) {ultimodia=30;}
		
		if(dia<1 || dia>ultimodia) {fechaCorrecta=false;}
		if(mes<1 || mes>12) {fechaCorrecta=false;}
		if(anyo<0) {fechaCorrecta=false;}
		
		dia= dia+1;
		if(dia>ultimodia)
		{dia=1; 
		mes++;
		if(mes>12)
		{mes=1;
		anyo++;}
		}
		
		if (fechaCorrecta) {
			System.out.println("Fecha correcta");
			System.out.println("La fecha de mañana es " + dia + "/" + mes + "/" + anyo);
			}
		
		else {
			System.out.println("Error fecha incorrecta");
		}
		
		entrada.close();
		

	}

}
