package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio11sc {

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
		int ult_dia=0;
		int mes_mas=0;               
		int anyo_mas=0;
		
		//--------------------------------------------------------------------------------------------------------------
		
		if(mes==2) {
			ult_dia= 28;
		}
		
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			ult_dia= 30;
		}
		 
		else {
			ult_dia= 31;
		}
		
	
		//Primero el caso de cambio de año
		
		if(dia==31 && mes==12) {
			dia_mas=1;
			mes_mas=1;
			anyo_mas=(anyo+1);
		}
		
		//Segundo el caso de cambio de mes
		
		else if (dia==ult_dia) { 
			dia_mas=1;
			mes_mas=(mes+1);
			anyo_mas=anyo;
		}
		
		// Tercero el caso de cambio de dia
		else if (dia<ult_dia) {
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
