package buscaMinas_2ºEV;

import javax.swing.JOptionPane;

public class Buscaminas {
	private int numeroMinas;
	private String[][] tableroReal;
	private String[][] tableroJugador;
	private int vidas;
	private boolean victoria;

	////////////////////////////////////////////////////

	public Buscaminas() {
		this.numeroMinas = 6;
		this.tableroReal = new String[8][8];
		this.tableroJugador = new String[8][8];
		this.vidas = 3;
		this.victoria = false;

		inicializarTableroJugador();
		inicializarTableroRealVacio();
	}

	// Para evitar nulls

	public void inicializarTableroJugador() {
		for (int i = 0; i < tableroJugador.length; i++) {
			for (int j = 0; j < tableroJugador[i].length; j++) {
				tableroJugador[i][j] = "-";

			}

		}

	}

	public void inicializarTableroRealVacio() {
		for (int i = 0; i < tableroReal.length; i++) {
			for (int j = 0; j < tableroReal[i].length; j++) {
				tableroReal[i][j] = " ";
			}
		}
	}

	public void printTableroJugador() {
		for (int i = 0; i < tableroJugador.length; i++) {
			for (int j = 0; j < tableroJugador[i].length; j++) {
				System.out.print("|" + tableroJugador[i][j]);
			}
			System.out.println("|");
		}
		System.out.println();
	}

	public void generarMinas() {
		int minasColocadas = 0;

		while (minasColocadas < numeroMinas) {

			int fila = (int) (Math.random() * 8);
			int col = (int) (Math.random() * 8);

			if (!tableroReal[fila][col].equals("*")) {
				tableroReal[fila][col] = "*";
				minasColocadas++;
			}
		}
	}

	public void calcularNumeros() {
		int filaVecina;
		int columnaVecina;

		for (int fila = 0; fila < 8; fila++) {
			for (int columna = 0; columna < 8; columna++) {

				if (!tableroReal[fila][columna].equals("*")) {

					int contadorMinas = 0;

					for (int desplazamientoFila = -1; desplazamientoFila <= 1; desplazamientoFila++) {
						for (int desplazamientoColumna = -1; desplazamientoColumna <= 1; desplazamientoColumna++) {

							filaVecina = fila + desplazamientoFila;
							columnaVecina = columna + desplazamientoColumna;

							if (filaVecina >= 0 && filaVecina < 8 && columnaVecina >= 0 && columnaVecina < 8) {
								if (tableroReal[filaVecina][columnaVecina].equals("*")) {
									contadorMinas++;
								}
							}

						}
					}

					if (contadorMinas > 0) {
						tableroReal[fila][columna] = contadorMinas + "";
					} else {
						tableroReal[fila][columna] = " ";
					}
				}
			}
		}
	}

	public void generarTableroReal() {
		inicializarTableroRealVacio();
		generarMinas();
		calcularNumeros();

	}

	public boolean pedirCoordenadas() {

		boolean coordenadaValida = false;
		boolean haPisadoMina = false;

		while (!coordenadaValida) {

			int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº fila (0|1|2|3|4|5|6|7|):"));

			int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº columna (0|1|2|3|4|5|6|7|):"));

			if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {

				if (tableroJugador[fila][columna].equals("-")) {
					coordenadaValida = true;
					haPisadoMina = revelaCasillas(fila, columna);

				} else {
					JOptionPane.showMessageDialog(null, "Posición ya revelada, vuelve a intentarlo");
				}

			} else {
				JOptionPane.showMessageDialog(null, "Inválido, fila y columna entre 0 y 7");
			}
		}

		return haPisadoMina;

	}

	public boolean revelaCasillas(int fila, int columna) {
		int filaVecina;
		int columnaVecina;

		if (tableroReal[fila][columna].equals("*")) {
			tableroJugador[fila][columna] = "*";
			return true;

		} else {

			for (int desplazamientoFila = -1; desplazamientoFila <= 1; desplazamientoFila++) {
				for (int desplazamientoColumna = -1; desplazamientoColumna <= 1; desplazamientoColumna++) {

					filaVecina = fila + desplazamientoFila;
					columnaVecina = columna + desplazamientoColumna;

					if (filaVecina >= 0 && filaVecina < 8 && columnaVecina >= 0 && columnaVecina < 8) {

						tableroJugador[filaVecina][columnaVecina] = tableroReal[filaVecina][columnaVecina];
					}
				}
			}
		}

		return false;
	}

	public boolean compruebaVictoria() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (!tableroReal[i][j].equals("*") && tableroJugador[i][j].equals("-")) {

					return false;
				}
			}
		}

		return true;
	}

	public boolean jugar() {
		vidas = 3;
		victoria = false;
		generarTableroReal();
		inicializarTableroJugador();

		while (vidas > 0 && !victoria) {

			printTableroJugador();

			boolean minaPisada = pedirCoordenadas();

			if (minaPisada) {

				vidas--;

				System.out.println("¡Has pisado una mina! Te quedan " + vidas + " vidas");

				if (vidas > 0) {
					inicializarTableroJugador();
				} else {
					System.out.println("Fin del juego, has gastado tus tres vidas");
				}

			} else {

				victoria = compruebaVictoria();

				if (victoria) {
					System.out.println("¡Has ganado!");
				}
			}
		}

		return victoria;

	}

}
