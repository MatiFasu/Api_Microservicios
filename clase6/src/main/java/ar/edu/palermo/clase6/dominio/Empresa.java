package ar.edu.palermo.clase6.dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private int anioInicio;
	private String rubro;
	private List<Empleado> empleados;
	
	
	//TODO: Crear repositorios con sus servicios para crear y consultar : empresas, empleados y rubros.
	//simular la consulta de una empresa para tener en una busqueda total todas sus relaciones - empleados y rubros.
	// relacion many to many con RUBROS (ID - PK , NOMBRE)
	
	public Empresa(String nombre, int anioInicio, String rubro) throws Exception {
		setNombre(nombre);
		setAnioInicio(anioInicio);
		setRubro(rubro);
		empleados = new ArrayList<Empleado>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws Exception {
		
		if(nombre == null || nombre.isEmpty()) {
			throw new Exception("Nombre incorrecto");
		}
		
		this.nombre = nombre;
	}
	public int getAnioInicio() {
		return anioInicio;
	}
	private void setAnioInicio(int anioInicio) throws Exception {
		if(anioInicio <= 0) {
			throw new Exception("Anio de inicio incorrecto");
		}
		
		this.anioInicio = anioInicio;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
}
