package pg08_Ej_practicos02;
import javax.swing.JOptionPane;
public class Buscaminas_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		buscaminas();

	}

	private static boolean buscaminas() {
		String[][] tableroReal = { { " ", " ", "1", "*", "1", " ", " ", " " },
								   { " ", " ", "1", "1", "1", " ", " ", " " }, 
								   { " ", " ", " ", " ", "1", "1", "1", " " },
								   { " ", " ", " ", " ", "1", "*", "2", "1" }, 
								   { " ", " ", " ", " ", "2", "3", "*", "2" },
								   { " ", " ", "1", "1", "2", "*", "3", "*" }, 
								   { " ", " ", "1", "*", "2", "1", "2", "1" },
								   { " ", " ", "1", "1", "1", " ", " ", " " } };

	
		String[][] tableroJugador = { { "-", "-", "-", "-", "-", "-", "-", "-" },
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" }, 
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" },
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" }, 
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" },
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" }, 
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" },
				   					  { "-", "-", "-", "-", "-", "-", "-", "-" } };
		
		int vidas= 3;
		boolean victoria= false;
		
		while (vidas > 0 && !victoria) {
		    printTablero(tableroJugador);
		    boolean minaPisada = pedirCoordenadas(tableroJugador, tableroReal); 
		    if (minaPisada) {
		        vidas--;
		        System.out.println("¡Has perdido! Te quedan " + vidas + " vidas");
		        if (vidas > 0) {
		            for (int i = 0; i < 8; i++)
		                for (int j = 0; j < 8; j++)
		                	
		                   tableroJugador[i][j] = "-";
		                    
		           
		        }else if(vidas==0) {
		        	System.out.println("Fin de juego");
		        	break;
		        }
		    }
		    if (!minaPisada) {
		        victoria = compruebaVictoria(tableroJugador, tableroReal);
		    }
		}
		if (victoria) System.out.println("¡Has ganado!");

		return true;
	}

	private static void printTablero(String[][] tableroJugador) {

		for (int i = 0; i < tableroJugador.length; i++) {
			for (int j = 0; j < tableroJugador[i].length; j++) {
				System.out.print("|" + tableroJugador[i][j]);
			}
			System.out.println("|");
		}

		System.out.println();
	}

	private static boolean pedirCoordenadas(String[][] tableroJugador, String[][] tableroReal ) {
		
		while (true) {
	        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº fila (0|1|2|3|4|5|6|7|):"));
	        int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº columna (0|1|2|3|4|5|6|7|):"));

	        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
	            JOptionPane.showMessageDialog(null, "Inválido, fila y columna tienen que estar entre 0-7");
	            continue; 
	        }

	        String posicion = tableroJugador[fila][columna];

			if (posicion.equals("-")) {
				return revelaCasillas(fila, columna, tableroJugador, tableroReal);
	            
	        }else {
	        	JOptionPane.showMessageDialog(null, "Posición revelada, vuelve a intentarlo");
	        } 
	        
		}
		
	}

	private static boolean revelaCasillas( int fila, int columna , String[][] tableroJugador, String[][] tableroReal) {
		int filaVecina=0;
		int columnaVecina=0;
		
		 if (tableroReal[fila][columna].equals("*")) {
		        tableroJugador[fila][columna] = "*"; 
		        return true; 
		    }
		
		 for (int desplazamientoFila = -1; desplazamientoFila <= 1; desplazamientoFila++) {
		        for (int desplazamientoColumna = -1; desplazamientoColumna <= 1; desplazamientoColumna++) {

		            filaVecina = fila + desplazamientoFila;
		            columnaVecina = columna + desplazamientoColumna;

		          
		            if (filaVecina >= 0 && filaVecina < 8 && columnaVecina >= 0 && columnaVecina < 8) {

		   
		                tableroJugador[filaVecina][columnaVecina] = tableroReal[filaVecina][columnaVecina];
		            }
		           
		        }
		        
		    }


		    return false;
	}
	
	  private static boolean compruebaVictoria(String[][] tableroJugador,String[][] tableroReal) {
		  for (int i = 0; i < 8; i++) {
		        for (int j = 0; j < 8; j++) {
		            if (!tableroReal[i][j].equals("*") && tableroJugador[i][j].equals("-")) {
		               
		            	return false;
		            }
		        }
		    }
		  
		  return true;
	  }
	 
}
