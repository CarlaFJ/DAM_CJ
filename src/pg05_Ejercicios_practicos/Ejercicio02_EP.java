package pg05_Ejercicios_practicos;

import javax.swing.*;

public class Ejercicio02_EP {

	public static void main(String[] args) {
		/*
		 * Desarrolle el juego de los barcos con las siguientes premisas. - Considere un
		 * matriz de 5x6 para simular el mar. - Considere un barco que ocupará cuatro
		 * coordenadas, colocado horizontal o verticalmente. - El usuario dispone de
		 * ocho disparos y el objetivo es hundir el barco, para lo cual deberá acertar
		 * en todas sus coordenadas. - Tras cada disparo el programa debe indicar tocado
		 * o agua (una coordenada tocada pasa a ser agua) y, cuando proceda, debe
		 * indicar al usuario que ha ganado o ha perdido. - Debe controlar que las
		 * coordenadas introducidas por el usuario sean correctas.
		 */

		int[][] mar = new int[5][6];
		char[][] marjugador = new char[5][6];
		int disparosposibles = 0;
		int numero = 0;
		int numAciertos = 0;
		boolean acierto = false;
		

		mar[0][0] = 1;
		mar[0][1] = 2;
		mar[0][2] = 3;
		mar[0][3] = 4;
		mar[0][4] = 5;
		mar[0][5] = 6;

		mar[1][0] = 7;
		mar[1][1] = 8; // B
		mar[1][2] = 9; // B
		mar[1][3] = 10; // B
		mar[1][4] = 11; // B
		mar[1][5] = 12;

		mar[2][0] = 13;
		mar[2][1] = 14;
		mar[2][2] = 15;
		mar[2][3] = 16;
		mar[2][4] = 17;
		mar[2][5] = 18;

		mar[3][0] = 19;
		mar[3][1] = 20;
		mar[3][2] = 21;
		mar[3][3] = 22;
		mar[3][4] = 23;
		mar[3][5] = 24;

		mar[4][0] = 25;
		mar[4][1] = 26;
		mar[4][2] = 27;
		mar[4][3] = 28;
		mar[4][4] = 29;
		mar[4][5] = 30;

		// Para imrprimir ~ que simula el mar, imprime el mar visible par el jugador sin
		// el barco
		for (int i = 0; i < marjugador.length; i++) {
			for (int j = 0; j < marjugador[i].length; j++) {
				marjugador[i][j] = 'O';
			}
		}

		do {
		
			for (char[] fila : marjugador) {
				System.out.println();

				for (char z : fila) {
					System.out.print(z + " ");

				}
			}

			System.out.println();
			
			acierto = false;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 30"));
			if (numero == 8) {
				marjugador[1][1] = 'B';
				numAciertos++;
				acierto= true;
				System.out.println();
				System.out.println("Tocado");
			} else if (numero == 9) {
				marjugador[1][2] = 'B';
				numAciertos++;
				acierto=true;
				System.out.println();
				System.out.println("Tocado");
			} else if (numero == 10) {
				marjugador[1][3] = 'B';
				numAciertos++;
				acierto=true;
				System.out.println();
				System.out.println("Tocado");
			} else if (numero == 11) {
				marjugador[1][4] = 'B';
				numAciertos++;
				acierto=true;
				System.out.println();
				System.out.println("Tocado");
			} if(!acierto) {
				disparosposibles++;
				System.out.println();
				System.out.println("Agua \nLLevas " + disparosposibles +"/8 fallos hasta ahora ");
				System.out.println();
				for (int j=0; j<5; j++) {
					for (int z=0; z<6; z++) {
						if(mar[j][z]==numero) {
							marjugador[j][z]= '~';
						}
					}
				}
			}
			
			
			

		} while (disparosposibles < 8 && numAciertos<4);
		
		
		if(disparosposibles==8) {
			System.out.println("¡Has perdido!");
		}
		
		else{
			System.out.println("¡Has ganado! \nHas hundido el barco");
		
		for (char[] fila : marjugador) {
			System.out.println();

			for (char z : fila) {
				System.out.print(z + " ");
				}
			}
		}
		
		
		
		

	}

}
