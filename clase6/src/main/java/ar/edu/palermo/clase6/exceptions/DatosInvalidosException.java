package ar.edu.palermo.clase6.exceptions;

import ar.edu.palermo.clase6.dominio.Empresa;

public class DatosInvalidosException extends BusinessException{

//	private Empresa empresa;
	
	public DatosInvalidosException(String message) {
		super(message);
	}
	
}
