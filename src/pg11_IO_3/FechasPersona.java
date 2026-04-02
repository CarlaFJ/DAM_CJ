package pg11_IO_3;

public class FechasPersona {
	 private Fecha fechaNacimiento;
	   private Fecha fechaBoda;
	   private Fecha fechaTrabajo;
	   
	   // ...
	    
	   public FechasPersona(Fecha fn, Fecha fb, Fecha ft) {
	   	fechaNacimiento = fn;
	   	fechaBoda = fb;
	   	fechaTrabajo = ft;
	   }
	   
	   
	   
	    @Override
	    public String toString() {
		return "FechasPersona:" + fechaNacimiento + ", fechaBoda:" + fechaBoda + ", fechaTrabajo:"
				+ fechaTrabajo;
	}



		public Fecha getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Fecha fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public Fecha getFechaBoda() {
			return fechaBoda;
		}

		public void setFechaBoda(Fecha fechaBoda) {
			this.fechaBoda = fechaBoda;
		}


		public Fecha getFechaTrabajo() {
			return fechaTrabajo;
		}


		public void setFechaTrabajo(Fecha fechaTrabajo) {
			this.fechaTrabajo = fechaTrabajo;
		}
}
