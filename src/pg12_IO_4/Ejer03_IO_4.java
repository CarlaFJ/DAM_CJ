package pg12_IO_4;

import java.util.ArrayList;

public class Ejer03_IO_4 {

	public static void main(String[] args) {
		ArrayList<Libro> libros = new ArrayList<>();
		
		libros.add(new Libro("Demian", "Herman Hesse","8436737686", 234, 1980 ));
		libros.add(new Libro("Orgullo y prejuicio", "Jane Austen","84365342686", 784, 1813 ));
		libros.add(new Libro("Farenheit 451", "Ray Bradbury","8706737686", 444, 1953 ));
		libros.add(new Libro("Animal Farm", "George Orwell","8436737686", 555, 1980 ));
		libros.add(new Libro("Cien años de soledad", "García Márquez","8436737686", 264, 1960 ));
		
			
		ordenarPorTitulo(libros);
		
		
		//For each para listar los libros ya ordenados
		for(Libro l: libros) {
			System.out.println(l);
		}
	}
	
	
//____________________________________________________________________________________________________________
	
	public static void ordenarPorTitulo(ArrayList<Libro> libros) {
		
		//Recorre el ArrayLis
		//Primer for es el libro que comparo y el segundo con el que lo comparo
		for (int i=0; i<libros.size() -1 ; i++) { //El "-1"" sirve para que no cuente el último ya que este no necesita compararse
			for (int j= i + 1; j<libros.size(); j++) { //j = i + 1 : nunca comparo un libro consigo mismo
				
				
				if (libros.get(j).compareTo(libros.get(i)) < 0) { //Si libro j está mal colocado respecto a libro i (i va antes) entonces intercambiamos
					Libro aux = libros.get(i);//Guardamos temporalmente el libro de i
					libros.set(i, libros.get(j));//Colocamos en i el libro que estaba en j
					libros.set(j, aux); // Colocamos en i el libro que estaba en j
				}
				
			}
		}
	
		
		
	}

}
