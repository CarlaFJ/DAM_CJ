package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio09sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int fin_de_mes=0;
		boolean fechacorrecta= true;
		
		System.out.println("introduce un día");
		int dia= entrada.nextInt();
		
		System.out.println("introduce un mes");
		int mes= entrada.nextInt();

		System.out.println("introduce un año");
		int anyo= entrada.nextInt();

		
		
		//Primero nos ocupammos de los días
		
		if(mes==2) {
			fin_de_mes= 28;
		}
		
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			fin_de_mes= 30;
		}
		 
		else {
			fin_de_mes= 31;
		}
		
	
		
		
	//Ahora de los días, meses y años
		
		if(dia<1 || dia>fin_de_mes) {
			 fechacorrecta=false ;
		}
		else if (mes<1 || mes>12) {
			fechacorrecta=false;
		}
		
		else if (anyo<1 || anyo>2025){
			fechacorrecta=false;
		}
		
		
		
		if(fechacorrecta) {
			System.out.println("La fecha es correcta");
		}
		else {
			System.out.println("Error...    Fecha inexistente");
		}
		
		
		
		
		//La lógica del boolean:
		/* fechacorrecta = true; “Empiezo asumiendo que todo está bien.”

         if (...) fechacorrecta = false; “Encontré un fallo, así que ya no lo está.”

         if (fechacorrecta)  “Si sigue sin fallar nada, confirmo que la fecha es correcta.”*/
		
		
		
		
		
	}

}
