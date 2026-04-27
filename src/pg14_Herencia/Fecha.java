package pg14_Herencia;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;

	public Fecha() {
	}

	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		anyo = a;
	}

	public Fecha(String f) {

		// formatos supuestos (d)d/(m)m/aaaa

		int i = 0;
		while (f.charAt(i) != '/')
			i++;
		int barra1 = i;
		i++;
		while (f.charAt(i) != '/')
			i++;
		int barra2 = i;

		dia = 0;
		mes = 0;
		anyo = 0;
		for (i = 0; i < barra1; i++)
			dia = dia * 10 + f.charAt(i) - 48;
		for (i = barra1 + 1; i < barra2; i++)
			mes = mes * 10 + f.charAt(i) - 48;
		for (i = barra2 + 1; i < f.length(); i++)
			anyo = anyo * 10 + f.charAt(i) - 48;

	}

	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}

	public int compareTo(Fecha y) {
		if (this.anyo > y.anyo)
			return 1;
		if (this.anyo < y.anyo)
			return -1;
		if (this.mes > y.mes)
			return 1;
		if (this.mes < y.mes)
			return -1;
		if (this.dia > y.dia)
			return 1;
		if (this.dia < y.dia)
			return -1;
		return 0;
	}

	public boolean equals(Fecha otraFecha) {

		if (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anyo == otraFecha.anyo)
			return true;
		else
			return false;
	}

	// métodos días de la semana

	public boolean domingo() {

		LocalDate fecha = LocalDate.of(this.anyo, this.mes, this.dia);
		return fecha.getDayOfWeek() == DayOfWeek.SUNDAY;

	}

	public boolean sabado() {
		LocalDate fecha = LocalDate.of(this.anyo, this.mes, this.dia);
		return fecha.getDayOfWeek() == DayOfWeek.SATURDAY;
	}

	// métodos operativos con fechas

	public boolean bisiesto() {
		return (this.anyo % 100 != 0 || this.anyo % 400 == 0) && this.anyo % 4 == 0;
	}

	public Fecha siguiente() {
		int diasMes;
		Fecha f = new Fecha();

		f.dia = this.dia;
		f.mes = this.mes;
		f.anyo = this.anyo;

		switch (f.mes) {
		case 4:
			diasMes = 30;
			break;
		case 6:
			diasMes = 30;
			break;
		case 9:
			diasMes = 30;
			break;
		case 10:
			diasMes = 30;
			break;

		case 2:
			if (f.bisiesto())
				diasMes = 29;
			else
				diasMes = 28;
			break;

		default:
			diasMes = 31;
		}

		f.dia++;
		if (f.dia > diasMes) {
			f.dia = 1;
			f.mes++;
			if (f.mes > 12) {
				f.mes = 1;
				f.anyo++;
			}
		}
		return f;
	}

	public Fecha next() {
		return (this.siguiente());
	}

	public int diasHasta(Fecha f) {

		Fecha fMovil = new Fecha();

		fMovil.dia = this.dia;
		fMovil.mes = this.mes;
		fMovil.anyo = this.anyo;

		int contadorDias = -fMovil.dia + 1;
		fMovil.dia = 1;

		int mesVirtual = fMovil.anyo * 12 + fMovil.mes;
		int mesFinal = f.anyo * 12 + f.mes;

		while (mesVirtual != mesFinal) {
			contadorDias = contadorDias + fMovil.diasdelmes();
			fMovil.mes = fMovil.mes + 1;
			if (fMovil.mes == 13) {
				fMovil.mes = 1;
				fMovil.anyo++;
			}
			mesVirtual++;
			// saldría lo mismo con... mesVirtual = fMovil.anio*12+fMovil.mes;
		}

		// El algoritmo es más rápido
		// sumando dias de años y controlando años bisiestos
		// Hágalo usted así

		contadorDias = contadorDias + f.dia - 1;

		return contadorDias;
	}

	public int diasdelmes() {
		int dias;

		switch (this.mes) {
		case 2:
			dias = 28;
			if (this.bisiesto())
				dias++;
			break;

		case 4:
			dias = 30;
			break;
		case 6:
			dias = 30;
			break;
		case 9:
			dias = 30;
			break;
		case 11:
			dias = 30;
			break;

		default:
			dias = 31;
			break;
		}

		return dias;
	}

	// ...

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
