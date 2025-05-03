package ar.com.palermo.clase7.entidad;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EmpleadoFijo extends Empleado {

    private double sueldo;

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(String nombre, String apellido, int edad, Empresa unaEmpresa, double sueldo) {
        super(nombre, apellido, edad, unaEmpresa);
        this.sueldo = sueldo;
    }
}
