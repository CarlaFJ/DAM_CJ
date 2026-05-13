package buscaminas_3ºEV;

import java.sql.*;

public class JugadorSQL {

	public jugador buscarJugador(String nombreJugador) {

		jugador j = null;

		String sql = "SELECT * FROM jugadores WHERE nombreJugador = ?";

		try (Connection conexion = ConexionBD.obtenerConexion();

				PreparedStatement sentencia = conexion.prepareStatement(sql)) {

			sentencia.setString(1, nombreJugador);

			ResultSet resultado = sentencia.executeQuery();

			if (resultado.next()) {

				int ganadas = resultado.getInt("partidasGanadas");

				int perdidas = resultado.getInt("partidasPerdidas");

				j = new jugador(nombreJugador, ganadas, perdidas);
			}

		} catch (SQLException e) {

			System.out.println("Error al buscar jugador: " + e.getMessage());
		}

		return j;
	}

	public void insertarJugador(jugador j) {

		String sql = "INSERT INTO jugadores VALUES (?, ?, ?)";

		try (Connection conexion = ConexionBD.obtenerConexion();

				PreparedStatement sentencia = conexion.prepareStatement(sql)) {

			sentencia.setString(1, j.getNombreJugador());

			sentencia.setInt(2, j.getPartidasGanadas());

			sentencia.setInt(3, j.getPartidasPerdidas());

			sentencia.executeUpdate();

		} catch (SQLException e) {

			System.out.println("Error al insertar jugador: " + e.getMessage());
		}
	}

	public void actualizarVictorias(jugador j) {

		String sql = "UPDATE jugadores " + "SET partidasGanadas = ? " + "WHERE nombreJugador = ?";

		try (Connection conexion = ConexionBD.obtenerConexion();

				PreparedStatement sentencia = conexion.prepareStatement(sql)) {

			sentencia.setInt(1, j.getPartidasGanadas());

			sentencia.setString(2, j.getNombreJugador());

			sentencia.executeUpdate();

		} catch (SQLException e) {

			System.out.println("Error al actualizar victorias: " + e.getMessage());
		}
	}

	public void actualizarDerrotas(jugador j) {

		String sql = "UPDATE jugadores " + "SET partidasPerdidas = ? " + "WHERE nombreJugador = ?";

		try (Connection conexion = ConexionBD.obtenerConexion();

				PreparedStatement sentencia = conexion.prepareStatement(sql)) {

			sentencia.setInt(1, j.getPartidasPerdidas());

			sentencia.setString(2, j.getNombreJugador());

			sentencia.executeUpdate();
			
			
			

		} catch (SQLException e) {

			System.out.println("Error al actualizar derrotas: " + e.getMessage());
		}
	}

}
