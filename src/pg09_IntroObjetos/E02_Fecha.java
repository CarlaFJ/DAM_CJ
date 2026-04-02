package pg09_IntroObjetos;
import java.time.LocalDate;
public class E02_Fecha {

	private int dia;
	private int mes;
	private int anyo;

	//Método constructor con parámetros
	
	public E02_Fecha(int dia, int mes, int anyo) {
		this.dia= dia;
		this.mes= mes;
		this.anyo= anyo;
	}

	//Método contructor con la fecha actual
	
	public E02_Fecha() {
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
	
	public boolean equals(E02_Fecha fecha) {
		//Si todo se cumple devuelve un true si no un false
		
		return this.dia == fecha.dia &&
		this.mes == fecha.mes &&
		this.anyo == fecha.anyo;
		
	}
	
	public boolean isposterior(E02_Fecha f) {
		if (this.anyo> f.anyo)return true;
		if (this.anyo< f.anyo)return false;
		
		if (this.mes > f.mes)return true;
		if (this.mes < f.mes)return false;
		
		return this.dia > f.dia;
		
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
