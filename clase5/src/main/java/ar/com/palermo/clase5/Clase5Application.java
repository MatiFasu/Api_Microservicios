package ar.com.palermo.clase5;

import ar.com.palermo.clase5.presentacion.PresentacionEjemplo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//ComponentScan(basePackages = {"ar.com.palermo.clase5","ar.com.palermo.clase5.ejemplo"})
public class Clase5Application {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Clase5Application.class, args);
		PresentacionEjemplo pre1 = appContext.getBean(PresentacionEjemplo.class);
		PresentacionEjemplo pre2 = appContext.getBean(PresentacionEjemplo.class);


		System.out.println("Fin");

	}

}

/**
 * no estoy llamando desde ningun lugar PresentacionEjemplo pero se esta instanciando
 * porque Spring detecta que esta clase esta estereotipada. Con esta anotacion
 * SpringBootApplication se esta ejecutando tambien ComponentScan y este hace q se instancie
 */

/**
 * Bean son los objetos en spring que se instancian segun estereotipo o el arroba algo
 */

/**
 * Con Scope indico como quiero que se comporte. Al poner PROTOTYPE cada instancia de
 * PresentacionEjemplo va a ser distinta pero cada instancia de negocio va a ser la
 * misma
 */

/**
 * En el main, yo tengo implementado por defecto el patron de paquetes: package ar.com.palermo.clase5
 * todo aquel que no tenga este patron de paquete no lo va a analizar y no lo va a levantar
 * para que lo levante tenemos que utilizar la anotacion
 * ComponentScan(basePackages = {"ar.com.palermo.clase5","ar.com.palermo.clase5.ejemplo"})
 * voy poniendo los paquetes que quiero que analize
 */