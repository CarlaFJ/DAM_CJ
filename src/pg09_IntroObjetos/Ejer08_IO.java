package pg09_IntroObjetos;

public class Ejer08_IO {

	public static void main(String[] args) {
		
		E08_Fecha f = new E08_Fecha();
		E08_Fecha f1 = new E08_Fecha(1,1,1970);

		int dias = f.diasHastav1(f1);
		
		System.out.println(dias);

	}

}
