package pg12_IO_4;

import java.util.Comparator;

public class ComparadorPorTitulo implements Comparator<Libro> {

	 @Override
	 //Compara solo por título
	    public int compare(Libro l1, Libro l2) {
	        return l1.getNombre().compareToIgnoreCase(l2.getNombre());
	    }
}
