package ar.edu.palermo.clase6.repositorio;

import ar.edu.palermo.clase6.dominio.Empresa;

/**
 * 
 * @author sebastian.g.ducci
 *
 */
public interface IEmpresaDAO {

	/**
	 * 
	 * @param idEmpresa
	 * @return
	 * @throws Exception
	 */
	Empresa buscarPorID(int idEmpresa) throws Exception;

}
