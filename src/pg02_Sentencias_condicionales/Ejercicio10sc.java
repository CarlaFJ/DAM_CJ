package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio10sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce una fecha para calcular la fecha del día siguiente");
		System.out.println("introduce un día");
		int dia= entrada.nextInt();
		
		System.out.println("introduce un mes");
		int mes= entrada.nextInt();

		System.out.println("introduce un año");
		int anyo= entrada.nextInt();
		
		int dia_mas=0;
		int mes_mas=0;               
		int anyo_mas=0;
		
		
	
		//Primero el caso de cambio de año
		
		if(dia==30 && mes==12) {
			dia_mas=1;
			mes_mas=1;
			anyo_mas=(anyo+1);
		}
		
		//Segundo el caso de cambio de mes
		
		else if (dia==30) { 
			dia_mas=1;
			mes_mas=(mes+1);
			anyo_mas=anyo;
		}
		
		// Tercero el caso de cambio de dia
		else if (dia<30 ) {
			dia_mas=(dia+1);
			mes_mas=mes;
			anyo_mas=anyo;
		}
		else {
			System.out.println("No puedo calcularlo porque esa fecha no existe");
		}
		
		
		System.out.println(dia_mas + "/" + mes_mas + "/" + anyo_mas);
		
		entrada.close();
		
		
	}

}
