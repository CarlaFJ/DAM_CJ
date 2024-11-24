package pg01_Programacion;
import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		
		String num1 = JOptionPane.showInputDialog("Introduce un número por favor ");
		
		int num_1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Introduce un segundo número");
		
		int num_2 = Integer.parseInt(num2);
		
		System.out.println("El producto de esos números es " + num_1* num_2);

	}

}
