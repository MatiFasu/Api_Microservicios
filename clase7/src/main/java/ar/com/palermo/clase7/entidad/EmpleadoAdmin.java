package ar.com.palermo.clase7.entidad;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EmpleadoAdmin extends Empleado {

    public EmpleadoAdmin() {
    }

    public EmpleadoAdmin(String nombre, String apellido, int edad, Empresa unaEmpresa) {
        super(nombre, apellido, edad, unaEmpresa);
    }
}
