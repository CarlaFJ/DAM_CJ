package pg02_Sentencias_condicionales;
import javax.swing.*;

public class Ejercicio03_sc {

	public static void main(String[] args) {
		
		String num1= JOptionPane.showInputDialog("Introduce un número por favor");
		int num2= Integer.parseInt(num1);
		
		if (num2>0) {
			System.out.println("El número es positivo");
		}
		
		if (num2<0) {
			System.out.println("El número es negativo");
		}
		
		else if(num2==0) {
			System.out.println("El número es nulo");
		}
	}

}
