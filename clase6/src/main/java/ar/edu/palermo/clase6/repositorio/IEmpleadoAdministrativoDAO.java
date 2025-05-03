package ar.edu.palermo.clase6.repositorio;

import ar.edu.palermo.clase6.dominio.EmpleadoAdministrativo;

/**
 * 
 * @author sebastian.g.ducci
 *
 */
public interface IEmpleadoAdministrativoDAO {

	/**
	 * 
	 * @param empleado
	 */
	EmpleadoAdministrativo persistir(EmpleadoAdministrativo empleado);
	
}
