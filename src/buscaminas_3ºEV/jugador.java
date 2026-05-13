package buscaminas_3ºEV;

public class jugador {

	private final String nombreJugador;
	private int partidasGanadas;
	private int partidasPerdidas;

	////////////////////

	public jugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.partidasGanadas = 0; // Porque cuando creo un jugador nuevo siempre empieza con 0 partidasGanadas o 0
									// partidasPerdidas
		this.partidasPerdidas = 0;
	}

	public jugador(String nombreJugador, int partidasGanadas, int partidasPerdidas) {

		this.nombreJugador = nombreJugador;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
	}

	public void sumarVictoria() {
		partidasGanadas++;
	}

	public void sumarDerrota() {
		partidasPerdidas++;
	}

	public String toString() {
		return "Jugador: " + nombreJugador + " | Ganadas: " + partidasGanadas + " | Perdidas: " + partidasPerdidas;
	}

	//////////////////

	public String getNombreJugador() {
		return nombreJugador;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public int getPartidasPerdidas() {
		return partidasPerdidas;
	}
}
