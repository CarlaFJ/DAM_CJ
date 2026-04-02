package pg10_IntroObjetos_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class E03_Fecha {
	private int dia;
	private int mes;
	private int anyo;

	// Método constructor con parámetros

	public E03_Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	// Método contructor con la fecha actual

	public E03_Fecha() {
		LocalDate hoy = LocalDate.now();
		this.dia = hoy.getDayOfMonth();
		this.mes = hoy.getMonthValue();
		this.anyo = hoy.getYear();
	}
	
	//Método constructor del ejercicio
	
	/*public E03_Fecha(String textoFecha) {
		//Saco la posición númerica de la primera y segunda barra
		int primeraBarra= textoFecha.indexOf("/");
		int segundaBarra= textoFecha.lastIndexOf("/");
		
		
		//Ahora saco el día, el mes y el año
		String diaTexto = textoFecha.substring(0, primeraBarra);
		String mesTexto = textoFecha.substring (primeraBarra + 1, segundaBarra);
		String anioTexto = textoFecha.substring(segundaBarra +1);
		
		//Paso de String a int con el método parseInt de la clase Integer
		this.dia= Integer.parseInt(diaTexto);
		this.mes= Integer.parseInt(mesTexto);
		this.anyo= Integer.parseInt(anioTexto);
		
	}*/
	
	//Método constructor ejercicio 3
	public E03_Fecha(String textoFecha) {
		int num= 0;//Servirá como una hucha para almacenar los números de día, mes y año
		int partefech= 0; //0=día, 1=mes y 2=año
		
		//Recorro carácter por carácter todo el String 
		for (int i=0; i<textoFecha.length(); i++ ) {
			char c= textoFecha.charAt(i);
				
			if (c== '/') { //Si lee / entonces...
				if (partefech == 0) {// Si vale 0 entonces es el día
				    this.dia = partefech; 
				} else if (partefech == 1) {//Si vale 1 entonces el mes y el resto el año
				    this.mes = num;
				}
				// reinicio de num y cambio de valor de partefech
				num= 0;
				partefech ++;
				
			}else {
			    int digito = c - '0';   // Si el carácter no es '/' entonces lo pasamos a nº con ASCII. Al restar 55(7)-40(0)por ejemplo da 7 que es el nº
			    num = num * 10 + digito; //Esto junta los números para que se lean juntos por ejemplo: 1 y 8= 18.
			}
			
			this.anyo= num;	
		}
		
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

	public boolean equals(E03_Fecha fecha) {
		// Si todo se cumple devuelve un true si no un false

		return this.dia == fecha.dia && this.mes == fecha.mes && this.anyo == fecha.anyo;

	}

	public boolean isposterior(E03_Fecha f) {
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

	public int CompareTo(E03_Fecha Fech) {

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

	public int diasHastav1(E03_Fecha f) {
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
	
	public void next() {
		this.dia ++;
		
	
	    
	        int diasMes = getDiasDelMes(this.mes, this.anyo);
	        if (this.dia > diasMes) {
	            this.dia = 1;
	            this.mes++;

	            if (this.mes > 12) {
	                this.mes = 1;
	                this.anyo++;
	            }
	        }
	}

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




