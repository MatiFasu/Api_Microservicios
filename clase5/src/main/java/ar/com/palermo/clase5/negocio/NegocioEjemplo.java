package ar.com.palermo.clase5.negocio;

import ar.com.palermo.clase5.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioEjemplo {

    @Autowired
    private AppConfiguration config;

    public NegocioEjemplo() {

        System.out.println("Ejecutando la inicializacion del objeto");
    }

    public void ejecutarNegocio() {

        config.getMaxFunciones();
        System.out.println("ejecutando el negocio, hash: " + hashCode() );
    }

}
