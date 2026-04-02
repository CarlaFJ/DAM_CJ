package pg11_IO_3;

import java.util.ArrayList;

public class Ejer07_IO_3 {

	public static void main(String[] args) {

		String a = "easd";

		String b = "asdja";
		String c = "asdja";
		String h = "hhh";

		String alberto = "Alberto";
		String carla = "Carla";
		String jesus = "Jesús";
		String julen = "Julen";

		ArrayList<String> arr = new ArrayList();

		arr.add(jesus);
		arr.add(julen);
		arr.add(alberto);
		arr.add(carla);

		System.out.println(arr.toString());

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {

				if (arr.get(i).compareTo(arr.get(j)) < 0) {
					String aux = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, aux);
				}

			}
		}

		System.out.println(arr.toString());

		System.out.println("B comparamos con A -> " + b.compareTo(a));
		System.out.println("B comparamos con C -> " + b.compareTo(c));
		System.out.println("C comparamos con A -> " + c.compareTo(a));
		System.out.println("H comparamos con A -> " + h.compareTo(a));
	}

	public static ArrayList<Persona> ordenarPorNombre(ArrayList<Persona> personas) {

		ArrayList<Persona> arrReturn = new ArrayList();
		arrReturn = personas;

		for (int i = 0; i < arrReturn.size(); i++) {
			for (int j = 0; j < arrReturn.size(); j++) {

				if (arrReturn.get(i).nombre.compareTo(arrReturn.get(j).nombre) < 0) {
					Persona aux = arrReturn.get(i);
					arrReturn.set(i, arrReturn.get(j));
					arrReturn.set(j, aux);
				}

			}
		}

		return arrReturn;
	}
	

}
