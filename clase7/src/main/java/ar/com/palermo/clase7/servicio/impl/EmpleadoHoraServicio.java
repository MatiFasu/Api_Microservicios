package ar.com.palermo.clase7.servicio.impl;

import ar.com.palermo.clase7.entidad.EmpleadoHora;
import ar.com.palermo.clase7.repositorio.IEmpleadoHoraRepositorio;
import ar.com.palermo.clase7.servicio.IEmpleadoHoraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoHoraServicio implements IEmpleadoHoraServicio {

    @Autowired
    private IEmpleadoHoraRepositorio empleadoHoraRepo;

    @Override
    public List<EmpleadoHora> obtenerEmpleadosHora() {
        return (List<EmpleadoHora>) empleadoHoraRepo.findAll();
    }

    @Override
    public EmpleadoHora obtenerEmpleadoHora(Long id_empleado) {
        return empleadoHoraRepo.findById(id_empleado).orElse(null);
    }

    @Override
    public void eliminarEmpleadoHora(Long id_empleado) {
        empleadoHoraRepo.deleteById(id_empleado);
    }

    @Override
    public void editarEmpleadoHora(EmpleadoHora e) {
        this.empleadoHoraRepo.save(e);
    }

    @Override
    public void guardarEmpleadoHora(EmpleadoHora e) {
        empleadoHoraRepo.save(e);
    }
}
