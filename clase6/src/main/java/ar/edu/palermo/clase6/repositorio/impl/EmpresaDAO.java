package ar.edu.palermo.clase6.repositorio.impl;

import org.springframework.stereotype.Component;

import ar.edu.palermo.clase6.dominio.Empresa;
import ar.edu.palermo.clase6.repositorio.IEmpresaDAO;

@Component
public class EmpresaDAO implements IEmpresaDAO {

	@Override
	public Empresa buscarPorID(int idEmpresa) throws Exception {
		// TODO Auto-generated method stub
		return new Empresa("UP",2025, "Gestion RRHH");
	}

}
