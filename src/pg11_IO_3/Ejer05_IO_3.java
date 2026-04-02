package pg11_IO_3;

public class Ejer05_IO_3 {

	public static void main(String[] args) {
		
	Persona[] p = new Persona[10];
	
	//En este ejercicio tengo que hacer un array de objetos de la clase persona que a su vez 
	//en el constructor me pide un nombre y un array con 3 fechas dentro
		
	 Fecha[] fechas1 = new Fecha[3];//creo el array 
     fechas1[Persona.FNacimiento] = new Fecha(1, 3, 2006); //Creo las fechas
     fechas1[Persona.FBoda]      = new Fecha(1, 6, 2030);
     fechas1[Persona.FTrabajo]   = new Fecha(1, 9, 2025);
     p[0] = new Persona("Carla", fechas1); //Ahora si creo este objeto en el array que tienen dentro un nombre y un array de fechas

     Fecha[] fechas2 = new Fecha[3];
     fechas2[Persona.FNacimiento] = new Fecha(5, 7, 1999);
     fechas2[Persona.FBoda]      = new Fecha(10, 10, 2022);
     fechas2[Persona.FTrabajo]   = new Fecha(1, 2, 2020);
     p[1] = new Persona("Joaquin", fechas2);

     Fecha[] fechas3 = new Fecha[3];
     fechas3[Persona.FNacimiento] = new Fecha(20, 12, 1985);
     fechas3[Persona.FBoda]      = new Fecha(15, 6, 2010);
     fechas3[Persona.FTrabajo]   = new Fecha(3, 4, 2015);
     p[2] = new Persona("Ana", fechas3);
     
     System.out.println(p[0]);
     System.out.println(p[1]);
     System.out.println(p[2]);

	}

}
