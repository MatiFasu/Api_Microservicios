package ar.edu.palermo.clase6.dominio;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONA_FISICA")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PEFI_ID")
	private int id;
	
	
	@Column(name = "PEFI_NOMBRE")
	private String nombre;
	
	
	@OneToMany(mappedBy = "duenio", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<Mascota> mascotas;
	
	private Persona() {

	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
}
