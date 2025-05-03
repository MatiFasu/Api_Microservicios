package ar.com.palermo.clase7.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_empleado;
    private String nombre;
    private String apellido;
    private int edad;
    @ManyToOne
    @JoinColumn(name="empleado")
    private Empresa unaEmpresa;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, Empresa unaEmpresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.unaEmpresa = unaEmpresa;
    }
}
