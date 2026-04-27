package pg14_Herencia;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String DNI;
	private LocalDate fechaNac;
	private int numero;

	public Persona(String nombre, String DNI, LocalDate fechaNac, int numero) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.fechaNac = fechaNac;
		this.numero = numero;
	}

	// Método para demostrar polimorfismo

	public String presentarse() {
		return "Hola, soy " + nombre;
	}

	public String toString() {
		return "Nombre: " + nombre + ", DNI: " + DNI + ", fecha de nacimiento: " + fechaNac + ", número:" + numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
