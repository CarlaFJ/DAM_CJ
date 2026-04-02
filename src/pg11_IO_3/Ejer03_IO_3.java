package pg11_IO_3;

public class Ejer03_IO_3 {

	public static void main(String[] args) {
		
		FechasPersona[] personas = new FechasPersona[10];
		
		personas[0]= new FechasPersona(
				new Fecha(1,1,2006), 
				new Fecha(1,2,2006),
				new Fecha(1,3,2006));
		
		personas[1]= new FechasPersona(
				new Fecha(18,7,1998), 
				new Fecha(18,8,1998),
				new Fecha(18,9,1998));
		personas[2]= new FechasPersona(
				new Fecha(31,12,2000), 
				new Fecha(31,12,2009),
				new Fecha(31,12,2020));
		
		 System.out.println(personas[0]);
	     System.out.println(personas[1]);
	     System.out.println(personas[2]);
	    
		
	}

}
