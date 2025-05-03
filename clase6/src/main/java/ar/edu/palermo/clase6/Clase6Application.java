package ar.edu.palermo.clase6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ar.edu.palermo.clase6.dominio.EmpleadoAdministrativo;
import ar.edu.palermo.clase6.dominio.Persona;
import ar.edu.palermo.clase6.exceptions.AccesoDatosException;
import ar.edu.palermo.clase6.exceptions.DatosInvalidosException;
import ar.edu.palermo.clase6.negocio.IEmpleadoServicio;
import ar.edu.palermo.clase6.negocio.IPersonaServicio;

@SpringBootApplication
public class Clase6Application {

	public static void main(String[] args) {
		ApplicationContext appContext =  SpringApplication.run(Clase6Application.class, args);
		
		IEmpleadoServicio empleadoServicio = appContext.getBean(IEmpleadoServicio.class);
		
		try {
			EmpleadoAdministrativo empleado =  empleadoServicio.crearEmpleadoAdministrativo("Julieta", "Gonzalez", 33, 44);
			System.out.println("empleado creado");
		} catch (DatosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccesoDatosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		IPersonaServicio personaServicio = appContext.getBean(IPersonaServicio.class);
		personaServicio.guardar("ejemplo");

		Iterable<Persona> personas = personaServicio.buscar();
		
		personaServicio.guardar("ejemplo 1");
		
		System.out.println("resultado");
	}

}
