package ar.edu.palermo.clase6.dominio;

public class EmpleadoFijo extends Empleado {

	private float salarioFijo;

	public EmpleadoFijo(String nombre, String apellido, int edad, Empresa empresa, float salarioFijo) {
		super(nombre, apellido, edad, empresa);
		setSalarioFijo(salarioFijo);
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return getSalarioFijo();
	}

	public float getSalarioFijo() {
		return salarioFijo;
	}

	public void setSalarioFijo(float salarioFijo) {
		this.salarioFijo = salarioFijo;
	}

}
