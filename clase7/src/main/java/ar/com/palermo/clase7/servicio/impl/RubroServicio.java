package ar.com.palermo.clase7.servicio.impl;

import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.repositorio.IRubroRepositorio;
import ar.com.palermo.clase7.servicio.IRubroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroServicio implements IRubroServicio {

    @Autowired
    private IRubroRepositorio rubroRepo;

    @Override
    public List<Rubro> obtenerRubros() {
        return (List<Rubro>) rubroRepo.findAll();
    }

    @Override
    public Rubro obtenerRubro(Long id_rubro) {
        return rubroRepo.findById(id_rubro).orElse(null);
    }

    @Override
    public void eliminarRubro(Long id_rubro) {
        rubroRepo.deleteById(id_rubro);
    }

    @Override
    public void editarRubro(Rubro r) {
        this.guardarRubro(r);
    }

    @Override
    public void guardarRubro(Rubro r) {
        rubroRepo.save(r);
    }
}
