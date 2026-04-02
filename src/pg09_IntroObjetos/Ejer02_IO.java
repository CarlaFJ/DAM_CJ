package pg09_IntroObjetos;

import java.util.ArrayList;

public class Ejer02_IO {

	public static void main(String[] args) {
		
		E02_Fecha f1= new E02_Fecha (01,03,2006);
		E02_Fecha f2= new E02_Fecha (01,03,2006);
		
		boolean sonIguales = f1.equals(f2);
		
		if (sonIguales) {
			System.out.println("Es la misma fecha");
		}
		else {
			System.out.println("Las fechas no coincides");
		}
	
//_____________________________________________________________________________________________

		E02_Fecha hoy= new E02_Fecha ();
		E02_Fecha fecha1= new E02_Fecha (01,03,2026);
		E02_Fecha fecha2= new E02_Fecha (01,03,2006);
		
		boolean esPosterior = fecha1.isposterior(fecha2);
		boolean esPosterior_hoy = hoy.isposterior(fecha2);
		
		if (esPosterior) {
			System.out.println(fecha1.getDia() + "/" + fecha1.getMes() + "/" + fecha1.getAnyo() + " es posterior a " 
					+  fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnyo() );
			
		}
		else {System.out.println(fecha1.getDia() + "/" + fecha1.getMes() + "/" + fecha1.getAnyo() + " no es posterior a " 
				+  fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnyo());
			
		}
		
		if (esPosterior_hoy) {
			System.out.println(hoy.getDia() + "/" + hoy.getMes() + "/" + hoy.getAnyo() + " es posterior a " 
					+  fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnyo() );
			
		}
		else {System.out.println(hoy.getDia() + "/" + hoy.getMes() + "/" + hoy.getAnyo() + " no es posterior a " 
				+  fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnyo());
			
		}
		
	}

}
