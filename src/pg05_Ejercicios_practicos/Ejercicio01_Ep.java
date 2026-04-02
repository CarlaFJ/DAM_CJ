package pg05_Ejercicios_practicos;

import javax.swing.*;

public class Ejercicio01_Ep {

	public static void main(String[] args) {

		/*
		 * Desarrolle el juego del ahorcado. El programa usará una única palabra a
		 * adivinar, almacenada en un array de caracteres.
		 */

		char[] PalabraSecreta = { 'E', 'L', 'E', 'C', 'T', 'R', 'O', 'D', 'O', 'M', 'E', 'S', 'T', 'I', 'C', 'O' };
		char[] LetrasIntroducidas = { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' };

		int intentosFallidos = 0;
		boolean acierto = false;
		boolean LetraEncontrada = false;
		char letra = 0;

		do {
			LetraEncontrada = false;
			letra = JOptionPane.showInputDialog("Introduce una letra").toUpperCase().charAt(0);

			// Recorre la palabra para comprobar si la letra existe
			for (int i = 0; i < PalabraSecreta.length; i++) {
				if (PalabraSecreta[i] == letra) {
					LetraEncontrada = true;
					LetrasIntroducidas[i] = letra;
				}
			}

			// Si no se encontró la letra, cuenta un fallo
			if (!LetraEncontrada) {
				intentosFallidos++;
				System.out.println();
				System.out.println("Mal, llevas " + intentosFallidos + " fallos.");
				System.out.println();
				switch (intentosFallidos) {
				case 1:
					System.out.println("   O");
					break;
				case 2:
					System.out.println("   O");
					System.out.println("   |");
					break;
				case 3:
					System.out.println("   O");
					System.out.println("  /|");
					break;
				case 4:
					System.out.println("   O");
					System.out.println("  /|\\");
					break;
				case 5:
					System.out.println("   O");
					System.out.println("  /|\\");
					System.out.println("  / ");
					break;
				case 6:
					System.out.println("   O");
					System.out.println("  /|\\");
					System.out.println("  / \\");
					break;
				}
			}

			// Mostrar progreso actual
			System.out.println();
			System.out.print("Progreso: ");
			for (int j = 0; j < PalabraSecreta.length; j++) {
				System.out.print(LetrasIntroducidas[j] + " ");
			}
			System.out.println("\n");

			// Comprobar si ya se adivinó la palabra completa
			acierto = true;
			for (int z = 0; z < PalabraSecreta.length; z++) {
				if (LetrasIntroducidas[z] != PalabraSecreta[z]) {
					acierto = false;
					break;
				}
			}

		} while (!acierto && intentosFallidos < 7);

		if (acierto) {
			System.out.println("¡Ganaste! La palabra era ELECTRODOMESTICO.");
		} else {
			System.out.println("Perdiste. La palabra era ELECTRODOMESTICO.");
		}

	}

}
