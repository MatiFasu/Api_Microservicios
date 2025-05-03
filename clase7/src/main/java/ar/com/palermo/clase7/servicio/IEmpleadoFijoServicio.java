package ar.com.palermo.clase7.servicio;

import ar.com.palermo.clase7.entidad.EmpleadoFijo;

import java.util.List;

public interface IEmpleadoFijoServicio {

    List<EmpleadoFijo> obtenerEmpleadosFijos();

    EmpleadoFijo obtenerEmpleadoFijo(Long id_empleado);

    void eliminarEmpleadoFijo(Long id_empleado);

    void editarEmpleadoFijo(EmpleadoFijo e);

    void guardarEmpleadoFijo(EmpleadoFijo e);

}
