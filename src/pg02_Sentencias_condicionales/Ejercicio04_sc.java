package pg02_Sentencias_condicionales;
import javax.swing.*;
public class Ejercicio04_sc {

	public static void main(String[] args) {
		
		String num1= JOptionPane.showInputDialog("Introduce un número");
		int num_1= Integer.parseInt(num1);
	
		String num2= JOptionPane.showInputDialog("Introduce otro número");
		int num_2= Integer.parseInt(num2);
		
        String num3= JOptionPane.showInputDialog("Introduce otro número");
		int num_3= Integer.parseInt(num3);
		
		int mayor;

		if (num_1 >=num_2 && num_1>=num_3) {
			mayor= num_1;
			System.out.println( num_1 + " es el mayor");
			
		}
			
		else if (num_2 >=num_1 && num_2>=num_3) {
			mayor=num_2;
			System.out.println(num_2+ " es el mayor");
		}
		
		else {
			mayor= num_3;
			System.out.println( num3 + " es el mayor");
		}
	}

}
