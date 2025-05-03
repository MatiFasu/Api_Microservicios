package ar.edu.palermo.clase6.negocio;

import ar.edu.palermo.clase6.dominio.EmpleadoAdministrativo;
import ar.edu.palermo.clase6.exceptions.AccesoDatosException;
import ar.edu.palermo.clase6.exceptions.DatosInvalidosException;

public interface IEmpleadoServicio {

	public EmpleadoAdministrativo crearEmpleadoAdministrativo(String nombre, String apellido, int edad, int idEmpresa)
			throws DatosInvalidosException, AccesoDatosException;

}
