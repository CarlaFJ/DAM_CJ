package pg06_Arrays2;
import java.util.Arrays;
public class Ejer05_Arrays2 {

	public static void main(String[] args) {
		/*Amplíe el ejercicio anterior. Realice un programa que ordene el array por 
		completo.*/
 
		
		int[] aleatorios = {6, 9, 2, 1, 5, 10, 3, 8, 4, 7};

        int menor = aleatorios[0]; 
        int aux = 0;

        System.out.println("El orden inicial es: " + Arrays.toString(aleatorios));

        // Buscamos el menor número
        for (int i = 1; i < aleatorios.length; i++) {
            if (aleatorios[i] < menor) {
                menor = aleatorios[i];
                aux = i; // guardamos la posición del menor
            }
        }

        // Intercambiamos el menor con el primer elemento
        int temp = aleatorios[0];
        aleatorios[0] = menor;
        aleatorios[aux] = temp;

        System.out.println("El nuevo orden es: " + Arrays.toString(aleatorios));
		
	}

}
