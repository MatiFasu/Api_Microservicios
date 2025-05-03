package ar.com.palermo.clase7.presentacion;

import ar.com.palermo.clase7.entidad.EmpleadoHora;
import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.servicio.IEmpleadoHoraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpleadoHoraPresentacion {

    @Autowired
    private IEmpleadoHoraServicio empleadoHoraServicio;

    public List<EmpleadoHora> obtenerEmpleadosHora() {
        return empleadoHoraServicio.obtenerEmpleadosHora();
    }

    public EmpleadoHora obtenerEmpleadoHora(Long id_empleado) {
        return empleadoHoraServicio.obtenerEmpleadoHora(id_empleado);
    }

    public void guardarRubro(EmpleadoHora e) {
        empleadoHoraServicio.guardarEmpleadoHora(e);
    }

    public void eliminarRubro(Long id_empleado) {
        empleadoHoraServicio.eliminarEmpleadoHora(id_empleado);
    }

    public void editarRubro(EmpleadoHora e) {
        empleadoHoraServicio.editarEmpleadoHora(e);
    }

}
