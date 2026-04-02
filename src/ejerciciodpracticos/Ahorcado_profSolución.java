package ejerciciodpracticos;
import java.util.*;
public class Ahorcado_profSolución {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		//DEclaración de variables
		
		//La palabra que hay que adiviar
		 char [] palabraOriginal = {'A','L','Q','U','E','R','I', 'A','S'};
		 //Como va el progreso del usuario
	       char [] palabraControl  = {'A','L','Q','U','E','R','I', 'A','S'};
	       //Como le aparecerá al principio al usuario
	       char [] palabraUser     = {'*','*','*','*','*','*','*', '*','*'};
	       
	       boolean haGanado = false; 
	       boolean haPerdido = false;
	       
	       
	       int posicionesAcertadas = 0; 
	       int fallos = 0;
	       
	       
	       //El código pirncipal 
	       do {
	    	   //Muestra el progreso actual de la palabra
	    	   for (int i=0; i<9;i++) System.out.print(palabraUser[i]);
	    	   System.out.println();
	       
	    	   //Pide al usuario introducir una letra
	    	   System.out.print("Introduce letra ");
	    	   char letra = entrada.next().charAt(0);
	       
	    	   boolean acierto = false;
	    	   for (int i=0; i<9;i++)
	    	   if (palabraControl[i]==letra)// Compara la letra ingresada con la letra actual en palabraControl
	    	   {
	    		   palabraUser[i] = letra; //Actualiza el progreso del usuario
	    		   palabraControl[i] ='*'; //Marca esa letra divinada como usada
	    		   acierto = true;
	    		   posicionesAcertadas++; //Incrementa el contador de aciertos
	    	   }
	       
	    	   if (acierto) {
	    		   System.out.println("Has acertado");
	    		   if (posicionesAcertadas == palabraOriginal.length) haGanado =true;
	    	   }
	    	   else {
	    		   System.out.println("Has fallado"); 
	    		   fallos++;
	    		   if (fallos ==3) haPerdido =true;
	    	   }
	       } while(!haGanado && !haPerdido);
	      
	       if (haGanado) System.out.println("Has ganado");  
	       else System.out.println("Has perdido");
	 
	       for (int i=0; i<9;i++) System.out.print(palabraOriginal[i]);

	       entrada.close();
	    
		
		
		
		//PSEUDOCÓDIGO
	       
	       //INICIO

	       /*Declaración de variables
	       Crear un objeto `entrada` para leer datos del usuario
	       palabraOriginal ← ['A', 'L', 'Q', 'U', 'E', 'R', 'I', 'A', 'S']  // La palabra a adivinar
	       palabraControl ← ['A', 'L', 'Q', 'U', 'E', 'R', 'I', 'A', 'S']  // Copia para control de letras usadas
	       palabraUser ← ['*', '*', '*', '*', '*', '*', '*', '*', '*']      // Progreso visible del usuario

	       haGanado ← falso   // Indica si el usuario ganó
	       haPerdido ← falso  // Indica si el usuario perdió

	       posicionesAcertadas ← 0  // Letras correctas descubiertas
	       fallos ← 0               // Intentos fallidos

	        Ciclo principal del juego
	       HACER MIENTRAS (NO haGanado Y NO haPerdido):
	           
	        Mostrar progreso de la palabra al usuario
	           IMPRIMIR palabraUser como cadena

	        Pedir al usuario una letra
	           IMPRIMIR "Introduce una letra: "
	           letra ← PRIMER_CARACTER(DE entrada)

	        Verificar si la letra está en la palabra
	           acierto ← falso
	           PARA i DESDE 0 HASTA longitud(palabraControl) - 1 HACER:
	               SI palabraControl[i */

	       
		
		
		
		
		
		
		
		
		
	}

}
