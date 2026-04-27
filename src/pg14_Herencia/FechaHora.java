package pg14_Herencia;

public class FechaHora extends Fecha {
	private int hora;
	private int minutos;
	private int segundos;

	// Sobrecarga de constructores

	public FechaHora() {
	}

	public FechaHora(int dia, int mes, int anyo, int hora, int minutos, int segundos) {
		super(dia, mes, anyo);
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;

	}

	// Método auxiliar del constructor

	private static String obtenerFecha(String fh) {
		int i = 0;

		while (fh.charAt(i) != ' ') {
			i++;
		}

		return fh.substring(0, i);
	}

	// Constructor para formatos: d(d)/m(m)/aaaa (h)h:(m)m:(s)s,
	public FechaHora(String fh) {

		// Uso la herencia para la parte de fecha
		super(obtenerFecha(fh));
		int i = 0;

		// Hay que buscar el espacio otra vez (para hora) para separar fecha de hora:
		// [FECHA] ESPACIO [HORA]
		while (fh.charAt(i) != ' ') { // Mientras el caractar no sea un espacio sigue
			i++;
		}

		int espacio = i;

		// Ahora con la hora

		i = espacio + 1; // Empieza a leer justo despúes del espacio

		while (fh.charAt(i) != ':') {
			i++;
		}
		int pri_dospuntos = i;

		i++;

		while (fh.charAt(i) != ':') {
			i++;
		}

		int seg_dospuntos = i;

		hora = 0;
		segundos = 0;
		minutos = 0;

		// Convierte los caracteres de la hora en un numero;
		for (i = espacio + 1; i < pri_dospuntos; i++) {
			hora = hora * 10 + fh.charAt(i) - 48;
		}

		// Convierte los caracteres de los minutos en un numero;
		for (i = espacio + 1; i < pri_dospuntos; i++) {
			minutos = minutos * 10 + fh.charAt(i) - 48;
		}

		// Convierte los caracteres de los segundos en un numero;
		for (i = espacio + 1; i < pri_dospuntos; i++) {
			segundos = segundos * 10 + fh.charAt(i) - 48;
		}

	}

	public int compareTo(FechaHora fh) {

		// Comparar la fecha usando el padre
		int comp = super.compareTo(fh);

		// Si la fecha ya es distinta, devolvemos ese resultado
		if (comp != 0) {
			return comp;
		}

		// Comparar hora
		if (this.hora != fh.hora) {
			return this.hora - fh.hora;
		}

		// Comparar minuto
		if (this.minutos != fh.minutos) {
			return this.minutos - fh.minutos;
		}

		// Comparar segundo
		return this.segundos - fh.segundos;
	}

	// Usar el to String padre y añadir la hora

	public String toString() {
		return super.toString() + " " + hora + ":" + minutos + ":" + segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

}
