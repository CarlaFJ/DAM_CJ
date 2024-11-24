package pg02_Sentencias_condicionales;
import java.util.*;
public class Ejercicio12sc {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce tu nota 1-10 ");
		int nota= entrada.nextInt();
		
		//Suponemos un entero entre 1 y 10
		
	/*	if (nota<5) {
			System.out.println("Insuficiente");}
		
		else if (nota==5) {System.out.println("Suficiente");}
		else if(nota==6) {System.out.println("Bien");	}
		else if (nota==7 || nota==8) {System.out.println("Notable");}
		else if (nota==9 || nota==10) {System.out.println("Sobresaliente");}
		
		else {System.out.println("Dato incorrecto");}*/
		
		switch(nota) {
		case 1:  
        case  2: 
        case  3: 
        case  4: System.out.println("Insuficiente");                     break;
        case  5: System.out.println("Suficiente");                       break;
        case  6: System.out.println("Bien");                             break;
        case  7: 
        case  8: System.out.println("Notable");                          break;
        case  9: System.out.println("Sobrealiente");                     break;
        case 10: System.out.println("Sobresaliente (Mención de Honor)"); break;
        default: System.out.println("Dato incorrecto");                  break;
      }

      
      entrada.close();
	

	}

}
