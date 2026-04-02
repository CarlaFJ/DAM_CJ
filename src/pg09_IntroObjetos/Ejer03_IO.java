package pg09_IntroObjetos;

public class Ejer03_IO {

	public static void main(String[] args) {
		E03_Fecha f = new E03_Fecha();
		E03_Fecha f1 = new E03_Fecha(6,3,2006);
		E03_Fecha f2 = new E03_Fecha(18,9,1998);
		
		int resultado = f.CompareTo(f1);
		
		if (resultado < 0) {
		    System.out.println(f + " es anterior a " + f1);
		} else if (resultado > 0) {
		    System.out.println(f + " es posterior a " + f1);
		} else {
		    System.out.println(f + " es igual a " + f1);
		}

	}

}
