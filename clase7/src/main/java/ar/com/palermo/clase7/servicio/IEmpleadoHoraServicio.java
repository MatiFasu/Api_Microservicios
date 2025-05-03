package ar.com.palermo.clase7.servicio;

import ar.com.palermo.clase7.entidad.EmpleadoHora;

import java.util.List;

public interface IEmpleadoHoraServicio {

    List<EmpleadoHora> obtenerEmpleadosHora();

    EmpleadoHora obtenerEmpleadoHora(Long id_empleado);

    void eliminarEmpleadoHora(Long id_empleado);

    void editarEmpleadoHora(EmpleadoHora e);

    void guardarEmpleadoHora(EmpleadoHora e);

}
