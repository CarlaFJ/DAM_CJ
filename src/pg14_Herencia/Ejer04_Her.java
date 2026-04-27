package pg14_Herencia;

public class Ejer04_Her {

	public static void main(String[] args) {
		
		MiString a = new MiString ("Hola");
		MiString b = new MiString ("hola");
		MiString c = new MiString ("Holanda");
		
		
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		
	}

}
