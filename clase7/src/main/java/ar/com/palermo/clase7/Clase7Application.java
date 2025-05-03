package ar.com.palermo.clase7;

import ar.com.palermo.clase7.entidad.Empresa;
import ar.com.palermo.clase7.presentacion.RubroPresentacion;
import ar.com.palermo.clase7.servicio.IEmpresaServicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Clase7Application {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Clase7Application.class, args);

		IEmpresaServicio empresaServicio = appContext.getBean(IEmpresaServicio.class);
		empresaServicio.guardarEmpresa(new Empresa("Mercado Libre", 1999, null, null));

		empresaServicio.guardarEmpresa(new Empresa("Techint", 1945, null, null));

	}

}
