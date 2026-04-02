package pg12_IO_4;

import java.util.ArrayList;

public class Cliente_ejer08 {

	private int id;
	private String nombre;
	private String direccion;
	private String provincia;
	private ArrayList <Vehiculo> vehiculos;
	
	//Método constructor
	
	public Cliente_ejer08 (int id, String nombre, String direccion, String provincia) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.provincia = provincia;
		this.vehiculos = new ArrayList<>(); //No la paso por parámetro, la creo vacía
	}
	
	//Meto los objetos vehiculo en la lista vacía
	public void addVehiculo (Vehiculo a) {
		vehiculos.add(a);
	}

	@Override
	public String toString() {
		return "ID:" + id + ", nombre:" + nombre + ", direccion:" + direccion + ", provincia:"
				+ provincia;
	}

	
	//Getters y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

		
}
