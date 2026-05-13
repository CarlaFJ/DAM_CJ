package buscaminas_3ºEV;

public class BuscaminasException extends Exception {

	// Creo la clase de la excepcion propia que herede en este caso de exception
	// Haré dos constructores, el segundo sirve para personalizar el mensaje del error

	
	public BuscaminasException() {
		
	}
	
	public BuscaminasException(String mensajeError) {
		
		super(mensajeError);
		
	}
}
