package pg12_IO_4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer06_IO_4 {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes= new ArrayList<>();
		
		/*clientes.add(new Cliente("Javier", "Madrid", 34));
		clientes.add(new Cliente("Alberto", "Valencia", 34));
		clientes.add(new Cliente("Belén", "Barcelona", 34));

		Collections.sort(clientes, new ComparadorPorNombre());
		System.out.println("ORDENADO POR NOMBRE:");
		mostrar(clientes);
		
		Collections.sort(clientes, new ComparadorPorNombre_Provincia());
		System.out.println("ORDENADO POR PROVINCIA Y NOMBRE:");
		mostrar(clientes);
*/

	}
	
	public static void mostrar (ArrayList<Cliente> clientes) {
		for (Cliente l: clientes) {
			System.out.println(l);
		}
	}

}
