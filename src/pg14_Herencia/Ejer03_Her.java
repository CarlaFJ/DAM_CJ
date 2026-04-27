package pg14_Herencia;

import java.time.LocalDate;

public class Ejer03_Her {

	public static void main(String[] args) {
		Persona p1 = new Persona("Juan", "484758393M",LocalDate.of(2006, 3, 1), 84905495);
		Persona p2 = new Persona("Daniel", "4728393D",LocalDate.of(2006, 6, 23), 67372095);
		
		Empleado e1 = new Empleado( "Lola", "484758364B",LocalDate.of(2009, 4, 14), 46905495,"cajero/a", 800);

		Cliente c1 = new Cliente(p2, "Colchón", 80);
		
		
		System.out.println(p1.presentarse());
		
		System.out.println(e1.presentarse());
		
		System.out.println(c1.presentarse());
	}

}
