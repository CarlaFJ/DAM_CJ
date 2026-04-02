package pg12_IO_4;

import java.util.Comparator;

public class ComparadorPorAutorYTitulo implements Comparator<Libro>{
	
	//Comparamos ahora por Autor y si son del mismo autor entonces por el Nombre
	
	@Override
    public int compare(Libro l1, Libro l2) {

        int resultadoAutor = l1.getAutor().compareToIgnoreCase(l2.getAutor());

        if (resultadoAutor != 0) {
            return resultadoAutor;
        }

        // Si el autor es el mismo, ordenamos por título
        return l1.getNombre().compareToIgnoreCase(l2.getNombre());
    }

}
