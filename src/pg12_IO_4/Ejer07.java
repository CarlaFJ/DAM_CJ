package pg12_IO_4;

import java.util.ArrayList;

public class Ejer07 {

	public static void main(String[] args) {
		
		ArrayList <Cliente> Clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente (134567, "Ana", "Calle 67", "Murcia", 45 );
		c1.addAlmacen(new Almacen(14884, "Calle 89", "Murcia"));
		c1.addAlmacen(new Almacen(2658, "Calle 2", "Alicante"));

		Cliente c2 = new Cliente(2678, "Luis", "Calle B", "Valencia", 67);
		c2.addAlmacen(new Almacen(3567, "Calle 3", "Valencia"));

		Clientes.add(c1);
		Clientes.add(c2);
		
		ArrayList<Cliente> enMurcia = ClientesConAlmacenEn(Clientes, "Murcia");
		System.out.println(enMurcia);

	}
	
	private static ArrayList <Cliente> ClientesConAlmacenEn (ArrayList<Cliente> Clientes, String provincia){
		
		ArrayList <Cliente> CCliente = new ArrayList<>();
		
		
		for(int i=0; i< Clientes.size(); i++){
			Cliente c =Clientes.get(i);
			
			boolean encontrado = false;
			
			for (int j=0; j< c.getAlmacenes().size() && !encontrado; j++ ) {
				Almacen a= c.getAlmacenes().get(j);
				
				if(a.getProvincia().equalsIgnoreCase(provincia)) {
					CCliente.add(c);
					encontrado =true;
					
				}
			}
			
		}
		
		return CCliente;
	} 

}

