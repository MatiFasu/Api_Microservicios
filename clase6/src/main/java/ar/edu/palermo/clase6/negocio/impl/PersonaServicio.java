package ar.edu.palermo.clase6.negocio.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.palermo.clase6.dominio.Mascota;
import ar.edu.palermo.clase6.dominio.Persona;
import ar.edu.palermo.clase6.negocio.IPersonaServicio;
import ar.edu.palermo.clase6.repositorio.IPersonaDAO;

@Service
public class PersonaServicio implements IPersonaServicio{

	@Autowired
	private IPersonaDAO personaDAO;
	
	@Override
	public void guardar(String nombre) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona(nombre);
		
		ArrayList<Mascota> mascotas = new ArrayList<>();
		mascotas.add(new Mascota("Perro 1",persona));
		mascotas.add(new Mascota("Perro 2",persona));
		mascotas.add(new Mascota("Perro 3",persona));
	
		persona.setMascotas(mascotas);
		
 		personaDAO.save(persona);
		
	}

	@Override
	@Transactional
	public Iterable<Persona> buscar() {
		// TODO Auto-generated method stub
		
		Iterable<Persona> personas = personaDAO.findAll();
		personas.iterator().next().getMascotas();
		
		return personas;
	}

	
	
	
}
