package pg07_Metodos;

import java.time.LocalDate;

public class Ejercicio01_metodos {

	public static void main(String[] args) {
		/*
		 * Desarrolle y utilice un método que reciba tres números enteros y devuelva el
		 * mayor.
		 */

		EmpleadoJOS em1 = new EmpleadoJOS();
		
		String s1="Paco";
		s1.equals("Paco");
		
		LocalDate fechaNacimientoJesus= LocalDate.of(1998, 9, 18);
		
		EmpleadoJOS em2 = new EmpleadoJOS("Jesús", "49338554M", fechaNacimientoJesus);

		System.out.println(em2.getNombre());

		System.out.println(em2.getEdadActual());
		
		System.out.println(em2.toString());
		
		System.out.println(em2.getNombre().equals("joseantonioprimoderivera"));
		
		System.out.println(em2.equals(em1));
		
		int num1 = 23;
		int num2 = 12;
		int num3 = 45;

		int mayor = 0;

		mayor = getMayor(num1, num2, num3);
		int mayorNoob = getMayorNoob(num1, num2, num3);
		
		getMayor(num1, num2, num3);
		
		System.out.print("Mayor como dios manda: " + mayor + "\nMayor novato de mierda: " + mayorNoob);
		
		System.out.println();
		
		

	}

	private static int getMayor(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	private static int getMayor(int a, int b) {
		return Math.max(a, b);
	}

	/**
	 * Esto es lo que haría un puto retrasado comno la Mishel.
	 * 
	 * @param int1
	 * @param int2
	 * @param int3
	 * @return Mayor de entre int1, int2, int3.
	 */
	private static int getMayorNoob(int int1, int int2, int int3) {
		int mayor1 = 0;
		int mayorFinal = 0;

		if (int1 < int2) {
			mayor1 = int2;
		} else {
			mayor1 = int1;
		}

		if (mayor1 < int3) {
			mayorFinal = int3;
		} else {
			mayorFinal = mayor1;
		}

		return mayorFinal;
	}

}
