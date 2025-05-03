package ar.com.palermo.clase7.servicio.impl;

import ar.com.palermo.clase7.entidad.EmpleadoFijo;
import ar.com.palermo.clase7.repositorio.IEmpleadoFijoRepositorio;
import ar.com.palermo.clase7.servicio.IEmpleadoFijoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoFijoServicio implements IEmpleadoFijoServicio {

    @Autowired
    private IEmpleadoFijoRepositorio empleadoFijoRepo;

    @Override
    public List<EmpleadoFijo> obtenerEmpleadosFijos() {
        return (List<EmpleadoFijo>) empleadoFijoRepo.findAll();
    }

    @Override
    public EmpleadoFijo obtenerEmpleadoFijo(Long id_empleado) {
        return empleadoFijoRepo.findById(id_empleado).orElse(null);
    }

    @Override
    public void eliminarEmpleadoFijo(Long id_empleado) {
        empleadoFijoRepo.deleteById(id_empleado);
    }

    @Override
    public void editarEmpleadoFijo(EmpleadoFijo e) {
        this.empleadoFijoRepo.save(e);
    }

    @Override
    public void guardarEmpleadoFijo(EmpleadoFijo e) {
        empleadoFijoRepo.save(e);
    }
}
