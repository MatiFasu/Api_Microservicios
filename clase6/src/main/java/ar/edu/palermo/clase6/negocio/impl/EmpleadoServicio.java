package ar.edu.palermo.clase6.negocio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.palermo.clase6.dominio.EmpleadoAdministrativo;
import ar.edu.palermo.clase6.dominio.Empresa;
import ar.edu.palermo.clase6.exceptions.AccesoDatosException;
import ar.edu.palermo.clase6.exceptions.DatosInvalidosException;
import ar.edu.palermo.clase6.negocio.IEmpleadoServicio;
import ar.edu.palermo.clase6.negocio.IEmpresaServicio;
import ar.edu.palermo.clase6.repositorio.IEmpleadoAdministrativoDAO;
import ar.edu.palermo.clase6.repositorio.IEmpresaDAO;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {
	
// presentacion - negocio - negocio - repositorio
	
	@Autowired
	private IEmpresaServicio empresaServicio;
	
	@Autowired
	private IEmpleadoAdministrativoDAO empleadoAdministrativoDAO;

	public EmpleadoAdministrativo crearEmpleadoAdministrativo(String nombre, String apellido, int edad, int idEmpresa)
			throws DatosInvalidosException, AccesoDatosException {		
//		try {
		Empresa empresa = empresaServicio.obtenerEmpresa(idEmpresa);
		EmpleadoAdministrativo empleadoAdministrativo = new EmpleadoAdministrativo(nombre, apellido, edad, empresa);
		
		return empleadoAdministrativoDAO.persistir(empleadoAdministrativo);

	}
	
}
