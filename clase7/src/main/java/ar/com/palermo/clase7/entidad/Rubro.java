package ar.com.palermo.clase7.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_rubro;
    private String nombre;
    @ManyToMany(mappedBy = "rubros")
    private List<Empresa> empresas;

    public Rubro() {
    }

    public Rubro(String nombre, List<Empresa> empresas) {
        this.nombre = nombre;
        this.empresas = empresas;
    }
}
