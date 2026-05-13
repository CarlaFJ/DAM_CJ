package buscaminas_3ºEV;

public class CordenadaInvalidaException extends BuscaminasException{
	
	public CordenadaInvalidaException() {
		super("Coordenadas inválidas: deben estar entre 0 y 7");
	}

}
