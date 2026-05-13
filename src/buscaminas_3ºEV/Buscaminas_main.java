package buscaminas_3ºEV;

import javax.swing.JOptionPane;

public class Buscaminas_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean seguirJugando = true;

		JugadorSQL j1 = new JugadorSQL();

		while (seguirJugando) {
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre de usuario");

			jugador jugadorActual = j1.buscarJugador(nombre);

			if (jugadorActual == null) {

				jugadorActual = new jugador(nombre);

				j1.insertarJugador(jugadorActual);

				System.out.println("Nuevo jugador creado.");

			} else {

				System.out.println("Jugador existente.");
			}

			Buscaminas partida = new Buscaminas();

			boolean resultado = partida.jugar();

			if (resultado) {

				jugadorActual.sumarVictoria();

				j1.actualizarVictorias(jugadorActual);

			} else {

				jugadorActual.sumarDerrota();

				j1.actualizarDerrotas(jugadorActual);
			}

			System.out.println();

			System.out.println("Estadísticas de " + jugadorActual.getNombreJugador());

			System.out.println("Ganadas: " + jugadorActual.getPartidasGanadas());

			System.out.println("Perdidas: " + jugadorActual.getPartidasPerdidas());

			System.out.println();

			String opcion = JOptionPane.showInputDialog("¿Quieres jugar otra partida? (SI/NO)");

			if (opcion.equalsIgnoreCase("no")) {

				seguirJugando = false;

			} else if (opcion.equalsIgnoreCase("si")) {

				System.out.println("Nueva partida");

			} else {

				System.out.println("Respuesta no válida. " + "Se iniciará otra partida por defecto.");
			}
		}

		System.out.println("Programa finalizado.");

	}

}
