package pg12_IO_4;

public class Ejer01_IO_4 {

	public static void main(String[] args) {
		 Libro libro1 = new Libro(
				 "El Quijote de la Mancha",
				 "Miguel de Cervantes",
				 "8431673966",
				 478,
				 1678);
		 
		 Libro libro2 = new Libro(
				 "El Quijote de la Mancha",
				 "Miguel de Cervantes",
				 "8431673966",
				 478,
				 1678);
		 
	
		 boolean mismo = mismoLibro(libro1, libro2);
		 
		 if (mismo== true) {
			 System.out.println("Son el mismo libro");
		 }
		 else {
			 System.out.println("Son distinto libro");
		 }
		 
	}
	
	public static boolean mismoLibro (Libro l1, Libro l2) {
		 // Si alguno es null, no pueden ser el mismo libro
	    if (l1 == null || l2 == null) {
	        return false;
	    }

	    // Comparo el ISBN y si son iguales son el mismo libro
	    return l1.getIsbn().equals(l2.getIsbn());
	
	}
			

}
