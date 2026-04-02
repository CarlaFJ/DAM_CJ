package pg11_IO_3;

import java.util.ArrayList;

public class Ejer06_IO_3 {

	public static void main(String[] args) {
		
		ArrayList<Persona> p= new ArrayList<>(); //Creo el ArrayList
		
		//Creo los tres objetos Persona
		Fecha[] fechas1 = new Fecha[3];//creo el array 
	     fechas1[Persona.FNacimiento] = new Fecha(1, 3, 2006); //Creo las fechas
	     fechas1[Persona.FBoda]      = new Fecha(1, 6, 2030);
	     fechas1[Persona.FTrabajo]   = new Fecha(1, 9, 2025);
	     Persona p0 = new Persona("Carla", fechas1); //Ahora si creo este objeto en el ArrayList
	     
	     
	     Fecha[] fechas2 = new Fecha[3];
	     fechas2[Persona.FNacimiento] = new Fecha(5, 7, 1999);
	     fechas2[Persona.FBoda]      = new Fecha(10, 10, 2022);
	     fechas2[Persona.FTrabajo]   = new Fecha(1, 2, 2020);
	     Persona p1 = new Persona("Joaquin", fechas2);
	     

	     Fecha[] fechas3 = new Fecha[3];
	     fechas3[Persona.FNacimiento] = new Fecha(20, 12, 1985);
	     fechas3[Persona.FBoda]      = new Fecha(15, 6, 2010);
	     fechas3[Persona.FTrabajo]   = new Fecha(3, 4, 2029);
	     Persona p2 = new Persona("Ana", fechas3);
		
		//Añado los 3 objetos al ArrayList con .add
	     p.add(p0);
	     p.add(p1);
	     p.add(p2);
	     
	     //For each para imprimir la información del ArrayList
	     for (Persona pp:p) {
	    	 System.out.println(pp);
	     }

	}

}
