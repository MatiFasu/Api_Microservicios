package ar.com.palermo.clase7.servicio.impl;

import ar.com.palermo.clase7.entidad.EmpleadoAdmin;
import ar.com.palermo.clase7.repositorio.IEmpleadoAdminRepositorio;
import ar.com.palermo.clase7.servicio.IEmpleadoAdminServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoAdminServicio implements IEmpleadoAdminServicio {

    @Autowired
    private IEmpleadoAdminRepositorio adminRepo;

    @Override
    public List<EmpleadoAdmin> obtenerEmpleadosAdmin() {
        return (List<EmpleadoAdmin>) adminRepo.findAll();
    }

    @Override
    public EmpleadoAdmin obtenerEmpleadoAdmin(Long id_empleado) {
        return adminRepo.findById(id_empleado).orElse(null);
    }

    @Override
    public void eliminarEmpleadoAdmin(Long id_empleado) {
        adminRepo.deleteById(id_empleado);
    }

    @Override
    public void editarEmpleadoAdmin(EmpleadoAdmin e) {
        this.adminRepo.save(e);
    }

    @Override
    public void guardarEmpleadoAdmin(EmpleadoAdmin e) {
        adminRepo.save(e);
    }
}
