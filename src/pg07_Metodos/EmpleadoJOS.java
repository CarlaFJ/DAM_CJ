package pg07_Metodos;

import java.time.LocalDate;
import java.util.Objects;

public class EmpleadoJOS {

	private String nombre;
	private String dni;
	private LocalDate fechaNac;
	private int edadActual;
	
	
	public EmpleadoJOS() {
		
		this.nombre= "Alberto";
		this.dni="46372843H";
		this.fechaNac= LocalDate.now();
		this.edadActual= 23;
		
		//int a=2;
		//int b= 3;
		
		//Ejercicio01_metodos.getMayor(a, b);
		
	}
	
	public EmpleadoJOS(String nom, String dni, LocalDate fechaNacimiento) {
		
		this.nombre=nom;
		this.dni= dni;
		this.fechaNac= fechaNacimiento;
		this.edadActual = LocalDate.now().getYear() - fechaNacimiento.getYear();
		
		LocalDate fechaActual = LocalDate.now();
		int anyoActual = fechaActual.getYear();
		
	}

	
	
	@Override
	public String toString() {
		return "EmpleadoJOS \nnombre=" + nombre + ", \ndni=" + dni + ", \nfechaNac=" + fechaNac + ", \nedadActual="
				+ edadActual + "";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(dni, edadActual, fechaNac, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoJOS other = (EmpleadoJOS) obj;
		return Objects.equals(dni, other.dni) && edadActual == other.edadActual
				&& Objects.equals(fechaNac, other.fechaNac) && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(int edadActual) {
		this.edadActual = edadActual;
	}
	


}
