package ar.com.palermo.clase7.entidad;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EmpleadoHora extends Empleado {

    private double sueldo_hora;
    private int horas;

    public EmpleadoHora() {
    }

    public EmpleadoHora(String nombre, String apellido, int edad, Empresa unaEmpresa, double sueldo_hora, int horas) {
        super(nombre, apellido, edad, unaEmpresa);
        this.sueldo_hora = sueldo_hora;
        this.horas = horas;
    }
}
