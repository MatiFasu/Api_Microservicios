package ar.com.palermo.clase7.presentacion;

import ar.com.palermo.clase7.entidad.EmpleadoAdmin;
import ar.com.palermo.clase7.entidad.Empresa;
import ar.com.palermo.clase7.servicio.IEmpleadoAdminServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpleadoAdminPresentacion {

    @Autowired
    private IEmpleadoAdminServicio adminServicio;

    public List<EmpleadoAdmin> obtenerAdmins() {
        return adminServicio.obtenerEmpleadosAdmin();
    }

    public EmpleadoAdmin obtenerAdmin(Long id_empleado) {
        return adminServicio.obtenerEmpleadoAdmin(id_empleado);
    }

    public void guardarAdmin(EmpleadoAdmin e) {
        adminServicio.guardarEmpleadoAdmin(e);
    }

    public void eliminarAdmin(Long id_empleado) {
        adminServicio.eliminarEmpleadoAdmin(id_empleado);
    }

    public void editarAdmin(EmpleadoAdmin e) {
        adminServicio.editarEmpleadoAdmin(e);
    }

}
