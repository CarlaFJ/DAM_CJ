package pg12_IO_4;

public class Almacen {

	private int id;
	private String direccion;
	private String provincia;

	// Constructor

	public Almacen(int id, String direccion, String provincia) {
		this.id = id;
		this.direccion = direccion;
		this.provincia = provincia;
	}

	
	// Método To String
	@Override
	public String toString() {
		return "Id:" + id + ", direccion:" + direccion + ", provincia:" + provincia ;
	}

	//Getters y Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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

	
	
	
}
