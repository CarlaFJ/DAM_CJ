package pg09_IntroObjetos;

public class Ejer07_IO {

	public static void main(String[] args) {
		E07_Fecha f = new E07_Fecha();
		E07_Fecha f1 = new E07_Fecha(1,1,1970);

		System.out.println(f1.diaSemana());
		System.out.println(f.diaSemana());

	}

}
