package pg14_Herencia;

import java.time.LocalDate;

public class Empleado extends Persona {

	private String puesto;
	private int sueldo;

	public Empleado(String nombre, String DNI, LocalDate fechaNac, int numero, String puesto, int sueldo) {
		super(nombre, DNI, fechaNac, numero);
		this.puesto = puesto;
		this.sueldo = sueldo;
	}

	public String presentarse() {
		return super.presentarse() + " soy empleado/a y mi puesto de trabajo es  " + puesto;
	}

	public String toString() {
		return "Puesto:" + puesto + ", sueldo: " + sueldo;
	}

}
