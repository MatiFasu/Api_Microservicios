package ar.com.palermo.clase7.presentacion;

import ar.com.palermo.clase7.entidad.EmpleadoFijo;
import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.servicio.IEmpleadoFijoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpleadoFijoPresentacion {

    @Autowired
    private IEmpleadoFijoServicio empleadoFijoServicio;

    public List<EmpleadoFijo> obtenerEmpleadosFijos() {
        return empleadoFijoServicio.obtenerEmpleadosFijos();
    }

    public EmpleadoFijo obtenerRubro(Long id_empleado) {
        return empleadoFijoServicio.obtenerEmpleadoFijo(id_empleado);
    }

    public void guardarRubro(EmpleadoFijo e) {
        empleadoFijoServicio.guardarEmpleadoFijo(e);
    }

    public void eliminarRubro(Long id_empleado) {
        empleadoFijoServicio.eliminarEmpleadoFijo(id_empleado);
    }

    public void editarRubro(EmpleadoFijo e) {
        empleadoFijoServicio.editarEmpleadoFijo(e);
    }

}
