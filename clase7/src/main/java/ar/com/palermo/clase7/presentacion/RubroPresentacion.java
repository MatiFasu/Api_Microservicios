package ar.com.palermo.clase7.presentacion;

import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.servicio.IRubroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RubroPresentacion {

    @Autowired
    private IRubroServicio rubroServicio;

    public List<Rubro> obtenerRubros() {
        return rubroServicio.obtenerRubros();
    }

    public Rubro obtenerRubro(Long id_rubro) {
        return rubroServicio.obtenerRubro(id_rubro);
    }

    public void guardarRubro(Rubro r) {
        rubroServicio.guardarRubro(r);
    }

    public void eliminarRubro(Long id_rubro) {
        rubroServicio.eliminarRubro(id_rubro);
    }

    public void editarRubro(Rubro r) {
        rubroServicio.editarRubro(r);
    }

}
