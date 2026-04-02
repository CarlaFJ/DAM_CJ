package buscaMinas_2ºEV;

import javax.swing.*;
import java.util.ArrayList;

public class Buscaminas_main {

	public static void main(String[] args) {

		ArrayList<Jugador> jugadores = new ArrayList<>();
		boolean seguirJugando = true;

		while (seguirJugando) {
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre de usuario");

			Jugador jugadorActual = null;
			boolean encontrado = false;

			for (Jugador j : jugadores) {
				if (j.getNombreJugador().equalsIgnoreCase(nombre)) {
					jugadorActual = j;
					encontrado = true;
				}
			}

			if (!encontrado) {
				jugadorActual = new Jugador(nombre);
				jugadores.add(jugadorActual);
				System.out.println("Nuevo jugador creado.");
			} else {
				System.out.println("Jugador existente.");
			}

			Buscaminas partida = new Buscaminas();

			boolean resultado = partida.jugar();

			if (resultado) {
				jugadorActual.sumarVictoria();
			} else {
				jugadorActual.sumarDerrota();
			}

			System.out.println("Estadísticas de " + jugadorActual.getNombreJugador());
			System.out.println("Ganadas: " + jugadorActual.getPartidasGanadas());
			System.out.println("Perdidas: " + jugadorActual.getPartidasPerdidas());

			String opcion = JOptionPane.showInputDialog("¿Quieres jugar otra partida? Escribe SI o NO");
			if (opcion.equalsIgnoreCase("no")) {
				seguirJugando = false;
			} else if (opcion.equalsIgnoreCase("si")) {
				System.out.println("Nueva partida");
			} else {
				System.out.println("Respuesta no válida, iniciando nueva partida por defecto");
			}
		}

		System.out.println("Programa finalizado.");

	}

}
