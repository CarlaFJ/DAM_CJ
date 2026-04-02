package pg12_IO_4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer04_IO_4 {

	public static void main(String[] args) {
		ArrayList<Libro> libros = new ArrayList<>();
		
		libros.add(new Libro("Demian", "Herman Hesse","8436737686", 234, 1980 ));
		libros.add(new Libro("Orgullo y prejuicio", "Jane Austen","84365342686", 784, 1813 ));
		libros.add(new Libro("Farenheit 451", "Ray Bradbury","8706737686", 444, 1953 ));
		libros.add(new Libro("Animal Farm", "George Orwell","8436737686", 555, 1980 ));
		libros.add(new Libro("Cien años de soledad", "García Márquez","8436737686", 264, 1960 ));
		
		Collections.sort(libros);	
		
		//For each para listar los libros ya ordenados
		for(Libro l: libros) {
			System.out.println(l);
		}
	}

}
