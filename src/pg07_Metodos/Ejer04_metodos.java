package pg07_Metodos;
public class Ejer04_metodos {

	public static void main(String[] args) {
	/*Desarrolle y utilice el método azaroso() que no recibe parámetros y 
	devuelve un valor aleatorio entero entre 1 y 100. Para ello deberá 
	investigar  el método Math.random(). */

	System.out.println(azaroso());	
		
		
	}

	private static int azaroso() {
		 /*int a =(int)(Math.random()*100)+1; //si no se suma, devuelve entre 0 y 100
		 return a;*/
		
		return (int)(Math.random() * 100) + 1;
	}
}
