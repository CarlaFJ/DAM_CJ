package pg11_IO_3;

import java.util.ArrayList;

public class Ejer02_IO_3 {

	public static void main(String[] args) {
		
		ArrayList<Fecha> fechas = new ArrayList<>(); //Aquí creo el ArrayList
		
		//Creo los 3 objetos fecha
		Fecha f1 = new Fecha(1, 3, 2006); 
		Fecha f2 = new Fecha(15, 8, 2020);
		Fecha f3 = new Fecha(31, 12, 2024);

		//Por último añado los objetos al ArrayList
		
		fechas.add(f1);
		fechas.add(f2);
		fechas.add(f3);
		
		//En los ArrayList primero creas el objeto y luego lo introduces dentro de esta
		
		for (Fecha f: fechas) {//For each para recorrer todo el ArrayList e imprimir los elementos de su interior
			System.out.println(f);//Creamos un objeto fecha y en este se van almacenando todos los valores del ArrayList y luego se imprime el valor de este
		}

	}

}

