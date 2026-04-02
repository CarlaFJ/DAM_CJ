package pg09_IntroObjetos;
import java.time.LocalDate;
public class E05_Fecha {

	private int dia;
	private int mes;
	private int anyo;

	//Método constructor con parámetros
	
	public E05_Fecha(int dia, int mes, int anyo) {
		this.dia= dia;
		this.mes= mes;
		this.anyo= anyo;
	}

	//Método contructor con la fecha actual
	
	public E05_Fecha() {
		LocalDate hoy = LocalDate.now();
		this.dia= hoy.getDayOfMonth();
		this.mes= hoy.getMonthValue();
		this.anyo= hoy.getYear();
	}
	
	private boolean bisiesto(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		return false;
	}
	

	//Para acceder a este método de manera segura
	public boolean esBisiesto() {
		return bisiesto(this.anyo);
	}
	
	public boolean equals(E05_Fecha fecha) {
		//Si todo se cumple devuelve un true si no un false
		
		return this.dia == fecha.dia &&
		this.mes == fecha.mes &&
		this.anyo == fecha.anyo;
		
	}
	
	public boolean isposterior(E05_Fecha f) {
		if (this.anyo> f.anyo)return true;
		if (this.anyo< f.anyo)return false;
		
		if (this.mes > f.mes)return true;
		if (this.mes < f.mes)return false;
		
		return this.dia > f.dia;
		
	}
	
	public int CompareTo (E05_Fecha Fech) {
		
		//Si los años no son iguales se devuelve la resta, el nº negativo= This es anterior a f
		
		if (this.anyo != Fech.anyo )
			return this.anyo - Fech.anyo;
		
		//Si los años son iguales pero los meses no se devuelve resta = This anterior a f
		if (this.mes != Fech.mes )
			return this.mes - Fech.mes;
		
		//Si los años y meses son iguales pero los días no, se devuelve resta = This anterior a f
		return this.dia - Fech.dia;
		
	}
	
	public String diaExacto () {
		  LocalDate diaSemana = LocalDate.of(this.anyo, this.mes, this.dia); //Crea el objeto fecha
		  return diaSemana.getDayOfWeek().toString(); //Crea el objeto día de la semana y si lo queremos imprimir y pasar a texto se usa el toString
	}
	
	//Método toString
	@Override
	public String toString() {
		return  dia + "/" + mes + "/" + anyo ;
	}

	//Getters y setters 
	
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
