package pg11_IO_3;
public class Ejer01_IO_3 {

	public static void main(String[] args) {
		Fecha[] fechas = new Fecha [10];
		
		fechas[0] = new Fecha(1, 3, 2006);
        fechas[1] = new Fecha("15/08/2020");
        fechas[2] = new Fecha(new java.util.GregorianCalendar(2024, 0, 10));

        System.out.println(fechas[0]);
        System.out.println(fechas[1]);
        System.out.println(fechas[2]);
    
	}

}
