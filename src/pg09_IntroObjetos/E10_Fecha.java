package pg09_IntroObjetos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class E10_Fecha {

	private int dia;
	private int mes;
	private int anyo;

	// Método constructor con parámetros

	public E10_Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	// Método contructor con la fecha actual

	public E10_Fecha() {
		LocalDate hoy = LocalDate.now();
		this.dia = hoy.getDayOfMonth();
		this.mes = hoy.getMonthValue();
		this.anyo = hoy.getYear();
	}

	private static boolean bisiesto(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		return false;
	}

	// Para acceder a este método de manera segura
	public boolean esBisiesto() {
		return bisiesto(this.anyo);
	}

	public boolean equals(E10_Fecha fecha) {
		// Si todo se cumple devuelve un true si no un false

		return this.dia == fecha.dia && this.mes == fecha.mes && this.anyo == fecha.anyo;

	}

	public boolean isposterior(E10_Fecha f) {
		if (this.anyo > f.anyo)
			return true;
		if (this.anyo < f.anyo)
			return false;

		if (this.mes > f.mes)
			return true;
		if (this.mes < f.mes)
			return false;

		return this.dia > f.dia;

	}

	public int CompareTo(E10_Fecha Fech) {

		// Si los años no son iguales se devuelve la resta, el nº negativo= This es
		// anterior a f

		if (this.anyo != Fech.anyo)
			return this.anyo - Fech.anyo;

		// Si los años son iguales pero los meses no se devuelve resta = This anterior a
		// f
		if (this.mes != Fech.mes)
			return this.mes - Fech.mes;

		// Si los años y meses son iguales pero los días no, se devuelve resta = This
		// anterior a f
		return this.dia - Fech.dia;

	}

	public String diaExacto() {
		LocalDate diaSemana = LocalDate.of(this.anyo, this.mes, this.dia); // Crea el objeto fecha
		return diaSemana.getDayOfWeek().toString(); // Crea el objeto día de la semana y si lo queremos imprimir y pasar
													// a texto se usa el toString
	}

	public String diaSemana() {
		LocalDate fecha = LocalDate.of(this.anyo, this.mes, this.dia);
		DayOfWeek dia = fecha.getDayOfWeek();

		switch (dia) {
		case MONDAY:
			return "Lunes";
		case TUESDAY:
			return "Martes";
		case WEDNESDAY:
			return "Miércoles";
		case THURSDAY:
			return "Jueves";
		case FRIDAY:
			return "Viernes";
		case SATURDAY:
			return "Sábado";
		case SUNDAY:
			return "Domingo";
		default:
			return "Desconocido";
		}

	}

	public int diasHastav1(E10_Fecha f) {
		// Convierte esta fecha (this) a LocalDate
		LocalDate fechaActual = LocalDate.of(this.anyo, this.mes, this.dia);

		// Convierte la fecha pasada por parámetro a LocalDate
		LocalDate fechaParametro = LocalDate.of(f.anyo, f.mes, f.dia);

		// Calcula la diferencia en días entre ambas fechas
		// Uso un long por si los días son muchos para que no reviente
		// between es el método y ChronoUnit.DAYS es la unidad de tiempo
		long dias = ChronoUnit.DAYS.between(fechaActual, fechaParametro);

		// Lo convierto en int
		return (int) dias;
	}

	public void plusDias(int dias) {
	    int diasParaSumar = dias;

	    while (diasParaSumar > 0) {
	        int diasTotalesMes = getDiasDelMes(this.mes, this.anyo);
	        int diasRestantesMes = diasTotalesMes - this.dia;

	        if (diasParaSumar > diasRestantesMes) {
	            // Saltamos al mes siguiente
	            diasParaSumar -= (diasRestantesMes + 1); // +1 porque contamos el día actual
	            this.dia = 1;

	            if (this.mes == 12) {
	                this.mes = 1;
	                this.anyo++;
	            } else {
	                this.mes++;
	            }
	        } else {
	            // Queda dentro del mes actual
	            this.dia += diasParaSumar;
	            diasParaSumar = 0;
	        }
	    }
	}


	private static int getDiasDelMes(int mes1based, int anyo) {
		if (mes1based == 2) {
			if (bisiesto(anyo))
				return 29;
			else
				return 28;
		} else if (mes1based == 4 || mes1based == 6 || mes1based == 9 || mes1based == 11) {
			return 30;
		} else {
			return 31;
		}
	}

	/*
	 * if (this.mes == 2) if (bisiesto(this.anyo)) ult_dia = 29; else ult_dia = 28;
	 * 
	 * else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
	 * ult_dia = 30; }
	 * 
	 * else { ult_dia = 31; }
	 * 
	 * this.dia += dias;
	 */

	// Método toString
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}

	// Getters y setters

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
