package pg09_IntroObjetos;
import java.util.*;
public class Ejer01_IO {
	public static void main(String[] args) {

		/*
		 * No está mal pero el problema es que Ahora mismo en el main estás
		 * reconstruyendo el toString() a mano, cuando ya lo has programado. Por lo
		 * tanto una vez hecho el método toString java ya lo usa automáticamente
		 * Ejer01_Fecha Fecha_actual= new Ejer01_Fecha();
		 * System.out.print(Fecha_actual.getDia() + "/");
		 * System.out.print(Fecha_actual.getMes() + "/");
		 * System.out.print(Fecha_actual.getAnyo() + " es la fecha de hoy");
		 */

		// Constructor SIN parámetros (fecha actual)
		Ejer01_Fecha fechaActual = new Ejer01_Fecha();
		System.out.println("Fecha actual: " + fechaActual);

		// Constructor CON parámetros
		Ejer01_Fecha fechaNacimiento = new Ejer01_Fecha(01, 03, 2006);
		System.out.println("Mi fecha de nacimiento es: " + fechaNacimiento);
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce un día");
		int dia= entrada.nextInt();
		
		System.out.println("Introduce un mes");
		int mes= entrada.nextInt();
		
		System.out.println("Introduce un año");
		int anyo= entrada.nextInt();
		
		Ejer01_Fecha fechaUsuario = new Ejer01_Fecha(dia, mes, anyo);
		//System.out.println("La fecha introducida es: " + fechaUsuario);

		if (fechaUsuario.esBisiesto()) {
			System.out.println(fechaUsuario + " es un año bisiesto");
		} else {
			System.out.println(fechaUsuario + " no es un año bisiesto");
		}


	}
}
