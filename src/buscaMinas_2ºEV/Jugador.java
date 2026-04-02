package buscaMinas_2ºEV;

public class Jugador {

	private final String nombreJugador;
	private int partidasGanadas;
	private int partidasPerdidas;

	////////////////////

	public Jugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.partidasGanadas = 0; // Porque cuando creo un jugador nuevo siempre empieza con 0 partidasGanadas o 0 partidasPerdidas
		this.partidasPerdidas = 0;
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
