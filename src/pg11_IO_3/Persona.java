package pg11_IO_3;

import java.util.Arrays;

public class Persona  {
	public static final int FNacimiento = 0;
	public static final int FBoda = 1;
	public static final int FTrabajo = 2;
	
	// ...
		
    String nombre;
    Fecha[]  fechas = new Fecha[3];
    
    // ...
    
    public Persona(String nombre, Fecha[] fechas) {
    	this.nombre = nombre;
    	this.fechas[FNacimiento] = fechas[FNacimiento];
    	this.fechas[FBoda] = fechas[FBoda];    	
    	this.fechas[FTrabajo] = fechas[FTrabajo];
    }
    
    // ...

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", fechas:" + Arrays.toString(fechas);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha[] getFechas() {
		return fechas;
	}

	public void setFechas(Fecha[] fechas) {
		this.fechas = fechas;
	}
    
    // ...
    
    
}
