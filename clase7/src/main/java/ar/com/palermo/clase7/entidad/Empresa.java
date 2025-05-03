package ar.com.palermo.clase7.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_empresa;
    private String nombre;
    private int anio_inicio;
    @OneToMany(mappedBy = "unaEmpresa")
    private List<Empleado> empleados;
    @ManyToMany
    @JoinTable(
            name = "empresa_rubro",
            joinColumns = @JoinColumn(name = "id_empresa"),
            inverseJoinColumns = @JoinColumn(name = "id_rubro"))
    private List<Rubro> rubros;

    public Empresa() {
    }

    public Empresa(String nombre, int anio_inicio, List<Empleado> empleados, List<Rubro> rubros) {
        this.nombre = nombre;
        this.anio_inicio = anio_inicio;
        this.empleados = empleados;
        this.rubros = rubros;
    }
}
