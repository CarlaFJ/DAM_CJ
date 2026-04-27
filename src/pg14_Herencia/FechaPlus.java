package pg14_Herencia;

public class FechaPlus extends Fecha{

	public FechaPlus (int d, int m, int a) {
		super(d, m, a);
	}

	@Override
	public String toString() {
		
		String nombreMes = " ";
		
		switch(getMes()) {
		case 1: nombreMes = "enero"; break;
		case 2: nombreMes = "febrero"; break;
		case 3: nombreMes = "marzo"; break;
		case 4: nombreMes = "abril"; break;
		case 5: nombreMes = "mayo"; break;
		case 6: nombreMes = "junio"; break;
		case 7: nombreMes = "julio"; break;
		case 8: nombreMes = "agosto"; break;
		case 9: nombreMes = "septiembre"; break;
		case 10: nombreMes = "octubre"; break;
		case 11: nombreMes = "noviembre"; break;
		case 12: nombreMes = "diciembre"; break;
		}
		
		return getDia() + " de " + nombreMes + " de " + getAnyo();
	}
	
	
	
}
