package pg14_Herencia;

public class MiString {

	private String texto;

	public MiString(String texto) {
		this.texto = texto;
	}

	// Método que compara dos palabras independientemente de si es mayúscula o
	// minúscula y dice cuál alfabeticamente va antes
	public int compareTo(MiString otro) {

		// Veo cuál de los dos String tiene menos carácteres
		int long1 = this.texto.length();
		int long2 = otro.texto.length();
		int min = Math.min(long1, long2); // Saca el menor

		// Voy a comparar letra por letra solo hasta donde ambos tienen letras

		for (int i = 0; i < min; i++) {

			// Como va letra por eltra necesito saber el nº de la posición de cada uno
			char c1 = this.texto.charAt(i);
			char c2 = otro.texto.charAt(i);

			// Convertir a minúsculas manualemente

			if (c1 >= 'A' && c1 <= 'Z') {
				c1 = (char) (c1 + 32);
			}

			if (c2 >= 'A' && c2 <= 'Z') {
				c2 = (char) (c2 + 32);
			}
			
			
			//Ahora si las letras son distintas devuelvo la diferencia (por lo que se rige el Compare to)
			//-Negativo -> el primero va antes
			//-0 -> son iguales
			//-Positivo -> el segundo va antes
			
			if (c1 != c2) {
				return c1 - c2;
			}

		}
		
		//Si son iguales hasta el final EJ: "hola" termina y "holanda" sigue
		return long1 - long2;
		
	}
}
