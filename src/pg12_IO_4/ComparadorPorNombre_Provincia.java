package pg12_IO_4;

import java.util.Comparator;

public class ComparadorPorNombre_Provincia implements Comparator<Cliente> {

	// Comparador por provincia y nombre

	public int compare(Cliente c1, Cliente c2) {

		int resultadoProvincia = c1.getProvincia().compareToIgnoreCase(c2.getProvincia());

		if (resultadoProvincia != 0) {
			return resultadoProvincia;
		}

		return c1.getNombre().compareToIgnoreCase(c2.getNombre());

	}

}
