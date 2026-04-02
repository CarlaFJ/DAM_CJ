package pg12_IO_4;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator <Cliente>{
	
	//Compara solo por nombre
	public int compare(Cliente c1, Cliente c2) {
		return c1.getNombre().compareToIgnoreCase(c2.getNombre());
	}

}
