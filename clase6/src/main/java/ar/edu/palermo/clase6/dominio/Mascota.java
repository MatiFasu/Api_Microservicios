package ar.edu.palermo.clase6.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Mascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "DUENIO_MASCOTA")
	private Persona duenio;
	
	@ManyToMany()
	@JoinTable(
			name = "MASCOTA_VETERINARIO",
			joinColumns = {@JoinColumn(name="ID_MASCOTA")},
			inverseJoinColumns = {@JoinColumn(name="ID_VETERINARIO")}			
			)
	private List<Veterinario> veterinarios;
	
	public Mascota(String nombre) {
		setNombre(nombre);
	}
	
	public Mascota(String nombre, Persona duenio) {
		setNombre(nombre);
		setDuenio(duenio);
	}
	
	private Mascota() {
		
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
	

}
