package pg12_IO_4;

public class Libro implements Comparable<Libro>{
	private String nombre;
	private String autor;
	private String isbn;
	private int numPaginas;
	private int anioPublicacion;
	
	//Constructor
	
	public Libro(String nombre, String autor, String isbn, int numPaginas, int anioPublicacion) {
		this.nombre = nombre;
		this.autor = autor;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.anioPublicacion = anioPublicacion;
		
		
	}
	
	public boolean isMenor(Libro otro) {
		//Si este texto/nombre va antes en el abecedario, primero devuelve negativo y si es negativo devuelve true
		//Compara los nombres de los libros ignorando si estan en mayúaculas o no y devuelve true si da un nº negativo
		
		return this.nombre.compareToIgnoreCase(otro.nombre) <0 ;  
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", autor=" + autor + ", isbn=" + isbn;
	}

	public int compareTo(Libro otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
        
    }
	
	/*Plantilla del método Comparte to (se usa para poder comparar fuera de esta clase)
	 * 
	 * public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }*/
	

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	
	

}
