package ar.edu.palermo.clase6.negocio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.palermo.clase6.dominio.Empresa;
import ar.edu.palermo.clase6.exceptions.AccesoDatosException;
import ar.edu.palermo.clase6.exceptions.DatosInvalidosException;
import ar.edu.palermo.clase6.negocio.IEmpresaServicio;
import ar.edu.palermo.clase6.repositorio.IEmpresaDAO;

@Service
public class EmpresaServicio implements IEmpresaServicio {

	@Autowired
	private IEmpresaDAO empresaDAO;
	
	
	@Override
	public Empresa obtenerEmpresa(int id) throws DatosInvalidosException, AccesoDatosException {
		// TODO Auto-generated method stub
		
		if(id <= 0) {
			throw new DatosInvalidosException("el id de empresa a buscar no es correcto"); 
		}
		
		try {
			return empresaDAO.buscarPorID(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new AccesoDatosException("error con el motor de BBDD");
		}
	}

}
