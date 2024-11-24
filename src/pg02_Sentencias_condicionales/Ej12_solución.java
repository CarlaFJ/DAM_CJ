package pg02_Sentencias_condicionales;
import java.util.*;
public class Ej12_solución {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        
	        int nota;
	        
	        System.out.print("Introduce nota (1-10) ");
	        nota = sc.nextInt(); // Suponemos entero entre 1 y 10
	        
	 /*       
	        if     (nota == 1)  System.out.println("Has sacado insuficiente");
	        else if(nota == 2)  System.out.println("Has sacado insuficiente");
	        else if(nota == 3)  System.out.println("Has sacado insuficiente");
	        else if(nota == 4)  System.out.println("Has sacado insuficiente");
	        else if(nota == 5)  System.out.println("Has sacado suficiente");
	        else if(nota == 6)  System.out.println("Has sacado bien");
	        else if(nota == 7)  System.out.println("Has sacado notable");
	        else if(nota == 8)  System.out.println("Has sacado notable");
	        else if(nota == 9)  System.out.println("Has sacado sobresaliente");
	        else if(nota == 10) System.out.println("Has sacado matricula de honor");
	*/        
	        
	        switch(nota) 
	        {
	          case  1: System.out.println("Has sacado insuficiente"); break;
	          case  2: System.out.println("Has sacado insuficiente"); break;
	          case  3: System.out.println("Has sacado insuficiente"); break;
	          case  4: System.out.println("Has sacado insuficiente"); break;
	          case  5: System.out.println("Has sacado suficiente");   break;
	          case  6: System.out.println("Has sacado bien");         break;
	          case  7: System.out.println("Has sacado notable");      break;
	          case  9: System.out.println("Has sacado notable");      break;
	          case 10: System.out.println("Has sacado sobresaliente");break;
	        }

	        
	        sc.close();

	}

}
