package ar.edu.palermo.clase6.dominio;

public abstract class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private Empresa empresa;
	
	public Empleado(String nombre, String apellido, int edad, Empresa empresa) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		setEmpresa(empresa);
	}
	
	public abstract float calcularSueldo();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
