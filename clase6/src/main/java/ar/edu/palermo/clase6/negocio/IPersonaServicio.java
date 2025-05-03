package ar.edu.palermo.clase6.negocio;

import ar.edu.palermo.clase6.dominio.Persona;

public interface IPersonaServicio {

	public void guardar(String nombre);
	public Iterable<Persona> buscar();

	
}
