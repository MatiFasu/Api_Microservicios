package ar.com.palermo.clase7.servicio.impl;

import ar.com.palermo.clase7.entidad.Empleado;
import ar.com.palermo.clase7.entidad.Empresa;
import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.repositorio.IEmpresaRepositorio;
import ar.com.palermo.clase7.servicio.IEmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServicio implements IEmpresaServicio {

    @Autowired
    private IEmpresaRepositorio empresaRepo;


    @Override
    public List<Empresa> obtenerEmpresas() {
        return (List<Empresa>) empresaRepo.findAll();
    }

    @Override
    public Empresa obtenerEmpresa(Long id_empresa) {
        return empresaRepo.findById(id_empresa).orElse(null);
    }

    @Override
    public void eliminarEmpresa(Long id_empresa) {
        empresaRepo.deleteById(id_empresa);
    }

    @Override
    public void editarEmpresa(Empresa e) {
        this.empresaRepo.save(e);
    }

    @Override
    public void guardarEmpresa(Empresa e) {
        empresaRepo.save(e);
    }
}
