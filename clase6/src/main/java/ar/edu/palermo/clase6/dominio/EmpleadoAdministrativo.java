package ar.edu.palermo.clase6.dominio;

public class EmpleadoAdministrativo extends Empleado {


	public EmpleadoAdministrativo(String nombre, String apellido, int edad, Empresa empresa) {
		super(nombre, apellido, edad, empresa);
		// TODO Auto-generated constructor stub
	}
	
	public void agregarEmpleado(Empleado empleado) {
		getEmpresa().agregarEmpleado(empleado);
	}
	
	public void calcularSalarioEmpresa() {
		
		float sueldoAcumulado = 0f;
		
		for(Empleado empleado : getEmpresa().getEmpleados()) {
			sueldoAcumulado += empleado.calcularSueldo();
		}
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	//El sistema requiere poder interactuar con los empleados de una empresa, de dicha empresa se sabe su nombre (dato obligatorio) y año de inicio de actividad (obligatorio) y rubro.
	//Los empleados tendrán nombre, apellido y edad como datos obligatorios, pero existen empleados que trabajan por hora un precio hora fijo y empleados que ganan un sueldo fijo, independientemente del tipo, saben calcular su sueldo.
	//Existe un empleado administrativo que se encarga de dar de alta nuevos empleados en la empresa y determinar el salario total que la empresa tiene que pagar dados todos sus empleados.
	//
	//Consignas:
	//	
//		Codificar la lógica solicitada en el enunciado en un proyecto individual que sea luego empaquetado por Maven, manejar excepciones 	donde crea conveniente.
	//	
//		Generar un nuevo proyecto Maven que tome la dependencia del punto anterior y simule la interacción entre los objetos del model.			

	
}
