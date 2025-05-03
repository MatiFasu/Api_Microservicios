package ar.edu.palermo.clase6.repositorio;

import org.springframework.data.repository.CrudRepository;

import ar.edu.palermo.clase6.dominio.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Integer> {

	
	
}
