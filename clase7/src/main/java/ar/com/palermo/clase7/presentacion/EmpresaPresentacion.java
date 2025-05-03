package ar.com.palermo.clase7.presentacion;

import ar.com.palermo.clase7.entidad.Empresa;
import ar.com.palermo.clase7.entidad.Rubro;
import ar.com.palermo.clase7.servicio.IEmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpresaPresentacion {

    @Autowired
    private IEmpresaServicio empresaServicio;

    public List<Empresa> obtenerEmpresas() {
        return empresaServicio.obtenerEmpresas();
    }

    public Empresa obtenerEmpresa(Long id_empresa) {
        return empresaServicio.obtenerEmpresa(id_empresa);
    }

    public void guardarEmpresa(Empresa e) {
        empresaServicio.guardarEmpresa(e);
    }

    public void eliminarEmpresa(Long id_empresa) {
        empresaServicio.eliminarEmpresa(id_empresa);
    }

    public void editarEmpresa(Empresa e) {
        empresaServicio.editarEmpresa(e);
    }

}
