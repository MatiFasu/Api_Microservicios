package ar.com.palermo.clase7.servicio;

import ar.com.palermo.clase7.entidad.EmpleadoAdmin;

import java.util.List;

public interface IEmpleadoAdminServicio {

    List<EmpleadoAdmin> obtenerEmpleadosAdmin();

    EmpleadoAdmin obtenerEmpleadoAdmin(Long id_empleado);

    void eliminarEmpleadoAdmin(Long id_empleado);

    void editarEmpleadoAdmin(EmpleadoAdmin e);

    void guardarEmpleadoAdmin(EmpleadoAdmin e);

}
