package pg12_IO_4;

import java.util.ArrayList;

public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private String provincia;
	private ArrayList <Almacen> almacenes;
	int edad;

	// Constructor

	public Cliente(int id, String nombre, String direccion, String provincia, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.provincia = provincia;
		this.almacenes = new ArrayList<>(); //No la paso por parámetro, la creo vacía
		this.edad = edad;
		
	}
	
	//Ahora metemos los objetos almacen en la lista vacía
	public void addAlmacen (Almacen a) {
		almacenes.add(a);
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", provincia:" + provincia + ", edad:" + edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public ArrayList<Almacen> getAlmacenes() {
		return almacenes;
	}

	
	
	
	
}
