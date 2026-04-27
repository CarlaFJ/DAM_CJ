package pg14_Herencia;

import java.time.LocalDate;

public class Cliente extends Persona {

	private String nombre_producto;
	private int presupuesto;

	public Cliente(Persona p, String nombre_producto, int presupuesto) {
		super(p.getNombre(), p.getDNI(), p.getFechaNac(), p.getNumero());
		this.nombre_producto = nombre_producto;
		this.presupuesto = presupuesto;
	}

	public String presentarse() {
		return super.presentarse() + " soy cliente  y estoy buscando un/una " + nombre_producto + " y mi presupuesto es de "
				+ presupuesto;
	}

	public String toString() {
		return "Producto: " + nombre_producto + ", presupuesto:" + presupuesto;
	}

}
