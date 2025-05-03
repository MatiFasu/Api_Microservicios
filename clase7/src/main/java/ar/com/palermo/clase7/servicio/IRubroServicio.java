package ar.com.palermo.clase7.servicio;

import ar.com.palermo.clase7.entidad.Rubro;

import java.util.List;

public interface IRubroServicio {

    public List<Rubro> obtenerRubros();

    Rubro obtenerRubro(Long id_rubro);

    void eliminarRubro(Long id_rubro);

    void editarRubro(Rubro r);

    void guardarRubro(Rubro r);

}
