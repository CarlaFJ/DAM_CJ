package pg12_IO_4;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String Cliente_ejer08;

	// constructor

	public Vehiculo(String matricula, String marca, String Cliente_ejer08) {
		this.matricula = matricula;
		this.marca = marca;
		this.Cliente_ejer08 = Cliente_ejer08;

	}

	// Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getClienteTitular() {
		return Cliente_ejer08;
	}

	public void setClienteTitular(String clienteTitular) {
		this.Cliente_ejer08 = Cliente_ejer08;
	}

}
