package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio12sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
      System.out.println("Introduce tu calificación por favor, sin décimales");
      int nota=entrada.nextInt();
      
      String resultado_nota;
      
      switch (nota) {
      case 8, 9, 10:
    	  resultado_nota= "Sobresaliente";
    	  break;
    	  
      case 5, 6, 7:
    	  resultado_nota= "Suficiente";
    	  break;
    	  
      default:
    	  resultado_nota="Insuficiente";
          break;
      
      }
      
      System.out.println("Tu calificación es: " + resultado_nota);
      
      
      
      entrada.close();
	}

}
