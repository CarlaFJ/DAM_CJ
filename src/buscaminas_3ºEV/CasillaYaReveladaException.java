package buscaminas_3ºEV;

public class CasillaYaReveladaException extends BuscaminasException{

	public CasillaYaReveladaException() {
		super("Esa casilla ya ha sido revelada");
	}
}
