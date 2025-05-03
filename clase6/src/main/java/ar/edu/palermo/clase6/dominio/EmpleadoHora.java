package ar.edu.palermo.clase6.dominio;

public class EmpleadoHora extends Empleado{

	private int cantidadHora;
	private float valorHora;
	
	public EmpleadoHora(String nombre, String apellido, int edad, Empresa empresa, int cantidadHora, float valorHora) {
		super(nombre, apellido, edad,empresa);
		setValorHora(valorHora);
		setCantidadHora(cantidadHora);
	}
	
	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return cantidadHora * valorHora;
	}
	
	public int getCantidadHora() {
		return cantidadHora;
	}
	public void setCantidadHora(int cantidadHora) {
		this.cantidadHora = cantidadHora;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	
	
}
