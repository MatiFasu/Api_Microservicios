package ar.edu.palermo.clase6.repositorio.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.palermo.clase6.dominio.EmpleadoAdministrativo;
import ar.edu.palermo.clase6.repositorio.IEmpleadoAdministrativoDAO;

@Component
public class EmpleadoAdministrativoDAO implements IEmpleadoAdministrativoDAO {

	
	private ArrayList<EmpleadoAdministrativo> empleados = new ArrayList<>();
	
	@Override
	public EmpleadoAdministrativo persistir(EmpleadoAdministrativo empleado) {
		// TODO Auto-generated method stub
		empleados.add(empleado);
		
		return empleado;
	}

}
