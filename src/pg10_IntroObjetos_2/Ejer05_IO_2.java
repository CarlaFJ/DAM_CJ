package pg10_IntroObjetos_2;

public class Ejer05_IO_2 {

	public static void main(String[] args) {
		
		//Vector de 3 objetos de la clase Persona
		
		Persona[] lista = new Persona [3];
		
		lista[0] = new Persona ("Steven", new E03_Fecha(14,2,200));
		lista[1] = new Persona ();
		lista[2] = new Persona ("Héctor", new E03_Fecha());
		
		for(int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
		

	}

}
