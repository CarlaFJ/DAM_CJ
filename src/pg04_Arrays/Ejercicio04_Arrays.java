package pg04_Arrays;
import javax.swing.*;
public class Ejercicio04_Arrays {

	public static void main(String[] args) {
		/* Programa que obtenga las 10 notas numéricas enteras (de 0 a 10) 
		correspondientes a la calificación de cada uno de los miembros de un 
		tribunal de oposición. El programa debe obtener e imprimir la nota media. 
		Considere que si la mejor calificación y la peor difieren en 3 o más puntos 
		ambas se eliminan del cálculo de la media.*/
		
		int[] nota=new int[10];
		int suma=0;
		
		for (int i=0; i<10; i++) {
			nota[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 notas (de 1-10)" + 
		"\nNúmero " + (i+1) ));
			suma= suma + nota[i];
		}
		
		
		int MayorNota = nota[0];
		int MenorNota = nota [0];
	
		for (int i=0; i<10; i++) {
			if (nota[i]>MayorNota) {
				MayorNota=nota[i];
			}
			else if (nota[i]<MenorNota) {
				MenorNota=nota[i];
			}
		}
		
		
		int NumNotas=10;
		
		if(MayorNota - MenorNota >= 3) {
			NumNotas=8;
			suma= suma - MayorNota - MenorNota;
		}
		
		
		int media= suma / 10;
		
	JOptionPane.showMessageDialog(null, "La media de las notas es: " + media);
		
		
	}

}
