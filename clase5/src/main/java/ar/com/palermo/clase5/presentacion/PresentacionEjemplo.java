package ar.com.palermo.clase5.presentacion;

import ar.com.palermo.clase5.negocio.NegocioEjemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PresentacionEjemplo {

    @Autowired
    private NegocioEjemplo negocio;

    public PresentacionEjemplo() {
        System.out.println("ejecutando la inicializacion del objeto");
    }

    public void ejecutarNegocio() {
        System.out.println("Ejecutando presentacion, hash: " + hashCode() );
        negocio.ejecutarNegocio();
    }

}
