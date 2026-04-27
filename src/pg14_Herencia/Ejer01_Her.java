package pg14_Herencia;

public class Ejer01_Her {

	public static void main(String[] args) {
		

		FechaHora f1 = new FechaHora("7/3/2021 12:40:23");
        FechaHora f2 = new FechaHora("7/3/2021 12:40:23");
        FechaHora f3 = new FechaHora("8/3/2021 10:20:10");

       
        System.out.println(f1);

        // equals
        if (f1.equals(f2)) {
            System.out.println("f1 y f2 son iguales");
        }

        // compareTo
        int comp = f1.compareTo(f3);

        if (comp < 0) {
            System.out.println("f1 es anterior a f3");
        } else if (comp > 0) {
            System.out.println("f1 es posterior a f3");
        } else {
            System.out.println("f1 y f3 son iguales");
        }
		
	}

}
