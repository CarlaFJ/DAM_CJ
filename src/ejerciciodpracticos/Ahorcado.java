package ejerciciodpracticos;
import javax.swing.*;
public class Ahorcado {

	public static void main(String[] args) {
	
/*Desarrolle el juego del ahorcado. El programa usará una única palabra a 
adivinar, almacenada en un array de caracteres.*/
		
		//Palabra a adivinar
		char[] palabra= {'A','R','R','O','Z'};
		// Copia para controlar las letras ya adivinadas
		char[] palabraControl = palabra.clone();
		//El estado actual de como se encuentra el progreso del jugador
		char[] palabraUsuario = new char[palabra.length];
		for (int i = 0; i < palabraUsuario.length; i++) {
		    palabraUsuario[i] = '*';
		        
		boolean acierto=false;
		boolean fallo= false;
		}

		        // Se inicia el juego con asteriscos
		        for (int i = 0; i < palabraUsuario.length; i++) {
		            palabraUsuario[i] = '*';
		        }
		        
		        boolean hasGanado = false;
		        int posicionesAcertadas = 0; // Lleva la cuenta de cuántas letras se han adivinado
		        
		       
		        while (!hasGanado) {
		            // Mostrar el estado actual de la palabra al usuario
		            String progreso = new String(palabraUsuario);
		            JOptionPane.showMessageDialog(null, "Palabra: " + progreso);
		            
		            //Imprimir "introduce una letra"
		            String entrada = JOptionPane.showInputDialog("Introduce una letra:");
		            if (entrada == null || entrada.length() == 0) {
		                JOptionPane.showMessageDialog(null, "Debes introducir una letra válida.");
		                continue;
		            }
		            char letra = entrada.toUpperCase().charAt(0);
		            
		            // Verificar si la letra está en la palabra
		            boolean acierto = false;
		            for (int i = 0; i < palabraControl.length; i++) {
		                if (palabraControl[i] == letra) {
		                    palabraUsuario[i] = letra; // Actualizar el progreso del jugador
		                    palabraControl[i] = '*'; // Marcar la letra como usada
		                    acierto = true;
		                    posicionesAcertadas++;
		                }
		            }
		            
		           
		            if (acierto) {
		                JOptionPane.showMessageDialog(null, "¡Acertaste!");
		                // Comprobar si ha completado la palabra
		                if (posicionesAcertadas == palabra.length) {
		                    hasGanado = true;
		                }
		            } else {
		                JOptionPane.showMessageDialog(null, "Letra incorrecta. Intenta de nuevo.");
		            }
		        }
		        
		      
		        JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado! La palabra era: " + new String(palabra));

		
		
		
		
		
		
		
		
		

	}

}
