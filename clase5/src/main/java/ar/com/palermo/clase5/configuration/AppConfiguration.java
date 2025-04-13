package ar.com.palermo.clase5.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfiguration {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${clase5.funcion.cantidadMaxima}")
    private int maxFunciones;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public int getMaxFunciones() {
        return maxFunciones;
    }

    public void setMaxFunciones(int maxFunciones) {
        this.maxFunciones = maxFunciones;
    }
}
