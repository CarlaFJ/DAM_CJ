package pg11_IO_3;

import java.util.GregorianCalendar;

public class Fecha {
	 public static final String[] diasSemana = {"", "DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};

	   
	  
	   private int dia;
	   private int mes;
	   private int anyo;
	      
	   
	  
	    
	    public Fecha() {}
	    
	    public Fecha(int dia, int mes, int anyo) {
	    	this.dia = dia;
	    	this.mes = mes;
	    	this.anyo = anyo;
	    }
	    
		public Fecha(GregorianCalendar gregorian) {
			this.dia = gregorian.get(GregorianCalendar.DAY_OF_MONTH);
			this.mes = gregorian.get(GregorianCalendar.MONTH) + 1;
			this.anyo = gregorian.get(GregorianCalendar.YEAR);
		} 
		
		
		public Fecha(String fecha) {
			
			int indiceBarra1 = fecha.indexOf('/');
			int indiceBarra2 = fecha.lastIndexOf('/');
			
			
			dia  = Integer.parseInt(fecha.substring(0,indiceBarra1));
			mes  = Integer.parseInt(fecha.substring(indiceBarra1+1,indiceBarra2));
			anyo = Integer.parseInt(fecha.substring(indiceBarra2+1));
			
		}
		
		
	  

	    public String toString() { return  dia+"/"+mes+"/"+anyo; } 

	    
	    public void plus(int dias) {
	    	
	    	GregorianCalendar gregorian = new GregorianCalendar(this.anyo,this.mes-1,this.dia);
	    	gregorian.add(GregorianCalendar.DAY_OF_YEAR,dias);
	    	
	    	this.dia = gregorian.get(GregorianCalendar.DAY_OF_MONTH);    	
	    	this.mes = gregorian.get(GregorianCalendar.MONTH)+1;
	    	this.anyo = gregorian.get(GregorianCalendar.YEAR);

	    }
	    
	    public void next() {this.plus(1);}
	    
	    
	    public boolean posterior(Fecha fecha) {
	    	
	    	if (this.anyo>fecha.anyo) return true;
	    	if (this.anyo<fecha.anyo) return false;
	    	
	    	if (this.mes>fecha.mes) return true;
	    	if (this.mes<fecha.mes) return false;
	    	
	    	if (this.dia>fecha.dia) return true;
	    	return false;
	    }
	    
	public boolean anterior(Fecha fecha) {
	    	
	    	if (this.anyo<fecha.anyo) return true;
	    	if (this.anyo>fecha.anyo) return false;
	    	
	    	if (this.mes<fecha.mes) return true;
	    	if (this.mes>fecha.mes) return false;
	    	
	    	if (this.dia<fecha.dia) return true;
	    	return false;
	    }

	    
	    public int compareTo(Fecha fecha){
	    	if (posterior(fecha)) return 1;
	    	else if (anterior(fecha))return -1;
	    	return 0;
	    		
	    }
	    
	    public GregorianCalendar toGregorian() {
	    	return new GregorianCalendar(this.anyo, this.mes-1,this.dia);
	    }
	    

	    public String diaSemana() {
	 
	      GregorianCalendar fecha = new GregorianCalendar(this.anyo, this.mes-1, this.dia);
	      return diasSemana[fecha.get(GregorianCalendar.DAY_OF_WEEK)];
	      
	     }
	    
	    public int diasHastav2(Fecha f) 
	    {
	    	Fecha f1 = this; Fecha f2 = f;
	    	if (this.posterior(f)) {f1 = f; f2=this;}
	    	
	    	int total=0;
	    	if (f1.anyo == f2.anyo) total =  diasEntre(f1.dia,f1.mes,f2.dia,f2.mes,f1.anyo);
	    	else 
	    	{
	    		total = diasEntre(f1.dia,f1.mes,31,12,f1.anyo);
	    		total = total + diasInto(f1.anyo+1,f2.anyo-1);
	    		total = total + diasEntre(1,1,f2.dia,f2.mes,f2.anyo) +1;
	    	}
	    	
	     	if (this.posterior(f)) total = -total;
	     	
	    	return total;
	    }
	    
	    private int diasEntre(int dia1, int mes1, int dia2, int mes2, int anyo)
	    {
	        System.out.println("Inicio, mes1 = " + mes1);
	        System.out.println("Inicio, mes2 = " + mes2);    	
	    	
	        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
	        if (bisiesto(anyo)) diasMes[1]=29;

	        mes1--;
	        mes2--;

	        int indice1=mes1+1;  
	        int indice2=mes2-1;   

	        int total =0;
	        for (int indice=indice1; indice<=indice2; indice++) 
	       	total = total + diasMes[indice];

	        if (mes2==mes1) total = total + dia2- dia1; 
	        else total = total + dia2 - dia1 + diasMes[mes1];

	        return total;
	    	
	    }
	    
	    private int diasInto(int year1, int year2) {
	    	int total = (year2-year1+1)*365;
	    	
	    	for (int year=year1; anyo<=year2; anyo++)
	    	if (this.bisiesto(year)) total++;	
	    	
	    	return total;
	    }

	    
	   
		private boolean bisiesto(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true;
			return false;
		}  

	    public int diasHastav1(Fecha f) {
	    	  
	    	GregorianCalendar f1 = new GregorianCalendar(this.anyo, this.mes-1, this.dia);
	        GregorianCalendar f2 = new GregorianCalendar(f.anyo, f.mes-1, f.dia);
	    	
	        long fInicio = f1.getTimeInMillis();
	        long fFin = f2.getTimeInMillis();
	        
	        int diferencia = (int) ((fFin-fInicio)/1000/3600/24);
	        
	        return diferencia;
	    }    
	     
	    
	    // ...
	     
	    public void setDia(int dia) {this.dia = dia;}
		public void setMes(int mes) {this.mes = mes;}
		public void setAnyo(int anyo) {this.anyo = anyo;}
		
		public int getMes() {return mes;}
		public int getAnyo() {return anyo;}
		public int getDia() {return dia;}
}
	