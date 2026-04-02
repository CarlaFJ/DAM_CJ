package pg01_Programacion;
import javax.swing.*;
public class Ejercicio05 {

	public static void main(String[] args) {
		
		int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce un primer número"));
		int n2= Integer.parseInt(JOptionPane.showInputDialog("Introduce un primer número"));
		int n3= Integer.parseInt(JOptionPane.showInputDialog("Introduce un primer número"));
		int suma= n1+n2+n3;
		
		System.out.println("La suma es " + suma);
	}

}
