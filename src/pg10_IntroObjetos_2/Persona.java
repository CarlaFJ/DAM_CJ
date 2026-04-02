package pg10_IntroObjetos_2;

public class Persona {
	private String nombre;
	private E03_Fecha fechaNacimiento; //Uso la clase E03_Fecha del mismo paquete
	
	//Método constructor con parámetros 
	public Persona (String nombre, E03_Fecha fechaNacimiento  ) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Método constructor con datos
		public Persona() {
			this.nombre = "Carla";
			this.fechaNacimiento = new E03_Fecha (1,3,2006);
		}
		
		@Override
		public String toString() {
			return "Nombre: " + nombre + ", FechaNacimiento: " + fechaNacimiento;
		}
		
		
		
		//Getters y Setters


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public E03_Fecha getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(E03_Fecha fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
	
}
