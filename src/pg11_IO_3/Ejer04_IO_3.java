package pg11_IO_3;

import java.util.ArrayList;

public class Ejer04_IO_3 {

	public static void main(String[] args) {
		
		ArrayList<FechasPersona> fchas = new ArrayList<>(); //Creo el ArrayList

		//Creo tres objetos FechasPersona
		FechasPersona f1= new FechasPersona(
				new Fecha(1,1,2006), 
				new Fecha(1,2,2006),
				new Fecha(1,3,2006));
		
		FechasPersona f2= new FechasPersona(
				new Fecha(18,7,1998), 
				new Fecha(18,8,1998),
				new Fecha(18,9,1998));
		FechasPersona f3= new FechasPersona(
				new Fecha(31,12,2000), 
				new Fecha(31,12,2009),
				new Fecha(31,12,2021));
		
		//Añado los objetos al ArrayList
		fchas.add(f1);
		fchas.add(f2);
		fchas.add(f3);
		
		//For each para imprimir las fechas
		for (FechasPersona fp: fchas) {
			System.out.println(fp);
		}
	}

}
