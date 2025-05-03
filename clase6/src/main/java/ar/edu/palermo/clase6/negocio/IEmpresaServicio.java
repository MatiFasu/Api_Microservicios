package ar.edu.palermo.clase6.negocio;

import ar.edu.palermo.clase6.dominio.Empresa;
import ar.edu.palermo.clase6.exceptions.AccesoDatosException;
import ar.edu.palermo.clase6.exceptions.DatosInvalidosException;

/**
 * Interface con responsabilidad de gestionar el negocio relacionado a una empresa
 * @author sebastian.g.ducci
 *
 */
public interface IEmpresaServicio {

	/**
	 * Busco una empresa creada en el sistema
	 * @param id , identificador del empresa
	 * @return Empresa buscada
	 * @throws DatosInvalidosException , si el id es incorrecto arrojo una excepción
	 * @throws AccesoDatosException 
	 */
	Empresa obtenerEmpresa(int id) throws DatosInvalidosException, AccesoDatosException;
	
}
